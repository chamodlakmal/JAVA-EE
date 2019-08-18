import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
export interface Employee {
  id: string;
  name : string;
  email: string;
  mobile: string;
  password: string;

}
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[] = [];
  constructor(private http: HttpClient) { }

  ngOnInit() {
    var url="http://localhost:8080/employees";
    this.http.get<Employee[]>(url).subscribe(data=>{
      this.employees=data;
      console.log(data);
    })
  }

}
