package ma.enset.virementservice.clients;

import ma.enset.virementservice.models.BeneficiaryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "beneficiary-service")
public interface BeneficiaryClient {
    @GetMapping("/api/beneficiaries/{id}")
    BeneficiaryDTO getBeneficiaryById(@PathVariable("id") Long id);

}

