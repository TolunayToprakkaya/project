/*
import { Injectable } from '@angular/core';
import {ProductDetail} from "../models/productDetail";

var now = new Date();
var overhaulDate = new Date();
overhaulDate.setDate(now.getDate() + 10);

@Injectable({
  providedIn: 'root'
})
export class ProductDetailService {

  productDetails: ProductDetail[]=[
    {
      name: 'Cep Telefonu',
      part: 'Hasarlı',
      createdAt: now,
      overhaulDate: overhaulDate
    },
    {
      name: 'Kombi',
      part: 'İade',
      createdAt: now,
      overhaulDate: overhaulDate
    }
  ];

  constructor() { }

  GetProductDetails(){
    return this.productDetails;
  }

  RemoveProductDetail(productDetail: ProductDetail){
    const index = this.productDetails.indexOf(productDetail);
    this.productDetails.splice(index, 1);
  }

}
*/
