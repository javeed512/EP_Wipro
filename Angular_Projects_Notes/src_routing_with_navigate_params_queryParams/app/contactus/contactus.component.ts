import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent {

       myname = "";
       mypassword ="";

      constructor(private route:ActivatedRoute){

          this.route.params.subscribe((inputs)=>{
            
                          this.myname =  inputs['username'];
                             this.mypassword = inputs['pwd'];
                        
                        
                        });

      }





}
