import { Component, OnInit } from '@angular/core';
import { BehaviourService } from '../behaviour.service';

@Component({
  selector: 'app-trigger',
  templateUrl: './trigger.component.html',
  styleUrls: ['./trigger.component.css']
})
export class TriggerComponent implements OnInit {

  capturedSpeechBubble: string = '';
  myInput: string = "apples";

  //trying with setters and getters
  changeSpeechBubbleWithSetter(){
    console.log("the button is being clicked!")
    this.behaveServ.mySpeechBubble = this.myInput;
  }

  getMeMySpeechBubbleUsingGetter(){
    this.capturedSpeechBubble = this.behaveServ.mySpeechBubble;
  }

  changeSpeechBubbleUsingBehave(){
    this.behaveServ.changeSpeechBubbleUsingBehave(this.myInput);
  }
  


  constructor(private behaveServ: BehaviourService) {

    // A constructor is not an Angular concept
    // Should only be used for initalising vlaues. 
    // If it's related with angular, chuck in ngOnInit
   }



  ngOnInit(): void {
    //similar to constructor, used with angular logic. (best practice)
    //using getter!
    // this.capturedSpeechBubble =this.behaveServ.mySpeechBubble; 

    //instead use a behavioural object!

    this.behaveServ.theObserv.subscribe(
      (data) => { this.capturedSpeechBubble = data}

    )

  }

}
