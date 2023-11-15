package br.com.fabiokusaba.dslist.controllers;

import br.com.fabiokusaba.dslist.dto.GameListDto;
import br.com.fabiokusaba.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll() {
        return gameListService.findAll();
    }
}
