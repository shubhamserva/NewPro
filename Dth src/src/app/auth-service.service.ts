import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Headers} from '@angular/http'
import { HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  }),
};
@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  private subscribeurl = "http://localhost:8080/Dth/Dth/setdata";
  private unsubscribeurl = "http://localhost:8080/Dth/Dth/unsubscribe";
  private getchannelurl = "http://localhost:8080/Dth/Dth/getchannels/";
  private getinfourl = "http://localhost:8080/Dth/Dth/getinfo/";
  constructor(private http:HttpClient)
   { }

   registeruser(user): Observable<any> 
   {
     console.log(user) ;
         return this.http.post(this.subscribeurl,user, httpOptions);
   }
   unsubscribe(data):Observable<any>
   { 
     console.log(data);
     return this.http.post(this.unsubscribeurl,data,httpOptions);
   }
   getchannels(id): Observable<any>
   {
      console.log(id + "here in service"+id);
      return this.http.get<any>(this.getchannelurl + id,httpOptions);
     // console.log("AFter service method");
   }
   getinfo(userid):Observable<any>
   {
    console.log("Here in getinfo of service method" +userid);
    return this.http.get<any>(this.getinfourl + userid);
   }
}
