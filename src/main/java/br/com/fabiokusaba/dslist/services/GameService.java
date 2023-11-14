package br.com.fabiokusaba.dslist.services;

import br.com.fabiokusaba.dslist.dto.GameMinDto;
import br.com.fabiokusaba.dslist.entities.Game;
import br.com.fabiokusaba.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        //Stream -> permite fazer operações com sequência de dados
        //Map -> possibilita a transformação de objetos, transformando de um para outro
        //toList -> transforma o stream em uma lista
        return result.stream().map(game -> new GameMinDto(game)).toList();
    }
}
