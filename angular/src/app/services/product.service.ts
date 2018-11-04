/*
import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import { throwError } from 'rxjs';


import {map, catchError} from "rxjs/operators";
import { Observable} from "rxjs/index";
import {Product} from "../models/product";

@Injectable()
export class ProductService {

  private baseUrl: string = 'http://localhost:8080/api/v1';
  private headers = new Headers({'Content-Type': 'application/json'});
  private options = new RequestOptions({headers:this.headers});

  constructor(private _http: Http) { }

  findAll(){
    return this._http.get(this.baseUrl+'/products', this.options).pipe(map((response: Response)=> response.json())).pipe(
      catchError(this.errorHandler)
    )
  }

  save(product:Product){
    return this._http.post(this.baseUrl+'/productDetails',JSON.stringify(product), this.options).pipe(map((response: Response)=> response.json())).pipe(
      catchError(this.errorHandler)
    )
  }

  delete(id:String){
    return this._http.get(this.baseUrl+'/products/'+id, this.options).pipe(map((response: Response)=> response.json())).pipe(
      catchError(this.errorHandler)
    )
  }

  errorHandler(error: Response){
    return Observable.throw(error || "Server Error");
  }

}
*/
