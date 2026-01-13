package ml.itma.gl3.Etudiant.service;

import ml.itma.gl3.Etudiant.model.Etudiant;

public interface EtudiantService {

    Etudiant save (Etudiant etudiant);
    Etudiant update (Etudiant etudiant);
    Etudiant delete (Etudiant etudiant);
    Etudiant getEtudiant (Etudiant etudiant);

}

