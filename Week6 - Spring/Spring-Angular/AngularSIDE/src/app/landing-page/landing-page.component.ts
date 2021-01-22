import { IfStmt } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { AjaxSessionService } from '../ajax-session.service';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing-page.component.html',
  styleUrls: ['./landing-page.component.css']
})
export class LandingPageComponent implements OnInit {

  userDetails = '';
  loginMessage = '';
  logoutMessage = '';

  constructor(private myAjax: AjaxSessionService) { }

  ngOnInit(): void {
  }

  firstButton(){
    // this.userDetails  = "dummy data";

    this.myAjax.infoRequest().subscribe(


      data => {
        console.log(data)

        const ourField = "name";
        const ourField2 = "access";
        if(data[ourField2] == true ){
          /*
          redirect logic would go inside of here!
          */
        }
        this.userDetails = this.userDetails + " " + data[ourField];
      }
    )


  }

  secondButton(){
    // this.loginMessage = "login message"

    this.myAjax.loginRequest().subscribe(

      data => {
        console.log(data);

        const ourField = "message";
        this.loginMessage = this.loginMessage + " " + data[ourField];
      }

    )
  }

  thirdButton(){
    // this.logoutMessage = "logout message"

    this.myAjax.logoutRequest().subscribe(

     

      data => {
        console.log(data);
        this.logoutMessage = this.logoutMessage + " " + data.message;
      }

    )

  }

}
