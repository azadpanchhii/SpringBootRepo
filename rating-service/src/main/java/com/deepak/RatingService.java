package com.deepak;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ratings")
public class RatingService {
	@RequestMapping("/{movieId}")
	public Rating getRatings(@PathVariable("movieId") String movieId)
	{
		return new Rating("111",5);
	}
	@RequestMapping("/users/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId)
	{
		List<Rating> ratings=Arrays.asList(
				new Rating("111", 5),
				new Rating("222", 4)
				);
		UserRating ur=new UserRating();
		ur.setUserRating(ratings);;
		return ur;
	}
}
