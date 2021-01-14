import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Poke {
  'id': number;
  'name': string;
  'sprites': any;
  'height': number
}



@Injectable({
  providedIn: 'root'
})
export class PokemonGeneratorService {

  private nameTheObject: object = {
    'id':'1',
    objectId: 2
  } 

  /**
   * Should start preparing for the ajzx call!
   */

   //We need a URL!
   private baseUrl = 'https://pokeapi.co/api/v2/pokemon/';
   private url = '';

   getUrl(): string{
     return this.url;
   }

   setUrl(pokeId: number){
     this.url = this.baseUrl + pokeId;
   }
  //

  sayHello(){
    return 'hello';
  }


  //Our service needs another external service. 
  //HttpClient: this will abstract away and manage our ajax calls. 
  constructor(private httpCli: HttpClient) { }

  //Our first AJAX call in Angular!
  capturePokemon(): Observable<string>{

    return this.httpCli.get<string>(this.url); //we're invoking the get method. 
  }

  actuallyCapturePokemon(): Observable<Poke>{
    return this.httpCli.get<Poke>(this.url);
  }


  /**
   * 
   * BAsically every front end application, it needs to be able to communicate with a server using 
   * the HTTP protocol. 
   * 
   * HttpClient module:
   *    This is a service from '@angular/common/http' 
   *    For us to levarage HttpClient, we need to import inside of our app.module.ts (inside of our imports)
   * 
   *    Offers us a lot of methods that return an Observable, request(), delete(), get(), post(), put(), options()
   * 
   * 
   * rxjs: 
   *    Reactive Etension JavaScript
   *    -It contains objects like Observable, Promises, BehavioralSubjects, etc. 
   *    - Has tools to make asynchornous and callback functionalities simpler.
   *  
   *    
   * 
   * Data Stream:
   *    Streams use a publisher-subscriber design pattern
   *    A publisher will "publish" data to the stream, THEN any suscriber will be 
   *    notified that new data has been passed through the stream. Imagine a stream of water, 
   *    wher you put a paper sail boat upstream (you're publishing the data), and any 
   *    entities (subscrbers) can access the paper sail boat downstream. 
   * 
   * Promises?
   *    Asyncrhonous operations, where you send of a requests, and you *promise* to get back to 
   *    me at some point. A promise will only expect 1 response, if you're expecting 20 responses, then 
   *    you're gonna need something different
   * 
   * What is an Observable? 
   *    An obserbable is used to publish information to a stream. In the publisher-subscriber design pattern. IT acts 
   *    as a publisher. After an observable publishes infromation to the stream, then ALL subscribers will be notified
   *    of the new data that has entered the stream. (the subscribers callback function will be then activated. )
   *  We don't know HOW MUCH DATA will be published. It could be 100,00 activations, or it could be 0. 
   * 
   * Observables and a promise. 
   *  Are both *different impletnetations of ajax. A promise will have 1 activation. 
   * 
   * Promise retrieves a SINGLE data object (usually a JSON)
   * Observables can retrieve 0 or more, we can't really know. 
   */

}



