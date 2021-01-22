import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Message{
  message : string;
}

export interface User{
  name: string;
  access: boolean;
}


@Injectable({
  providedIn: 'root'
})
export class AjaxSessionService {

  constructor(private myHttpClient: HttpClient) { }

  loginRequest(): Observable<string>{

    return this.myHttpClient.get<string>("http://localhost:9999/login",
      {withCredentials: true}
    );

  }

  logoutRequest(): Observable<Message>{
    return this.myHttpClient.get<Message>("http://localhost:9999/logout",
      {withCredentials: true}
    );

  }

  infoRequest(){
    return this.myHttpClient.get<string>("http://localhost:9999/getInfo",
      {withCredentials: true}
    );
  }
}
