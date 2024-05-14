package zerheri.fatimazahrae.exam_final_sysdist.services;

import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Equipement;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Reservation;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Salle;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EmployeRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EquipementRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.ReservationRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.SalleRepository;

public class RESTfulService  implements IRESTfulService{
    private EmployeRepository employeRep;
    private ReservationRepository reservationRep;
    private EquipementRepository equipementRep;
    private SalleRepository salleRep;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRep.save(employe);
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRep.save(reservation);
    }

    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return equipementRep.save(equipement);
    }

    @Override
    public Salle saveSalle(Salle salle) {
        return salleRep.save(salle);
   }

}
