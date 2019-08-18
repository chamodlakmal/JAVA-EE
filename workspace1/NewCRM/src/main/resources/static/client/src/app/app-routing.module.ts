import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DashboardComponent} from './dashboard/dashboard.component';
import { TaskListComponent } from './task-list/task-list.component';
import { TaskAddComponent } from './task-add/task-add.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CustomerAddComponent } from './customer-add/customer-add.component';
import { EmployeeAddComponent } from './employee-add/employee-add.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
const routes: Routes = [
  {path: '', component: DashboardComponent},
  {path: 'task_list', component: TaskListComponent},
  {path: 'task_add', component: TaskAddComponent},
  {path: 'customer_list', component: CustomerListComponent},
  {path: 'customer_add', component: CustomerAddComponent},
  {path: 'employee_add', component: EmployeeAddComponent},
  {path: 'employee_list', component: EmployeeListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
