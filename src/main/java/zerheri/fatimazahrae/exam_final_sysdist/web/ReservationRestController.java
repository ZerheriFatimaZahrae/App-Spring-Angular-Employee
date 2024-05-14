package zerheri.fatimazahrae.exam_final_sysdist.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Reservation;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Salle;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EmployeRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.ReservationRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ReservationRestController {
    private ReservationRepository reservationRepository;

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @GetMapping(path = "/reservations/{id}")
    public Reservation getReservation(@PathVariable Long id){
        return reservationRepository.findById(id).orElse(null);
    }
    @GetMapping(path ="/reservations/{id}/employes")
    public List<Reservation> getReservationByEmployeId(@PathVariable Long id){
        return reservationRepository.findByEmployeId(id);
    }

    @GetMapping(path ="/reservations/{id}/salles")
    public List<Reservation> getReservationBySalleIdentifier(@PathVariable Long id){
        return reservationRepository.findBySalleId(id);
    }
    @GetMapping(path ="/reservations/{numero}/salle")
    public List<Reservation> getReservationBySalleCode(@PathVariable String numero){
        return reservationRepository.findBySalleNumero(numero);
    }
}
