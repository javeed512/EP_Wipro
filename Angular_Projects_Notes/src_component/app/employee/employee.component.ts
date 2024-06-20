import { Component, Inject, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements  OnInit {

  eid: number = 0;
  ename:string = "";
  salary:number =  0;

  empObj !: EmployeeComponent;

     
  ngOnInit(): void {
    
    const emp =      new  EmployeeComponent();

      emp.eid = 101;
      emp.ename = 'king';
      emp.salary = 45000;

    console.log(emp);

    this.empObj = emp;


    console.log('ngOnInit() method executed')

  }



   




}
