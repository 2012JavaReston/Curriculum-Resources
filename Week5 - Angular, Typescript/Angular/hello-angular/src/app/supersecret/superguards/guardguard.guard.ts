import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { PlanetGeneratorService } from 'src/app/shared/services/planet-generator.service';
import { ActivatedRoute } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class GuardguardGuard implements CanActivate {
  access = false;
  constructor(private planetService: PlanetGeneratorService){

  }
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    
    //Guard will return true or false

    /**
     * You'll definietly have something more complex
     */

    // // console.log(state.toString());
    // console.log(route.url[1].path);
    // console.log(this.planetService.getPlanets()[0].name);
    
     //IF profile path is queal to "Earth", the first element in my list, then I should have access!
    // if(route.url[1].path 
    //   == this.planetService.getPlanets()[0].name){
    //     this.access = true;
    //     console.log("hello!")
    //   }
     
    //   return this.access;
    return true;
  }
  
}
