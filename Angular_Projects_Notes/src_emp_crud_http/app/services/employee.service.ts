import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }


   // baseURL:string = 'http://localhost:8181/api/employees/';

   baseURL:string = "http://localhost:3000/employees";

    getAll():Observable<Employee[]>{

        return this.http.get<Employee[]>(this.baseURL);


    }

    insert(body:Employee):Observable<Employee>{

      console.log(body);

        return this.http.post<Employee>(this.baseURL,body);

    }

    delete(eid:number):Observable<string>{

      return  this.http.delete<string>(this.baseURL+`/${eid}`);

    }


    find(data:number):Observable<Employee>{


      console.log("service "+data)
     return this.http.get<Employee>(this.baseURL+"/"+data);  // data is id

    }


}
