import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

    @Input()
    myInput:string = "";


    @Output()
    eventEmitter:EventEmitter<string> = new EventEmitter<string>();

    myOutput:string = "This is Data from Child";


   sendChildData(){

        this.eventEmitter.emit(this.myOutput);

   }


}
