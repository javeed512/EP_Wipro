import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private  _http:HttpClient) { }


  getAllEmployees():Observable<Employee[]>{


     return this._http.get<Employee[]>("http://localhost:3000/employees");

   


  }

     createEmployee(){

// empObj = {id:107,ename:"ravi",salary:40000}

     //return this._http.post("http://localhost:3000/employees",empObj);

     }




}
