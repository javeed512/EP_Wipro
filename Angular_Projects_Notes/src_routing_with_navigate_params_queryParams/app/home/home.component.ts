import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {


    amount = 0;

    constructor(private router:Router){


    }





      doPayment(){

        console.log('navigating to payment page from home component');

        this.router.navigate(['/payment/'+this.amount]);  
          // this navigate method will route request from home page to payment page along with one 							
        	          // parameter amount

      }


}
