import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PokemonGeneratorService {

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

  //Our first AJAX call in Angular!
  capturePokemon(): Observable<string>{

    return this.httpCli.get<string>(this.url);

  }

  sayHello(){
    return 'hello';
  }


  //Our service needs another external service. 
  //HttpClient: this will abstract away and manage our ajax calls. 
  constructor(private httpCli: HttpClient) { }
}
