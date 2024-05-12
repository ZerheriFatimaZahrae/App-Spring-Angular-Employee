package ma.enset.exam_final_sysdist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamFinalSysDistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamFinalSysDistApplication.class, args);
    }

    @Bean
    CommandLineRunner start(){
        return args -> {
            System.out.println("Hello World");
        };
    }
}
