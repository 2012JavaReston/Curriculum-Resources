import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ParentComponent } from './parent/parent.component';
import { TriggerComponent } from './trigger/trigger.component';
import { ReactionComponent } from './reaction/reaction.component';
import { BehaviourService } from './behaviour.service';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ParentComponent,
    TriggerComponent,
    ReactionComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [BehaviourService],
  bootstrap: [AppComponent]
})
export class AppModule { }
