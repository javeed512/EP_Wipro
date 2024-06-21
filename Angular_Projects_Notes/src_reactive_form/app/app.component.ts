import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  registerForm!: FormGroup;

  submitted:boolean = false;

  constructor(private formBuilder:FormBuilder){



  }


  ngOnInit(): void {



     this.registerForm =     this.formBuilder.group({

      firstName:['',[Validators.required , Validators.minLength(5)] ],
      lastName:['',[Validators.required,Validators.pattern('[A-Z][a-z]{4}')] ],
       email:['',[Validators.required,Validators.email]],
  password:['',[Validators.required,Validators.minLength(5),Validators.maxLength(10)]]



     });

    
  }

    get f(){

      return  this.registerForm?.controls;
    }


    onSubmit(){
      this.submitted = true;
      // stop here if form is invalid
      if (this.registerForm.invalid) {
      return;
      }
      alert('SUCCESS!! :-)')

    }


}
