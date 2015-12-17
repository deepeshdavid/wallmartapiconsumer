package com.walmart.api.service;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.walmart.api.beans.RecommendResponse;
import com.walmart.api.beans.Recommendations;
import com.walmart.api.beans.ReviewResponse;
import com.walmart.api.beans.SearchResponse;
import com.walmart.api.utils.EndPointConstants;

public class WallmatApiHitter {

	public static SearchResponse getSearchResults(String itemToBeSearched) {

		String searchEndPoint = EndPointConstants.searchSegment.replaceAll(
				EndPointConstants.queryVar, itemToBeSearched);
		System.out.println("hitting the endpoint "+searchEndPoint);
		return new Gson().fromJson(
				RestClientGet.hitRestGetService(searchEndPoint),
				SearchResponse.class);
	}

	public static Recommendations getRecommendResponse(String items) {
		String recommendEndPoint = EndPointConstants.recommendSegment
				.replaceAll(EndPointConstants.queryVar, items);
		System.out.println("hitting the endpoint "+recommendEndPoint);
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jArray = parser.parse(
				RestClientGet.hitRestGetService(recommendEndPoint))
				.getAsJsonArray();

		ArrayList<RecommendResponse> lcs = new ArrayList<RecommendResponse>();

		for (JsonElement obj : jArray) {
			RecommendResponse cse = gson.fromJson(obj, RecommendResponse.class);
			lcs.add(cse);
		}
		Recommendations recommendations = new Recommendations();
		recommendations.setRecommendResponse(lcs);
		return recommendations;

	}

	public static ReviewResponse getReviewResponse(String items) {
		String reviewEndPoint = EndPointConstants.reviewSegment.replaceAll(
				EndPointConstants.queryVar, items);
		System.out.println("hitting the endpoint "+reviewEndPoint);

		return new Gson().fromJson(
				RestClientGet.hitRestGetService(reviewEndPoint),
				ReviewResponse.class);

	}
}
