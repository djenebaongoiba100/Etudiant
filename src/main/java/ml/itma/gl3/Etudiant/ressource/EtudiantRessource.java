package ml.itma.gl3.Etudiant.ressource;

import ml.itma.gl3.Etudiant.model.Etudiant;
import ml.itma.gl3.Etudiant.service.EtudiantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//a
@RestController
@RequestMapping("/api/Etudiant")
public class EtudiantRessource {

    private final EtudiantService EtudiantService;

    public EtudiantResource(EtudiantService EtudiantService) {
        this.EtudiantService = EtudiantService;
    }

    @PostMapping
    public Etudiant save(Etudiant etudiant) {
        return EtudiantService.save(etudiant);
    }

    @PutMapping("/{id}")
    public Etudiant update(Etudiant etudiant) {
        return EtudiantService.update(etudiant);
    }
}
