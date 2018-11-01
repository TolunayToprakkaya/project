import { Injectable } from '@angular/core';
import {Product} from "../models/product";

var now = new Date();
var overhaulDate = new Date();
overhaulDate.setDate(now.getDate() + 10);

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [
    {
      name: 'Televizyon',
      part: 'Working',
      createdAt: now
    },
    {
      name: 'Bilgisayar',
      part: 'Working',
      createdAt: now
    }
  ];

  constructor() { }

  GetProducts(){
    return this.products;
  }

  AddProduct(obj){
    this.products.push(obj);
  }

  RemoveProduct(product: Product){
    const index = this.products.indexOf(product);
    this.products.splice(index, 1);
  }

}
