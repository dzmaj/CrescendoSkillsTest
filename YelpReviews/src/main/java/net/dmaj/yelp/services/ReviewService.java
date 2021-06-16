package net.dmaj.yelp.services;

import java.util.List;

import net.dmaj.yelp.entities.Review;

public interface ReviewService {
	List<Review> showReviews(String id);

	String showReviewsJsonString(String id);

}
