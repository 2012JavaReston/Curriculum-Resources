import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { StarsComponent } from './shared/stars/stars.component';
import { FormsModule } from '@angular/forms';
import { ColorDirectiveDirective } from './shared/color-directive.directive';
import { PrependpipePipe } from './shared/prependpipe.pipe';
import { PlanetGeneratorService } from './shared/services/planet-generator.service';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProfileComponent } from './profile/profile.component';

//This is a decorator (Again) in Angular, like annotations in Java
//NgModule specifies that this is a confiugration class!
@NgModule({
  declarations: [ //used for declaring components, (custom) directive and pipes
    AppComponent,
    TestComponent,
    PlanetListComponent,
    StarsComponent,
    ColorDirectiveDirective,
    PrependpipePipe,
    WelcomeComponent,
    ProfileComponent
  ],
  imports: [ //used to import external modules
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [ //used to declare services, the provider tells the Injector which objects it needs to create and maintain.
      PlanetGeneratorService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
