package zerheri.fatimazahrae.exam_final_sysdist.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Salle;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EmployeRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.SalleRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class SalleRestController {
    private SalleRepository salleRepository;

    @GetMapping("/salles")
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    @GetMapping(path = "/salles/{id}")
    public Salle getSalle(@PathVariable Long id){
        return salleRepository.findById(id).orElse(null);
    }
}
