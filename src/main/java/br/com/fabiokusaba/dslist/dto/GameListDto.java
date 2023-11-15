package br.com.fabiokusaba.dslist.dto;

import br.com.fabiokusaba.dslist.entities.GameList;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto() {
    }

    //Como não implementamos o BeanUtils podem apenas gerar os getters
    public GameListDto(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
