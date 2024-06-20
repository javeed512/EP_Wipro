import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  name = "King";

  imageURL = "../assets/logo.png";

  city = "Hyderabad";



  getData(){

        alert('Hello , Click Event Occur');

  }


}
