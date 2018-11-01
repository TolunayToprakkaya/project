import { Component, OnInit } from '@angular/core';
import {Process} from "../../models/process";
import {ProcessService} from "../../services/process.service";

@Component({
  selector: 'app-process',
  templateUrl: './process.component.html',
  styleUrls: ['./process.component.css']
})
export class ProcessComponent implements OnInit {

  processes: Process[];

  constructor(private processService: ProcessService) { }

  ngOnInit() {
    this.processes = this.processService.GetProcesses();
  }

  RemoveProces(process: Process){
    this.processService.RemoveProcess(process);
  }

}
