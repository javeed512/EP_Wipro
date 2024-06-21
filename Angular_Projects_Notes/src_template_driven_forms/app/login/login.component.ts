import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {




  getLoginData(data:any){

      alert(data.username +" "+ data.password)


  }

}
