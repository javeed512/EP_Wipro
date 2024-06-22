import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

    receiveChildData:string = "";

    parentData:string  = 'This is Parent Data again';


    getChildData(data:any){

          console.log(data)

            this.receiveChildData = data;

    }


}
