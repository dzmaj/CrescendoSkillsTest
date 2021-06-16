# CrescendoSkillsTest

This simple application takes a business id from yelp and returns JSON of the reviews of the restaurant.

Example: GET http://localhost:8080/api/1VqjYMxk3zNlxcNVN0DZ3Q/reviews returns the first 3 reviews (Yelp API only returns the first 3) of Cuba Cuba in Castle Rock, CO.

The id in .../api/{id}/reviews can be obtained with a get request also using the yelp API (TODO: incorporate this into the application or another search method so that the user only needs the name or phone number of the restaurant): GET https://api.yelp.com/v3/businesses/search/phone?phone=+17206392719.
