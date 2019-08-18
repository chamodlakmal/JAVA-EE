import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { HttpParams, HttpClient } from '@angular/common/http';
import { Customer } from '../customer-list/customer-list.component';
import { Employee } from '../employee-list/employee-list.component';

@Component({
  selector: 'app-task-add',
  templateUrl: './task-add.component.html',
  styleUrls: ['./task-add.component.css']
})
export class TaskAddComponent implements OnInit {

  name=new FormControl();
  description=new FormControl();
  photo=new FormControl();
  customer=new FormControl();
  employee=new FormControl();
  constructor(private http:HttpClient) { }
  employees: Employee[] = [];
  customers: Customer[] = [];
  ngOnInit() {
    var url="http://localhost:8080/employees";
    this.http.get<Employee[]>(url).subscribe(data=>{
      this.employees=data;
      console.log(data);
    })
    var url1="http://localhost:8080/customers";
    this.http.get<Customer[]>(url1).subscribe(data1=>{
      this.customers=data1;
      console.log(data1);
    })
    
  }
  save(){
    let body =new HttpParams({
      fromObject:{
        'name':this.name.value,
        'description':this.description.value,
        'photo':this.photo.value,
        'customer':this.customer.value,
        'employee':this.employee.value,
        'complete':'false'
      }
      
    });
    this.http.post<any>('http://localhost:8080/task',body).subscribe(data=>{
      console.log(data);
      alert('Saved Successfully !');
    });

  }

}
