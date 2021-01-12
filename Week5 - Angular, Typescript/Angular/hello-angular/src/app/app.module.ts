import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { PlanetListComponent } from './planet-list/planet-list.component';

//This is a decorator (Again) in Angular, like annotations in Java
//NgModule specifies that this is a confiugration class!
@NgModule({
  declarations: [ //used for declaring components (and pipes)
    AppComponent,
    TestComponent,
    PlanetListComponent
  ],
  imports: [ //used to import external modules
    BrowserModule,
    AppRoutingModule
  ],
  providers: [ //used to declare services. 

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
