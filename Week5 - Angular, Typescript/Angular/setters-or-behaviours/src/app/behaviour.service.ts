import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

// @Injectable({
//   providedIn: 'root'
// })
export class BehaviourService {

  private speechBubble = 'my inner thoughts';

  get mySpeechBubble(){
    console.log("invasion of privacy!")
    return this.speechBubble;
  }

  set mySpeechBubble(temp: string){
    console.log("I'm using a setter!!")
    this.speechBubble = temp;
  }
  //Above is using setters and getters
  ///////////////////////////////////////////////////////


  private myBehaviouralSubject = new BehaviorSubject<string>(this.speechBubble) //used to publish data. 

  private castMyBehaviouralSubjectToObservable =
    this.myBehaviouralSubject.asObservable() // used to subscribe 

    changeSpeechBubbleUsingBehave(newSpeech: string){
      this.myBehaviouralSubject.next(newSpeech);
    }

    get theObserv(){
      return this.castMyBehaviouralSubjectToObservable;
    }

  constructor() { }
}
