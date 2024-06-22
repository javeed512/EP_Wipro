import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { PaymentComponent } from './payment/payment.component';

const routes: Routes = [
                    
                      {path:"home",component:HomeComponent},
                      {path:"contactus/:username/:pwd",component:ContactusComponent},
                      {path:"aboutus",component:AboutusComponent},
                      {path:'',redirectTo:"home",pathMatch:"full"},
                      {path:"back",redirectTo:"home",pathMatch:'full'},
                      {path:"payment/:amount",component:PaymentComponent}



               ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
