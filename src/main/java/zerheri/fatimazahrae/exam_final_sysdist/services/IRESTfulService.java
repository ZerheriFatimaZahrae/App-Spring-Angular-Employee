package zerheri.fatimazahrae.exam_final_sysdist.services;

import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Equipement;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Reservation;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Salle;

public interface IRESTfulService {
    Employe saveEmploye(Employe employe);
    Reservation saveReservation(Reservation reservation);
    Equipement saveEquipement(Equipement equipement);
    Salle saveSalle(Salle salle);

}
