import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  constructor(private routerMod: Router) { }

  user = "bobby";

  ngOnInit(): void {
  }

  pageButtonClick(){
    // this.routerMod.navigate(['/planets']);
    // this.routerMod.navigate(['/profile/', this.user])
    this.routerMod.navigate([`/profile/${this.user}`])
  }

}
