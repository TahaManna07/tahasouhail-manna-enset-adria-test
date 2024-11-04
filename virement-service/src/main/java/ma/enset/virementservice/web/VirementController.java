package ma.enset.virementservice.web;

import ma.enset.virementservice.entities.Virement;
import ma.enset.virementservice.services.VirementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/virements")
public class VirementController {

    @Autowired
    private VirementService virementService;

    @PostMapping
    public ResponseEntity<Virement> createVirement(@RequestBody Virement virement) {
        Virement createdVirement = virementService.createVirement(virement);
        return new ResponseEntity<>(createdVirement, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public Virement getVirementById(@PathVariable Long id) {
        return virementService.getVirementById(id);
    }

    @GetMapping
    public List<Virement> getAllVirements() {
        return virementService.getAllVirements();
    }

    @PutMapping("/{id}")
    public Virement updateVirement(@PathVariable Long id, @RequestBody Virement virement) {
        virement.setId(id);
        return virementService.updateVirement(virement);
    }

    @DeleteMapping("/{id}")
    public void deleteVirement(@PathVariable Long id) {
        virementService.deleteVirement(id);
    }
}
