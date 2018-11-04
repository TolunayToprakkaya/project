import { Component, OnInit } from '@angular/core';

import {Http} from "@angular/http";

var now = new Date();
var returnDate = new Date();
returnDate.setDate(now.getDate() + 10);

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(private http: Http){}

  products = [];

  findAll = function() {
    this.http.get("http://localhost:8080/api/v1/products").subscribe(
      (res: Response) => {
        this.products = res.json();
      })
  };

  productDetailObj: object ={};

  save = function (product) {
    console.log(product.id);
    if(confirm( product.name + " Ürünü Bakıma Alıcaksınız Emin Misin?")) {
      this.productDetailObj = {
        "createDate": now,
        "returnDate": returnDate,
        "detailPart": "Hasarli",
        "product_id": product.id
      };
      this.http.post("http://localhost:8080/api/v1/productDetails" , this.productDetailObj).subscribe((res: Response) => {
        console.log(res);
      })
    }
  };

  ngOnInit(): void {
    this.findAll();
  }

}
