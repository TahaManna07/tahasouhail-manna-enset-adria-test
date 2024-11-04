package ma.enset.virementservice.services;

import lombok.AllArgsConstructor;
import ma.enset.virementservice.clients.BeneficiaryClient;
import ma.enset.virementservice.entities.Virement;
import ma.enset.virementservice.models.BeneficiaryDTO;
import ma.enset.virementservice.repositories.VirementRepository;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
@AllArgsConstructor
public class VirementService {

    private VirementRepository virementRepository;
    private final BeneficiaryClient beneficiaryClient;


    public Virement createVirement(Virement virement) {
        BeneficiaryDTO beneficiaryDTO = beneficiaryClient.getBeneficiaryById(virement.getBeneficiaryId());
        if (beneficiaryDTO == null) {
            throw new IllegalArgumentException("Bénéficiaire non trouvé");
        }
        return virementRepository.save(virement);
    }

    public Virement getVirementById(Long id) {
        return virementRepository.findById(id).orElse(null);
    }

    public List<Virement> getAllVirements() {
        return virementRepository.findAll();
    }

    public Virement updateVirement(Virement virement) {
        return virementRepository.save(virement);
    }

    public void deleteVirement(Long id) {
        virementRepository.deleteById(id);
    }
}


