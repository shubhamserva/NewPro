import { Component, OnInit } from '@angular/core';
import{AuthServiceService} from '../auth-service.service'

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

    subsid:number;
    channel:String;
    channelname=[];


    selectChangeHandler (event: any)
    {
      this.channel = event.target.value;
      console.log(this.channel);
    }
    constructor(private service:AuthServiceService) { }
    

  ngOnInit() {
  }

  unsubscribe()
  {
    var data1 = {'id':this.subsid,
    'channel':this.channel}
    this.service.unsubscribe(JSON.stringify(data1)).subscribe((data)=>console.log(data));
  }
  getchannel()
  {
   // console.log(this.service.getchannels(this.subsid + "here in get channel method"));
    this.service.getchannels(this.subsid).subscribe((data) =>{this.channelname = data;console.log(this.channelname)});

  }

}
