package zerheri.fatimazahrae.exam_final_sysdist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor @Builder
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private LocalDate date;
    private String duree;
    private ReservationStatus statut;
    private String description;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private Salle salle;
    @ManyToMany(mappedBy = "reservations",fetch = FetchType.EAGER)
    private List<Equipement> equipements=new ArrayList<>();
}
