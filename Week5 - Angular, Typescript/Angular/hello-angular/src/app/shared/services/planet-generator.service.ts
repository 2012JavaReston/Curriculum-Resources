import { Injectable } from '@angular/core';
import { Planet } from 'src/app/planet-list/planet';

/**
 * 
 * @Injectable() tells angular to manage this entity, the PlanetGeneratorService class. 
 * 
 * You can also specify the same behaviour inside of app.modulte.ts. 
 * 
 * What is a service?
 *  In short, a service is a modularized functionality. We put some functionality into another 
 *  class so that it can be easily accessible to MANY other classes (reducing redundant code).
 * 
 * To create a service in Angular we need to :
 * 1. Create a TS class
 * 2. Register that service in the PROVIDERS section of the @ngModule 
 * 
 * @Injectable is not necessary, but if not defined in providers then we do need it. 
 * 
 * 
 */

@Injectable({
  providedIn: 'root'
})
export class PlanetGeneratorService {

  getPlanets(): Planet[]{

    return [
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

  constructor() { }
}
