import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit, OnChanges {

  myValue: string = 'Watermelon';
  staticy: string = "another fruit"
  
  changeToFruit(){
    this.staticy = "Blood Orange!";
  }
  constructor() { }

  ngOnChanges(changes: SimpleChanges): void {
    console.log("I'm changing!")
  }

  ngOnInit(): void {
  }

}
