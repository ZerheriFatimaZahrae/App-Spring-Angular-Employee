package zerheri.fatimazahrae.exam_final_sysdist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor @Builder
public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String numero;

    private String nom;
    private int nombrePlace;
    private SalleType type;
}
