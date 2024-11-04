package ma.enset.beneficiaryservice;

import ma.enset.beneficiaryservice.entities.Beneficiary;
import ma.enset.beneficiaryservice.repositories.BeneficiaryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class BeneficiaryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeneficiaryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BeneficiaryRepository beneficiaryRepository) {
		return args -> {
			beneficiaryRepository.save(Beneficiary.builder()
					.nom("Taha")
					.prenom("Manna")
					.rib("RIB12345")
					.type("Physique")
					.build());

			beneficiaryRepository.save(Beneficiary.builder()
					.nom("Souhail")
					.prenom("Manna")
					.rib("RIB67890")
					.type("Morale")
					.build());

			beneficiaryRepository.save(Beneficiary.builder()
					.nom("Bill")
					.prenom("Gates")
					.rib("RIB111213")
					.type("Physique")
					.build());


		};
	}
}
