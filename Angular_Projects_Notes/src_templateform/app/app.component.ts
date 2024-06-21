import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  

    eid:number = 0;
    ename:string = "";
    salary:number = 0;

    getFormData(data:any){

        console.log(data)


    }


}
