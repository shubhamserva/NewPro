import { Component, OnInit } from '@angular/core';
import{AuthServiceService} from '../auth-service.service'
import { Userdata } from '../shared/userdata';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  subsid;
  userinfo: Userdata;
  constructor(private service:AuthServiceService) { }

  ngOnInit() {this.subsid=''}

  getinfo()
  { 
    console.log("here in get info "+this.subsid);
    this.service.getinfo(this.subsid).subscribe(
      (data) =>{ 
        this.userinfo = data as Userdata;
        console.log(this.userinfo.totalCost);
      });
    
  }
  
}

