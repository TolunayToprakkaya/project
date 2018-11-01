import { Injectable } from '@angular/core';
import {Product} from "../models/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [
    {
      name: 'Televizyon',
      part: 'Working',
      createdAt: new Date()
    },
    {
      name: 'Bilgisayar',
      part: 'Working',
      createdAt: new Date()
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
