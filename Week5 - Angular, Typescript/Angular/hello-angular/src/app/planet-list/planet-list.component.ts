import { Component, OnInit } from '@angular/core';
import { PlanetGeneratorService } from '../shared/services/planet-generator.service';
import {Planet} from './planet';

@Component({
  selector: 'app-planet-list',
  templateUrl: './planet-list.component.html',
  styleUrls: ['./planet-list.component.css']
})
export class PlanetListComponent {

  //used to demo interpolation in the HTML page
  currentUser = 'Cosmanuat';

  //used to demo *ngIf
  showTable: boolean = true;

  toggleTable(): void{
    this.showTable = !this.showTable;
  }

  //dealing with images (property binding demo and another *ngIf)
  imageWidth = 100;
  imageMargin = 2;
  showImage: boolean = false;

  toggleImage(): void{
    this.showImage = !this.showImage;
  }

  //used to demo star event (communicating from child to parent components)
  starEventString: string;

  starEventWasTriggered(score: string): void {
    this.starEventString = score;
  }

  //Declaring an array of planets
  planets: Planet[];

  //This section is used to demo the filter function. 
  filteredPlanets: Planet[]; // if no filter then planets == filteredPlanets
  actualInputField: string = ''; // used to demo 2-way binding and to create a filter.

  get inputField(){
    return this.actualInputField;
  }

  set inputField(userInput: string){
    this.actualInputField = userInput;

    //Check if input is empty or not 
    //if it's empty it will return false, so the ternenry expression will just return the list of planets
    //if it is not empty, then it'll perform a filter and reutrn the filtered planets.

    // (expression to be evaluated)? this will trigger if true: this will trigger if false

    this.filteredPlanets = (this.actualInputField)?
            this.performFilter(this.inputField): this.planets;
  }
  
  //filter function
  performFilter(filterValue: string): Planet[]{

    //set the filter to lower case to make my life easier
    filterValue = filterValue.toLocaleLowerCase();

    return this.planets.filter( //inbuilt method where we define the filter function, 
                                //similar to the sort method inside of Java (Collections)

      //This function is checking that the filtevalue exists in the name of the planet
      (planet: Planet) => planet.name.toLowerCase().indexOf(filterValue)!=-1);
  }
  
  performFilterByScore(filterValue: number): Planet[]{

    return this.planets.filter( //inbuilt method where we define the filter function, 
                                //similar to the sort method inside of Java (Collections)

      //Checks taht the livibility is higher than the filter value. 
      (planet: Planet) => planet.livibility > filterValue);
  }




  constructor(private planetList: PlanetGeneratorService) {

    /**
     * There is an entity inside of Angular called "The Injector", the injector will create objects 
     * that are based of your services (that you've told about). Whenever it sees a constructor w/ a 
     * parameter of the SAME type as an object, the injector will inject the object into the constructor.
     */

    //Whenever this componet is created, it will have an attribute called planets
    //the planets will have a single planet for now.
    this.planets = planetList.getPlanets();

    this.filteredPlanets = this.planets;
   }

}
