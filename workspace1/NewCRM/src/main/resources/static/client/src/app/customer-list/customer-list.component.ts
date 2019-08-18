import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
export interface Customer {
  id: string;
  name : string;
  mobile: string;
  address: string;

}
@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  constructor(private http: HttpClient) { }

  ngOnInit() {
    var url="http://localhost:8080/customers";
    this.http.get<Customer[]>(url).subscribe(data=>{
      this.customers=data;
      console.log(data);
    })
  }

}
