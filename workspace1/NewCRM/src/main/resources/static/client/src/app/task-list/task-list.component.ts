import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams} from '@angular/common/http';
//1.
export interface Task {
  id: string;
  name : string;
  description: string;
  photo: string;
  complete: boolean;
  customer: any;
  employee : any;

}

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
  //2.
  tasks: Task[] = [];

  //3.


  constructor(private http: HttpClient) { }

  ngOnInit() {
    var url="http://localhost:8080/tasks";
    this.http.get<Task[]>(url).subscribe(data=>{
      this.tasks=data;
      console.log(data);
    })
  }

  complete(task)
  {
    task.complete= true;
    task.customer=task.customer.id;
    task.employee=task.employee.id;

    let body=new HttpParams({
      fromObject:task
    });

    this.http.put<Task[]>
    ('http://localhost:8080/task',body).subscribe(data=>{
      this.tasks=data;
    });
  }

}
