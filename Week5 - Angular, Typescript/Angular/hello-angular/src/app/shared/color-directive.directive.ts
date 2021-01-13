import { Directive, ElementRef, HostListener, Injectable } from '@angular/core';

/**
 * 
 * A directive is a marker on an element which allows specified behaviour to be attached to that element. 
 * This specified behaviour can include, removing elements from the DOM under certain circumstances (*ngIf)
 * 
 * The are 2 types: structural and attribute diredctives. 
 * 
 * Structureal : add, remove or manipulate the position of elements. Will be preceded by an *.
 * 
 * An attribute directive will change the apperance or behaiour of a DOM element. 
 * A common example of an attribute directvie is ngStyle
 * 
 * We're going to make our own one. 
 */

//This decorator specifies the class to be a directive. 

@Injectable()
@Directive({
  selector: '[appColorDirective]'
})
export class ColorDirectiveDirective {

  constructor(private element: ElementRef) { }

  
  //defines the event that will cause this function to be invoked!
  @HostListener('mouseenter') onMouseEnter(){

    //Get the element's text value 

    let textStuff: string = this.element.nativeElement.innerText;

    textStuff = textStuff.toLowerCase();

    console.log(textStuff);

    if(textStuff.toLowerCase().indexOf("earth")!=-1){
      this.element.nativeElement.style.color = "ForestGreen";
    } else {
      this.element.nativeElement.style.color = "Crimson";
    }

  }

}
