package com.gameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gameList.entities.Game;
import com.gameList.entities.Dto.GameDto;
import com.gameList.entities.Dto.GameMinDto;
import com.gameList.services.GameService;

@RestController
@RequestMapping(value="/api/game")
    public class GameController {
	
	@Autowired
	private GameService gameservice;

	@GetMapping
	public List<GameMinDto> GetAllGame() {
		return gameservice.FindAllGames();
	}
	
	@PostMapping
	public Game CreateGame(@RequestBody Game game) {
		return gameservice.CreateGame(game);
	}
	
	@GetMapping(value="/{Id}")
	public GameDto getById(@PathVariable(value="Id") Long id) {
		return gameservice.findGameById(id);
	}
}
