package com.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gameList.entities.Dto.GameListDto;
import com.gameList.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gamelistrepository;
	
	@Transactional(readOnly = true)
	public List<GameListDto> getAllGameList(){
		var gameslist = gamelistrepository.findAll();
		return gameslist.stream().map(x-> new GameListDto(x)).toList();
		}
}
