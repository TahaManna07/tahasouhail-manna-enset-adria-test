package ma.enset.virementservice;

import ma.enset.virementservice.entities.Virement;
import ma.enset.virementservice.enums.VirementType;
import ma.enset.virementservice.repositories.VirementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients

public class VirementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirementServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(VirementRepository virementRepository) {
        return args -> {
            Virement  virement = Virement.builder()
                    .date(new Date ())
                    .description("test")
                    .beneficiaryId(1L)
                    .montant(2500.15)
                    .ribSource("RIB12345")
                    .type(VirementType.INSTANTANEE)
                    .build();
            Virement  virement0 = Virement.builder()
                    .date(new Date ())
                    .description("test1")
                    .beneficiaryId(1L)
                    .montant(6870.15)
                    .ribSource("RIB67890")
                    .type(VirementType.NORMALE)
                    .build();
            Virement  virement1 = Virement.builder()
                    .date(new Date ())
                    .description("test2")
                    .beneficiaryId(1L)
                    .montant(4800.15)
                    .ribSource("RIB111213")
                    .type(VirementType.INSTANTANEE)
                    .build();
            virementRepository.save(virement0);
            virementRepository.save(virement1);
            virementRepository.save(virement);





        };
    }
}