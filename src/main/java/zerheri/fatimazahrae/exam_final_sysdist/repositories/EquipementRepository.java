package zerheri.fatimazahrae.exam_final_sysdist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Equipement;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Reservation;

import java.util.List;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {

    Equipement findByNom(String nom);


}
