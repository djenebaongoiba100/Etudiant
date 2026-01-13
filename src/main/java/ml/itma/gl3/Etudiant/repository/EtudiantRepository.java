package ml.itma.gl3.Etudiant.repository;

import ml.itma.gl3.Etudiant.model.Etudiant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public class EtudiantRepository {

    @Query(value = "select et from Etudiant et where et.nom = :nom")
    Etudiant getByName(@Param("nom") String nom)
}
