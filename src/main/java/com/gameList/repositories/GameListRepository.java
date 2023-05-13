package com.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long>{

}
