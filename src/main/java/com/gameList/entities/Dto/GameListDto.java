package com.gameList.entities.Dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.gameList.entities.GameList;

public class GameListDto {
	
	private Long id;
	private String name;
	
	public GameListDto() {
		
	}
	
	public GameListDto(GameList gamelist) {
		this.id = gamelist.getId();
		this.name = gamelist.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameListDto other = (GameListDto) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
