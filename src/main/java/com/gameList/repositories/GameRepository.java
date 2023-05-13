package com.gameList.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gameList.entities.Game;
import com.gameList.projections.GameMinProjection;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

	
	
	@Query(nativeQuery = true, value = """
			SELECT gamesol.title, gamesol.year FROM   games gamesol 
			INNER JOIN belonging belongingsol 
			ON (gamesol.id = belongingsol.game_id)
			WHERE belongingsol.position = :listId
			
			""" )
	List<GameMinProjection> searchByList(Long listId);
			
			
		
}
