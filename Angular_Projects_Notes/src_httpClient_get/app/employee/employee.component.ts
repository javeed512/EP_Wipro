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

      constructor(private _service:EmployeeService){



      }

      getAllEmployees(){

   this._service.getAllEmployees().subscribe((inputs)=>{ this.empList = inputs });



      }





}
