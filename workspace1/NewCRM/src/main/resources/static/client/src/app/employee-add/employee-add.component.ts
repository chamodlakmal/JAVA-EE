import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { HttpClient, HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  name = new FormControl();
  email = new FormControl();
  mobile = new FormControl();
  password = new FormControl();
  constructor(private http:HttpClient) { }

  ngOnInit() {
  }
  save(){
    let body =new HttpParams({
      fromObject:{
        'name':this.name.value,
        'email':this.email.value,
        'mobile':this.mobile.value,
        'password':this.password.value
      }
      
    });
    this.http.post<any>('http://localhost:8080/employee',body).subscribe(data=>{
      console.log(data);
      alert('Saved Successfully !');
    });

  }

}
