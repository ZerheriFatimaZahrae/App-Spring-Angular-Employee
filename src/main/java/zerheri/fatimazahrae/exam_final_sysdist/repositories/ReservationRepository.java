package zerheri.fatimazahrae.exam_final_sysdist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Reservation;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Salle;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    List<Reservation>  findByEmployeId(Long employeeId);
    List<Reservation>  findBySalleId(Long salleId);
    List<Reservation>  findBySalleNumero(String numero);
}
