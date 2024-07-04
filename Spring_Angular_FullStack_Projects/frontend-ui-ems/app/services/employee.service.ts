import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }


    

   //baseURL:string = "http://localhost:3000/employees";



   baseURL:string = 'http://localhost:9090/api/employees';

    getAll():Observable<Employee[]>{

        return this.http.get<Employee[]>(this.baseURL+"/getall");


    }

    insert(body:Employee):Observable<Employee>{

      console.log(body);

        return this.http.post<Employee>(this.baseURL+"/add",body);

    }

    delete(eid:number):Observable<string>{

      return  this.http.delete<string>(this.baseURL+`/deletebyid/${eid}`);

    }


    find(eid:number):Observable<Employee>{


      console.log("service "+eid)
     return this.http.get<Employee>(this.baseURL+"/getbyid/"+eid);  // data is id

    }


}
