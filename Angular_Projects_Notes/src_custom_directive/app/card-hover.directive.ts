import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appCardHover]'
})
export class CardHoverDirective {



  constructor(private e1:ElementRef , private renderer:Renderer2 ) {
      
   }


   @HostListener('mouseover')
   onMouseOver(){

      this.renderer.setStyle(this.e1.nativeElement,'background-color','red');
   

      alert('mouse is over the context');

      

   }

}
