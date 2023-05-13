package com.gameList.entities.Dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.gameList.entities.Game;

public class GameDto {
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private Double score;
	private String imgUrL;
	private String shortDescription;
	private String longDescription;
	
	
public GameDto() {}

//	public GameDto(Game entity) {       // Mapeamento convencional
//		this.id = entity.getId();
//		this.title = entity.getTitle();
//		this.year = entity.getYear();
//		this.genre = entity.getGenre();
//		this.score = entity.getScore();
//		this.imgUrL = entity.getImgUrL();
//		this.shortDescription = entity.getShortDescription();
//		this.longDescription = entity.getLongDescription();
//	}

public GameDto(Game entity) {
	BeanUtils.copyProperties(entity, this);
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrL() {
		return imgUrL;
	}

	public void setImgUrL(String imgUrL) {
		this.imgUrL = imgUrL;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
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
		GameDto other = (GameDto) obj;
		return Objects.equals(id, other.id);
	}


	
	
	
}
