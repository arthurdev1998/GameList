package com.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gameList.entities.Game;
import com.gameList.entities.Dto.GameDto;
import com.gameList.entities.Dto.GameMinDto;
import com.gameList.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gamerepository;
	
	@Transactional(readOnly = true)
	public  List<GameMinDto> FindAllGames(){
			var games = gamerepository.findAll();
			return games.stream().map(x -> new GameMinDto(x)).toList();	
	}
	
	@Transactional(readOnly = true)
	public  List<GameMinDto> FindGamesByList(Long listId){
		var games = gamerepository.searchByList(listId);
		return games.stream().map(x -> new GameMinDto(x)).toList();	
	} 
	
	@Transactional(readOnly = true)
	public GameDto findGameById(Long id) {
		var games = gamerepository.findById(id).get();
		
		return new GameDto(games);
	}
	
	public Game CreateGame(Game game){
		return gamerepository.save(game);		
		
	}
	
}
