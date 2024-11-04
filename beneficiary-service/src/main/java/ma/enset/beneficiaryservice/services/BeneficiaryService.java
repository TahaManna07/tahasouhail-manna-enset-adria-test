package ma.enset.beneficiaryservice.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.enset.beneficiaryservice.entities.Beneficiary;
import ma.enset.beneficiaryservice.repositories.BeneficiaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BeneficiaryService {


    private final BeneficiaryRepository beneficiaryRepository;

    public Beneficiary createBeneficiary(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    public Optional<Beneficiary> getBeneficiaryById(Long id) {
        return beneficiaryRepository.findById(id);
    }

    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryRepository.findAll();
    }

    public Beneficiary updateBeneficiary(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    public void deleteBeneficiary(Long id) {
        beneficiaryRepository.deleteById(id);
    }
}

