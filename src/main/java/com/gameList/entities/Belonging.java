package com.gameList.entities;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="Belonging")
@Entity
public class Belonging implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private BelongingPk id;
	
	private Integer position;

	public Belonging() {}
	public Belonging(Game game, GameList gamelist, Integer position) {
		this.id.setGame(game);
		this.id.setGamelist(gamelist);
		this.position = position;
	}
	public BelongingPk getId() {
		return id;
	}
	public void setId(BelongingPk id) {
		this.id = id;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	
	
}
