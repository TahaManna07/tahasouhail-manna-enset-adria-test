package ma.enset.beneficiaryservice.web;

import lombok.AllArgsConstructor;
import ma.enset.beneficiaryservice.entities.Beneficiary;
import ma.enset.beneficiaryservice.services.BeneficiaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beneficiaries")
@AllArgsConstructor
public class BeneficiaryController {

    private final BeneficiaryService beneficiaryService;

    @PostMapping
    public Beneficiary createBeneficiary(@RequestBody Beneficiary beneficiary) {
        return beneficiaryService.createBeneficiary(beneficiary);
    }

    @GetMapping("/{id}")
    public Beneficiary getBeneficiaryById(@PathVariable Long id) {
        return beneficiaryService.getBeneficiaryById(id).orElse(null);
    }

    @GetMapping
    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryService.getAllBeneficiaries();
    }

    @PutMapping("/{id}")
    public Beneficiary updateBeneficiary(@PathVariable Long id, @RequestBody Beneficiary beneficiary) {
        beneficiary.setId(id);
        return beneficiaryService.updateBeneficiary(beneficiary);
    }

    @DeleteMapping("/{id}")
    public void deleteBeneficiary(@PathVariable Long id) {
        beneficiaryService.deleteBeneficiary(id);
    }
}
