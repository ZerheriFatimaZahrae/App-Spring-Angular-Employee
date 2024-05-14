package zerheri.fatimazahrae.exam_final_sysdist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
    Employe findByNom(String nom);
}
