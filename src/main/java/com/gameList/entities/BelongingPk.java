package com.gameList.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPk {

	@ManyToOne
	@JoinColumn(name="game_Id")
	private Game game;
	@ManyToOne
	@JoinColumn(name="game_list_Id")
	private GameList gamelist;
	
	public BelongingPk() {
		
	}
	
	public BelongingPk(Game game, GameList gamelist) {
		this.game = game;
		this.gamelist = gamelist;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, gamelist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPk other = (BelongingPk) obj;
		return Objects.equals(game, other.game) && Objects.equals(gamelist, other.gamelist);
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getGamelist() {
		return gamelist;
	}

	public void setGamelist(GameList gamelist) {
		this.gamelist = gamelist;
	}
	
	
}
