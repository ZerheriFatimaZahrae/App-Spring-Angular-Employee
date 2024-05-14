package zerheri.fatimazahrae.exam_final_sysdist.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zerheri.fatimazahrae.exam_final_sysdist.entities.Employe;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EmployeRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class EmployeRestController {
    private EmployeRepository employeRepository;

    @GetMapping("/employes")
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    @GetMapping(path = "/employes/{id}")
    public Employe getEmploye(@PathVariable Long id){
        return employeRepository.findById(id).orElse(null);
    }
}
