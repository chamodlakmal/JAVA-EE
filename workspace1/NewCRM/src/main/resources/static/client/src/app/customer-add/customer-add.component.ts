import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { HttpClient, HttpParams } from '@angular/common/http';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {

  //1  form control object per each input
  name = new FormControl();
  address = new FormControl();
  mobile = new FormControl();

  constructor(private http:HttpClient) { }

  ngOnInit() {
  }

  save(){
    let body =new HttpParams({
      fromObject:{
        'name':this.name.value,
        'address':this.address.value,
        'mobile':this.mobile.value
      }
      
    });
    this.http.post<any>('http://localhost:8080/customer',body).subscribe(data=>{
      console.log(data);
      Swal.fire('Saved Successfully !');
    });
  }

}
