package ma.enset.beneficiaryservice.repositories;

import ma.enset.beneficiaryservice.entities.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {
}

