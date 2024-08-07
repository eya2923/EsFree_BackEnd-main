package com.example.virtiverse.repository;

import com.example.virtiverse.entities.Jeux;
import com.example.virtiverse.entities.Raba3;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Raba3Repository extends JpaRepository<Raba3,Long> {

    List<Raba3> findByJeux(Jeux jeux);

    List<Raba3> findByUserName(String userName);
    Raba3 findByIdRaba3AndUserName(Long idRaba3, String name);

    Raba3 findByJeuxIdJeuxAndUserId(Long idJeux, Long id);

}
