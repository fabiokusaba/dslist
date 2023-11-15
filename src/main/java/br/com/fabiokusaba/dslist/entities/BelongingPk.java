package br.com.fabiokusaba.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

//Em um modelo orientado a objetos onde em nosso repositorio temos a referência para o tipo da
//entidade e o tipo da chave primária (id) e por só termos um tipo para o id não posso ter um id
//com mais de uma variável.
//Na tabela de associação a chave primária é a junção das duas chaves estrangeiras
//Em um relacionamento muitos para muitos cria-se uma terceira tabela onde a chave primária é a
//composição das duas chaves estrangeiras para isso vamos criar uma classe auxiliar que vai ter
//as duas referências

@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    public BelongingPk(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    public BelongingPk() {

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPk that = (BelongingPk) o;
        return Objects.equals(game, that.game) && Objects.equals(gameList, that.gameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }
}
