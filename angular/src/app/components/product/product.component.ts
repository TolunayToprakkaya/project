import { Component, OnInit } from '@angular/core';

import {Headers,Http} from "@angular/http";
import {Product} from "../../models/product";

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
  private headers = new Headers({'Content-Type': 'application/json'});
  productDetailObj: object ={};

  save(product: Product): Promise<Product>{
    if(confirm( product.name + " Ürünü Bakıma Alıcaksınız Emin Misin?")) {
      this.productDetailObj = {
        "createDate": now,
        "returnDate": returnDate,
        "detailPart": "Hasarli",
        "product": product
      };
      return this.http.post("http://localhost:8080/api/v1/productDetails", this.productDetailObj, {headers: this.headers})
        .toPromise()
        .then(res => res.json() as Product);
    }
  };

  ngOnInit(): void {
    this.findAll();
  }

}
