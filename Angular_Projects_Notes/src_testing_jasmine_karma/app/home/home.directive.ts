import { Directive } from '@angular/core';

@Directive({
  selector: '[appHome]'
})
export class HomeDirective {

  constructor() { }

  isValid(){

    return true;

  }



}
