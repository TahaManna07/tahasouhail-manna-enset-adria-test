package ma.enset.virementservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.virementservice.enums.VirementType;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long beneficiaryId;
    private String ribSource;
    private Double montant;
    private String description;
    private Date date;
    @Enumerated
    private VirementType type; // INSTANTANEE, NORMALE



}
