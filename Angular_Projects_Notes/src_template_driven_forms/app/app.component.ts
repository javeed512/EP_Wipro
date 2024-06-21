import { Component } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
     emp: Employee = {'eid':0,'ename':"",'salary':0}


    getFormData(data:Employee){

        console.log(data);

        this.emp =  data;


    }


}
