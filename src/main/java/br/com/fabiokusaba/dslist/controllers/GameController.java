package br.com.fabiokusaba.dslist.controllers;

import br.com.fabiokusaba.dslist.dto.GameDto;
import br.com.fabiokusaba.dslist.dto.GameMinDto;
import br.com.fabiokusaba.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Responsável por receber as requisições HTTP
@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll() {
        return gameService.findAll();
    }

    @GetMapping("{id}")
    public GameDto findById(@PathVariable(name = "id") Long id) {
        return gameService.findById(id);
    }
}
