package zerheri.fatimazahrae.exam_final_sysdist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor @Builder
public class Equipement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom;
    private int poids;
    private EquipementType type;
    private String catalogue;
    @ManyToMany
    private List<Reservation> reservations=new ArrayList<>();
}
