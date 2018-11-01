import { Injectable } from '@angular/core';
import {Process} from "../models/process";

var now = new Date();
var overhaulDate = new Date();
overhaulDate.setDate(now.getDate() + 10);

@Injectable({
  providedIn: 'root'
})
export class ProcessService {

  processes: Process[]=[
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

  GetProcesses(){
    return this.processes;
  }

  RemoveProcess(process: Process){
    const index = this.processes.indexOf(process);
    this.processes.splice(index, 1);
  }

}
