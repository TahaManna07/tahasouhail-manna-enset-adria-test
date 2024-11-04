package ma.enset.virementservice.models;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BeneficiaryDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String rib;
    private String type;

}
