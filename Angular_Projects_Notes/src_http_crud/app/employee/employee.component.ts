import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { Observable } from 'rxjs';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {


       empList: Employee[] = [];

      emp: Employee = {id:0,ename:"",salary:0} ;
      constructor(private _service:EmployeeService){



      }

      getAllEmployees(){

   this._service.getAllEmployees().subscribe((inputs)=>{ this.empList = inputs });



      }

      createEmployee(data:Employee){

        this._service.createEmployee(data).subscribe((input)=>{console.log(input)});


      }


      searchEmployee(data:any){

            console.log(data);

            this._service.searchEmployee(data.id).subscribe((input)=>{ this.emp = input; });

      }



      deleteEmployee(id:number){


          this._service.deleteEmployee(id).subscribe((input)=>{console.log("deleted record "+input)});


      }


}
