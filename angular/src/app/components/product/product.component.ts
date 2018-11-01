import { Component, OnInit } from '@angular/core';
import {Product} from "../../models/product";
import {ProductService} from "../../services/product.service";

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products: Product[];

  constructor(private productService: ProductService) { }

  ngOnInit() {
    this.products = this.productService.GetProducts();
  }

  AddProduct(productText: HTMLInputElement, productPart: HTMLInputElement){
    const obj = {
      name: productText.value,
      part: productPart.value,
      createdAt: new Date()
    };
    this.productService.AddProduct(obj);
    productText.value = "";
    productPart.value = "";
  }

  RemoveProduct(product: Product){
    this.productService.RemoveProduct(product);
  }

}
