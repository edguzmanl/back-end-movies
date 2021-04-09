package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie")

public class Movie implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private Integer movieId;
	private String name;
	private String description;
	private String image;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	@Column (name = "release_date")
	private LocalDate releaseDate;
	private String actors;
	@ManyToOne
	@JoinColumn(name ="gender_id")
	private Gender id;
	private int rating;
	public Movie(){
		
	}
	public Movie(Integer movieId, String name, String description, String image, LocalDateTime createdAt,
			LocalDate releaseDate, String actors, Gender id, int rating) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.description = description;
		this.image = image;
		this.createdAt = createdAt;
		this.releaseDate = releaseDate;
		this.actors = actors;
		this.id = id;
		this.rating = rating;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public Gender getId() {
		return id;
	}
	public void setId(Gender id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
