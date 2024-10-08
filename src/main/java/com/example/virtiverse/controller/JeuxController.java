package com.example.virtiverse.controller;

import com.example.virtiverse.entities.Jeux;
import com.example.virtiverse.entities.enums.TypeJeux;
import com.example.virtiverse.serviceImp.JeuxService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Jeux")
@CrossOrigin(origins = "http://localhost:4200")

public class JeuxController {
JeuxService jeuxService;

    @GetMapping("/retrieveAllGames")
    public List<Jeux> retrieveAllGames() {

        return jeuxService.retrieveAllGames();
    }

    @GetMapping("/retrieveGame/{idJeux}")
    public Jeux retrieveGame(@PathVariable("idJeux") Long idJeux) {

        return jeuxService.retrieveGame(idJeux);
    }
    @PostMapping("/addGame")
    public Jeux addGame(@RequestBody Jeux jeux) {

        return jeuxService.addGame(jeux);
    }

    @PutMapping("/updateGame/{idJeux}")
    public Jeux updateGame(@RequestBody Jeux jeux , @PathVariable("idJeux") Long idJeux) {
        Jeux j =jeuxService.retrieveGame(idJeux);
        jeux.setIdJeux(j.getIdJeux());
        return jeuxService.updateGame(jeux);
    }

    @DeleteMapping("/removeGame/{idJeux}")
    public void removeGame(@PathVariable("idJeux") Long idJeux) {

        jeuxService.removeGame(idJeux);
    }

    @GetMapping("/retrieveGameByType/{typeJeux}")
    public List<Jeux> retrieveGameByType(@PathVariable("typeJeux") TypeJeux typeJeux) {
        return jeuxService.retrieveGameByType(typeJeux);
    }
}
