package com.viz.util;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.auth.AccessToken;

public class ConnectionManager {
	public static Facebook getConnection() {
		Facebook facebook = new FacebookFactory().getInstance();
		facebook.setOAuthAppId("1053480687999273", "2d6fafde8d8229e2260cd9baccffec71");
		facebook.setOAuthPermissions("user_profile");
		facebook.setOAuthAccessToken(new AccessToken("EAAOZBIpYvmSkBAPIVNeatAvvinqcfy1j6Unz3CB9B9SIdsqNbZB2XphlT7ZB0RJubg8mLSFqG0tPI3AvHQ9B5qqZAQRzOXhfP6IVluYC5stdQ5Q3Q7AspzMUjx0jeuH2e1QFq1lysG0FZCaEFViEICLbH5FzK5kkePPCuNa3YmhyZA1pelq4aTcZAJ7hLC8jCQZD", null));
		return facebook;
		
	}

}
