import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { BehaviourService } from '../behaviour.service';

@Component({
  selector: 'app-reaction',
  templateUrl: './reaction.component.html',
  styleUrls: ['./reaction.component.css']
})
export class ReactionComponent implements OnInit, OnChanges {

  capturedSpeechBubble : string = '';

  @Input() parentValue: string;
  @Input() anotherValue: string

  reactionSpecial: string; //not associate with parent
  

  constructor(private behaveServ: BehaviourService) { }


  ngOnChanges(changes: SimpleChanges): void {

    /**
     * Get's invoked when one of the bound values @Input changes. 
     */
    this.reactionSpecial = this.parentValue + this.anotherValue;
  }


  ngOnInit(): void {

    // this.reactionSpecial = this.parentValue + this.anotherValue;

   
    // this.capturedSpeechBubble = this.behaveServ.mySpeechBubble;

    this.behaveServ.theObserv.subscribe(
      (data) => { this.capturedSpeechBubble = data}

    )
  }

}
