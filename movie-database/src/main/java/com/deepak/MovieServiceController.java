package com.deepak;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/catalogue")
public class MovieServiceController {

	@Autowired
	private RestTemplate restTemplate;
	/*@Autowired
	private WebClient.Builder webClientBuilder;
	*/
	@RequestMapping("/{userId}")
	public List<MovieItem> getMovieList(@PathVariable("userId") String userId)
	{
		UserRating ratings=restTemplate.getForObject("http://RATING-INFO/ratings/users/"+userId,UserRating.class);
		return ratings.getUserRating().stream().map( r -> 
			new MovieItem((restTemplate.getForObject("http://MOVIE-INFO/movies/1234"+r.getMovieId(), Movie.class)).getName(), "A classic tale of romance", r.getRating())
			).collect(Collectors.toList());
		
	/*	return ratings.stream().map( r ->
		
		new MovieItem((webClientBuilder.build().get().uri("http://localhost:8082/movies/1234"+r.getMovieId()).retrieve().bodyToMono(Movie.class).block()).getName(), "A classic tale of romance", r.getRating())
		).collect(Collectors.toList());*/
	}
}
