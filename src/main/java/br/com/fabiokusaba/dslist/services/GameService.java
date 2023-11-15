package br.com.fabiokusaba.dslist.services;

import br.com.fabiokusaba.dslist.dto.GameDto;
import br.com.fabiokusaba.dslist.dto.GameMinDto;
import br.com.fabiokusaba.dslist.entities.Game;
import br.com.fabiokusaba.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Regras de negócio da aplicação
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //Especificando que se trata de um método transacional e que será somente de leitura, não
    //vou fazer nenhum tipo de escrita que poderia bloquear o meu banco de dados
    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        //Stream -> permite fazer operações com sequência de dados
        //Map -> possibilita a transformação de objetos, transformando de um para outro
        //toList -> transforma o stream em uma lista
        return result.stream().map(game -> new GameMinDto(game)).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }
}
