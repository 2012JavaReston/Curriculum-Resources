import { Component, OnInit } from '@angular/core';

//This is a decorator, a decorater looks a lot like an annotation in Java
@Component({
  selector: 'app-test', //defines how the tag to select it will look like
  template: '<h1> Why hello there!</h1>', //defines the html file, i.e. the view
  styleUrls: ['./test.component.css'] //define the styling. 
})
export class TestComponent{ //export allows this class to be imported else where

  constructor() { }

}
