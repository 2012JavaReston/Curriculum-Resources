import { Component, EventEmitter, Input, OnInit, OnChanges, SimpleChanges, Output } from '@angular/core';
// import { EventEmitter } from 'events';

@Component({
  selector: 'app-stars',
  templateUrl: './stars.component.html',
  styleUrls: ['./stars.component.css']
})
export class StarsComponent implements OnChanges, OnInit {

  starWidth: number;

  /**
   * This line creates an attribute directive. 
   * This is a way for us to send information from parent to child
   */
  @Input() livibility: number;

  @Input() name: string;

  /**
   * This line creates a custom event to emit at teh parent componetn. 
   * This is a way for us to send infromation from child to parent. 
   */
  @Output() starClicked: EventEmitter<string> = new EventEmitter<string>();

  onStarClick(): void{
    this.starClicked.emit(`The livibility score is ${this.livibility}. (From the star component!)`)
  }

  constructor() {

    
   }
  ngOnChanges(changes: SimpleChanges): void {
    this.starWidth = this.livibility*70/5;
  }

  ngOnInit(): void {
  }

  /**
   * The lifecycle of a component in ANgular:
   * 
   * 1. Create component
   * 2. Render component
   *    3. Create and render Children (sub component)
   * 4. Apply and updates components may have - this is when the ngOnChange*( methods can be invoked.)
   * 5. Destroy component.
   * 
   * Lifecycle hook:
   *    Is a function that gets invoked at the lifecycle stages of the component.
   */

}
