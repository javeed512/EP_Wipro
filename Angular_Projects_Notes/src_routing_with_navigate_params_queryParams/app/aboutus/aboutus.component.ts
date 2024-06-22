import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent {

  paramList:any = [];

  constructor(private route:ActivatedRoute){

      this.route.queryParams.subscribe( 
            (inputs) => {
                this.paramList = inputs; 
                  console.log(this.paramList)
          
             } );

            

  }



}
