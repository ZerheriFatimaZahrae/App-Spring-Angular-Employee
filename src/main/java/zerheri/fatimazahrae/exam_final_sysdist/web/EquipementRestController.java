package zerheri.fatimazahrae.exam_final_sysdist.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Equipement;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EmployeRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EquipementRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class EquipementRestController {
    private EquipementRepository equipementRepository;

    @GetMapping("/equipements")
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }

    @GetMapping(path = "/equipements/{id}")
    public Equipement getEquipement(@PathVariable Long id){
        return equipementRepository.findById(id).orElse(null);
    }
}
