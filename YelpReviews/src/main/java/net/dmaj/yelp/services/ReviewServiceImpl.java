package net.dmaj.yelp.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.dmaj.yelp.entities.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

	private RestTemplate restTemplate;

	public ReviewServiceImpl(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	@Override
	public List<Review> showReviews(String id) {
		String url = "https://api.yelp.com/v3/businesses/{id}/reviews";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization",
				"Bearer tAeFrWCr6h2sydnVOb4FVeTdQz5K6DtnbhRpHvKNnVM0qt-L2rvn44xIdGjYNQ_CukgKtl5qMmHAUtkxytE7H8_BANXdJyWRxwsK6X8wV4d7gAF0-E2GC46PvQjJYHYx");
		HttpEntity request = new HttpEntity(headers);

		ResponseEntity<Review[]> response = this.restTemplate.exchange(url, HttpMethod.GET, request, Review[].class,
				id);

		if (response.getStatusCode() == HttpStatus.OK) {
			List<Review> reviews = new ArrayList<>();
			for (Review review : response.getBody()) {
				reviews.add(review);
			}
			return reviews;
		} else {
			return null;
		}
	}

	@Override
	public String showReviewsJsonString(String id) {
		String urlStr = "https://api.yelp.com/v3/businesses/" + id + "/reviews";

		try {
			StringBuilder result = new StringBuilder();
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Authorization", "Bearer tAeFrWCr6h2sydnVOb4FVeTdQz5K6DtnbhRpHvKNnVM0qt-L2rvn44xIdGjYNQ_CukgKtl5qMmHAUtkxytE7H8_BANXdJyWRxwsK6X8wV4d7gAF0-E2GC46PvQjJYHYx");
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
				for (String line; (line = reader.readLine()) != null;) {
					result.append(line);
				}
			}
			return result.toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

}
