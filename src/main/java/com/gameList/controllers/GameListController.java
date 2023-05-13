package com.gameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gameList.entities.GameList;
import com.gameList.entities.Dto.GameListDto;
import com.gameList.entities.Dto.GameMinDto;
import com.gameList.services.GameListService;
import com.gameList.services.GameService;

@RequestMapping(value="/api/gamelist")
@RestController
public class GameListController {
	
	@Autowired
	private GameListService gamelistservice;
	
	@Autowired
	private GameService gameservice;
	
	@GetMapping
	public List<GameListDto> getAllGameList(){
		return gamelistservice.getAllGameList(); 
	}

	@GetMapping(value="/{Id}/games")
	public List<GameMinDto> fingGamesByList(@PathVariable(value="Id")Long id){
		 return gameservice.FindGamesByList(id);
	}
	
}
