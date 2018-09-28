import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule,Routes} from '@angular/router';
import {HomeComponent} from './home/home.component';
import {SubscriptionComponent} from './subscription/subscription.component';
import {ViewComponent} from './view/view.component';
import {EditComponent} from './edit/edit.component';


const routes : Routes = 
[
  {path: '', redirectTo: 'home',pathMatch : 'full'},
  {path: 'home', component:HomeComponent,pathMatch:'full'},
  {path:'subs',component:SubscriptionComponent},
  {path:'view',component:ViewComponent},
  {path:'edit',component:EditComponent}
];



@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  declarations: [],
  exports:[ RouterModule]
})
export class AppRoutingModule { }
