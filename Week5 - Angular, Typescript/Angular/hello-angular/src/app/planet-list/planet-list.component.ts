import { Component, OnInit } from '@angular/core';
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

  //dealing with images (property binding demo and another *ngIf)
  imageWidth = 100;
  imageMargin = 2;
  showImage: boolean = false;


  planets: Planet[];

  toggleTable(): void{
    this.showTable = !this.showTable;
  }

  toggleImage(): void{
    this.showImage = !this.showImage;
  }

  constructor() {
    //Whenever this componet is created, it will have an attribute called planets
    //the planets will have a single planet for now.
    this.planets = [
      {
        name: 'Earth',
        image: 'https://images.unsplash.com/photo-1564053489984-317bbd824340?ixlib=rb-1.2.1&auto=format&fit=crop&w=2014&q=80',
        livibility: 5
      },
      {
        name:'Mars' ,
        image: 'https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg',
        livibility: 3
      },
      {
        name: 'Venus',
        image: 'https://upload.wikimedia.org/wikipedia/commons/a/a9/PIA23791-Venus-NewlyProcessedView-20200608.jpg',
        livibility: 4
      },
      {
        name: 'Mercury',
        image: 'http://dreamicus.com/data/mercury/mercury-06.jpg',
        livibility: 2
      },
      {
        name: 'Pluto',
        image: 'https://earthsky.org/upl/2019/11/Pluto-false-color-New-Horizons-2015-800x813.jpg',
        livibility: 1
      }
    ]

   }

}
