package com.gameList.entities.Dto;

import java.util.Objects;

import com.gameList.entities.Game;
import com.gameList.projections.GameMinProjection;

public class GameMinDto {
	private Long id;
	private String name;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	public GameMinDto(Game entity) {
		this.id = entity.getId();
		this.name = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrL();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDto(GameMinProjection entity) {
		this.name = entity.getTitle();
		this.year = entity.getYear();
	}


	public GameMinDto() {

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


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
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
		GameMinDto other = (GameMinDto) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
}
