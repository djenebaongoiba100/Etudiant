package ml.itma.gl3.Etudiant.service.impl;

import ml.itma.gl3.Etudiant.model.Etudiant;
import ml.itma.gl3.Etudiant.repository.EtudiantRepository;
import ml.itma.gl3.Etudiant.service.EtudiantService;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository etudiantRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }


    @Override
    public Etudiant save(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant update(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant delete(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant getEtudiant(Etudiant etudiant) {
        return null;
    }
}
