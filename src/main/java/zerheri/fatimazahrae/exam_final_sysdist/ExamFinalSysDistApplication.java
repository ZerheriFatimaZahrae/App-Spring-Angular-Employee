package zerheri.fatimazahrae.exam_final_sysdist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zerheri.fatimazahrae.exam_final_sysdist.entities.*;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EmployeRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.EquipementRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.ReservationRepository;
import zerheri.fatimazahrae.exam_final_sysdist.repositories.SalleRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class ExamFinalSysDistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamFinalSysDistApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EmployeRepository employeRepository,
                                        EquipementRepository equipementRepository,
                                        ReservationRepository reservationRepository,
                                        SalleRepository salleRepository
                                        ) {
        return args -> {

            /// employe
            employeRepository.save(
                    Employe.builder()
                            .nom("Fatima zahrae")
                            .email("zerheri@gmail.com")
                            .build()

            );

            employeRepository.save(
                    Employe.builder()
                            .nom("Souad")
                            .email("souad@gmail.com")
                            .build()

            );
            employeRepository.save(
                    Employe.builder()
                            .nom("Mohmed")
                            .email("mohmed@gmail.com")
                            .build()

            );

            //Salles
            salleRepository.save(
                    Salle.builder()
                            .numero("112233")
                            .nom("salle1")
                            .nombrePlace(500)
                            .type(SalleType.TP)
                            .build()

            );

            salleRepository.save(
                    Salle.builder()
                            .numero(UUID.randomUUID().toString())
                            .nom("salle2")
                            .nombrePlace(300)
                            .type(SalleType.COURS)
                            .build()

            );

            salleRepository.save(
                    Salle.builder()
                            .numero("112244")
                            .nom("salle3")
                            .nombrePlace(100)
                            .type(SalleType.REUNION)
                            .build()

            );

            //Equipement

            equipementRepository.save(
                    Equipement.builder()
                            .nom("Projector")
                            .poids(500)
                            .type(EquipementType.VIDEO_PROJECTEUR)
                            .build()
            );
            equipementRepository.save(
                    Equipement.builder()
                            .nom("Camera")
                            .poids(500)
                            .type(EquipementType.CAMERA)
                            .build()
            );
            equipementRepository.save(
                    Equipement.builder()
                            .nom("KIT_VISIO_CONFERENCE")
                            .poids(500)
                            .type(EquipementType.KIT_VISIO_CONFERENCE)
                            .build()
            );

            //Reservation

            // Create and save reservations
            reservationRepository.save(
                    Reservation.builder()
                            .employe(employeRepository.findByNom("Fatima zahrae"))
                            .salle(salleRepository.findByNom("salle1"))
                            .equipements(List.of(equipementRepository.findByNom("Projector")))
                            .date(LocalDate.now())
                            .statut(ReservationStatus.EN_ATTENTE)
                            .duree("400")
                            .build()
            );
            reservationRepository.save(
                    Reservation.builder()
                            .employe(employeRepository.findByNom("Mohmed"))
                            .salle(salleRepository.findByNom("salle2"))
                            .equipements(List.of(equipementRepository.findByNom("Projector")))
                            .date(LocalDate.now())
                            .statut(ReservationStatus.EN_ATTENTE)
                            .duree("400")
                            .build()
            );

            reservationRepository.save(
                    Reservation.builder()
                            .employe(employeRepository.findByNom("Souad"))
                            .salle(salleRepository.findByNom("salle3"))
                            .equipements(List.of(equipementRepository.findByNom("Camera")))
                            .date(LocalDate.now())
                            .statut(ReservationStatus.EN_ATTENTE)
                            .duree("400")
                            .build()
            );






        };

        };

    }


