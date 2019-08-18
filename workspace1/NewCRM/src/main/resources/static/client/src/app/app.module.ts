import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EmployeeAddComponent } from './employee-add/employee-add.component';
import { TaskAddComponent } from './task-add/task-add.component';
import { TaskListComponent } from './task-list/task-list.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { CustomerAddComponent } from './customer-add/customer-add.component';
import { CustomerListComponent } from './customer-list/customer-list.component';

import { HttpClientModule } from '@angular/common/http';

import { FormsModule ,ReactiveFormsModule} from '@angular/forms'; 
@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    EmployeeAddComponent,
    TaskAddComponent,
    TaskListComponent,
    EmployeeListComponent,
    CustomerAddComponent,
    CustomerListComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
