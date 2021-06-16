package net.dmaj.yelp.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Review implements Serializable {

	
//	{
//        "id": "VlsDlUE81BUOReQbzKC0FA",
//        "url": "https://www.yelp.com/biz/cuba-cuba-castle-rock-castle-rock?adjust_creative=VYQh_IsJ9TezEvZxHQUsQA&hrid=VlsDlUE81BUOReQbzKC0FA&utm_campaign=yelp_api_v3&utm_medium=api_v3_business_reviews&utm_source=VYQh_IsJ9TezEvZxHQUsQA",
//        "text": "Love this place!!! Very popular place on the weekend (we were in Saturday during 2 pm). \nStaff is very nice and polite. They follow all the COVID guidance....",
//        "rating": 5,
//        "time_created": "2020-09-07 16:35:28",
//        "user": {
//            "id": "tyv7D06Ox_M3acQz7O7OIw",
//            "profile_url": "https://www.yelp.com/user_details?userid=tyv7D06Ox_M3acQz7O7OIw",
//            "image_url": "https://s3-media2.fl.yelpcdn.com/photo/hFZPkVKZpy4D1xHq7xvrLA/o.jpg",
//            "name": "Lyubov L."
//        }
//    },
	
	private String id;
	private String url;
	private String text;
	private int rating;
	private LocalDateTime timeCreated;
	private User user;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public LocalDateTime getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
