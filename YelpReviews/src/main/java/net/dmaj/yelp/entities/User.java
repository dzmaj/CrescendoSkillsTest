package net.dmaj.yelp.entities;

import java.io.Serializable;

public class User implements Serializable {
	
//  "user": {
//  "id": "tyv7D06Ox_M3acQz7O7OIw",
//  "profile_url": "https://www.yelp.com/user_details?userid=tyv7D06Ox_M3acQz7O7OIw",
//  "image_url": "https://s3-media2.fl.yelpcdn.com/photo/hFZPkVKZpy4D1xHq7xvrLA/o.jpg",
//  "name": "Lyubov L."
//}
	
	private String id;
	private String profileUrl;
	private String imageUrl;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
