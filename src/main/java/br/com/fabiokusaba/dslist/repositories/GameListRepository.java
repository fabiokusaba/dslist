package br.com.fabiokusaba.dslist.repositories;

import br.com.fabiokusaba.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
