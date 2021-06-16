package net.dmaj.yelp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.dmaj.yelp.entities.Review;
import net.dmaj.yelp.services.ReviewService;



@RestController
@RequestMapping("api")
public class ReviewController {
	
	// 1VqjYMxk3zNlxcNVN0DZ3Q CubaCuba id aquired from phone search using postman
	
	@Autowired
	private ReviewService reviewService;
	
//	@GetMapping("{id}/reviews")
//	public List<Review> showReviews(@PathVariable String id) {
//		
//		List<Review> reviews = reviewService.showReviews(id);
//		
//		return reviews;
//	}
	
	@GetMapping("{id}/reviews")
	public String showReviews(@PathVariable String id) {
		
		String reviews = reviewService.showReviewsJsonString(id);
		
		return reviews;
	}

}
