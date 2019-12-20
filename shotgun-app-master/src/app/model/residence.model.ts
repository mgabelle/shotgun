import { PartieCommune } from "./partie-commune.model";

export interface Residence {
  id: number;
  name: string;
  listePartieCommune?: Array<PartieCommune>;
}
