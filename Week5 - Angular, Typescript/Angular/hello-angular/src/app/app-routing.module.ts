import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PlanetListComponent } from './planet-list/planet-list.component';
import { ProfileComponent } from './profile/profile.component';
import { GuardguardGuard } from './supersecret/superguards/guardguard.guard';
import { WelcomeComponent } from './welcome/welcome.component';

//This specifes the mapping between our URLs and our components
const routes: Routes = [
  {
    path: 'planets',
    component: PlanetListComponent,

    /**
     * Route guarding, there are 5 different types of guards
     * CanActivate,
     * CanAtivateChild,
     * CanDeactivate,
     * CanLoad, 
     * Resolve
     */
    

  },
  {
    path: 'celestial',
    component: PlanetListComponent
  },
  {
    path: 'welcome',
    component: WelcomeComponent
  },
  {
    path: 'profile/:myPathVariable',
    component: ProfileComponent,
    canActivate: [GuardguardGuard]
  },
  {
    path: 'profile',
    redirectTo: 'profile/apples'
  },
  {
    path: '**',
    redirectTo: 'welcome',
    pathMatch:'full'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
