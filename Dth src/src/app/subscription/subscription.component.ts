  import { Component, OnInit } from '@angular/core';
  import{ AuthServiceService} from '../auth-service.service';
  import{SubsDetail} from '../shared/subscription';

@Component({
  selector: 'app-subscription',
  templateUrl: './subscription.component.html',
  styleUrls: ['./subscription.component.css']
})
export class SubscriptionComponent implements OnInit 
{
  subsdetails:SubsDetail;
  date1: Date;
  subsid: number ;
  channel: String;  
  selectChangeHandler (event: any)
  { 
    this.channel = event.target.value;
  }
  constructor(private auth:AuthServiceService){ }
  ngOnInit() {}
  subscribe()
  {
    alert("Subscribed Successfully");
    console.log("here in ts class "); 
    console.log("selected day is"+ this.date1 + " subs id :" +this.subsid   + "fer"+ this.channel) ;
    
    // this.subsdetails.channel = this.channel;
    // this.subsdetails.date = this.date1;
    // this.subsdetails.Id = this.subsid;
    var data = {'channelname':this.channel,
                'subsdate':this.date1,
                'subdId':this.subsid,
                }
    this.auth.registeruser(JSON.stringify(data))
    .subscribe(
      res=>console.log(res),
      err=> console.log(err)
    )
  }

}
