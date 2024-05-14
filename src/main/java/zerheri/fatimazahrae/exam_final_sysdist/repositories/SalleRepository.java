package zerheri.fatimazahrae.exam_final_sysdist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle,Long> {
    Salle findByNom(String nom);

}
