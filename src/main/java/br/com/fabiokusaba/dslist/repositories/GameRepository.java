package br.com.fabiokusaba.dslist.repositories;

import br.com.fabiokusaba.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Acesso ao banco de dados e consultas
public interface GameRepository extends JpaRepository<Game, Long> {
}
