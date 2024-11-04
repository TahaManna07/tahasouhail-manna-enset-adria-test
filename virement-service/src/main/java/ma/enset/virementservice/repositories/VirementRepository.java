package ma.enset.virementservice.repositories;

import ma.enset.virementservice.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirementRepository  extends JpaRepository<Virement, Long> {
}
