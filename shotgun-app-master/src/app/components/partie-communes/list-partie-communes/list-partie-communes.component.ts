import { PartieCommunesService } from "../../../services/partie-communes/partie-communes.service";
import { Component, OnInit } from "@angular/core";
import { PartieCommune } from "src/app/model/partie-commune.model";

@Component({
  selector: "app-list-partie-communes",
  templateUrl: "./list-partie-communes.component.html",
  styleUrls: ["./list-partie-communes.component.css"]
})
export class ListPartieCommunesComponent implements OnInit {
  public partieCommuneShotguns: Array<PartieCommune>;
  constructor(private partieCommunesService: PartieCommunesService) {
    this.partieCommunesService.partiesCommunes.subscribe((values: Array<PartieCommune>) => {
      this.partieCommuneShotguns = values;
    });
  }

  ngOnInit() {
    this.partieCommunesService.getPartiesCommunesShotguns();
  }
}
