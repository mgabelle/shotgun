import { ListResidencesComponent } from "./components/residences/list-residences/list-residences.component";
import { ShotgunsComponent } from "./components/shotguns/list-shotguns/shotguns.component";
import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { CreateShotgunComponent } from "./components/shotguns/create-shotgun/create-shotgun.component";
import { ListFamillesComponent } from "./components/familles/list-familles/list-familles.component";
import { ListPartieCommunesComponent } from "./components/partie-communes/list-partie-communes/list-partie-communes.component";


const routes: Routes = [
  {
    path: "",
    component: ShotgunsComponent
  },
  {
    path: "create",
    component: CreateShotgunComponent
  },
  {
    path: "familles",
    component: ListFamillesComponent
  },
  {
    path: "partie-communes",
    component: ListPartieCommunesComponent
  },
  {
    path: "residences",
    component: ListResidencesComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
