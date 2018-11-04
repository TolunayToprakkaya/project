import { Component, OnInit } from '@angular/core';

import {Http} from "@angular/http";

@Component({
  selector: 'app-productDetail',
  templateUrl: './productDetail.component.html',
  styleUrls: ['./productDetail.component.css']
})
export class ProductDetailComponent implements OnInit {

  constructor(private http: Http){}

  productDetails = [];
  id:string;
  private headers = new Headers({'Content-Type': 'application/json'});

  findAll = function () {
    this.http.get("http://localhost:8080/api/v1/productDetails").subscribe(
      (res: Response) => {
        this.productDetails = res.json();
      }
    )
  };

  delete = function (id) {
    if(confirm( id + " 'li Ürünü Sileceksin Emin Misin?")) {
      const url = `${"http://localhost:8080/api/v1/productDetails"}/${id}`;
      return this.http.delete(url, {headers: this.headers}).toPromise()
        .then(() => {
          this.findAll();
        })
    }
  };

  ngOnInit(): void {
    this.findAll();
  }

}
