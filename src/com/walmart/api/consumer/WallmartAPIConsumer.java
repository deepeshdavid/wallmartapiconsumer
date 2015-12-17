package com.walmart.api.consumer;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.walmart.api.beans.Item;
import com.walmart.api.beans.RecommendResponse;
import com.walmart.api.beans.Recommendations;
import com.walmart.api.beans.Review;
import com.walmart.api.beans.ReviewResponse;
import com.walmart.api.beans.SearchResponse;
import com.walmart.api.service.WallmatApiHitter;

public class WallmartAPIConsumer {

	public static void main(String[] args) {

		String itemToBeSearched = null;
		
		 Scanner in =new Scanner(System.in);
				 System.out.println("Enter the user Provided String");
				 itemToBeSearched=in.nextLine();
				 System.out.println("User entered string "+ itemToBeSearched);

		WallmartAPIConsumer wac = new WallmartAPIConsumer();

		SearchResponse sr = wac.hitSearchResult(itemToBeSearched);

		if (sr != null && sr.getItems() != null && sr.getItems().size() > 0) {
			Item item = sr.getItems().get(0);
			Recommendations rec = wac.getRecommendations(item.getItemId() + "");
			if (rec != null & rec.getRecommendResponse() != null
					&& rec.getRecommendResponse().size() > 0)

			{
				for (int i = 0; i < rec.getRecommendResponse().size(); i++) {
					if (i > 10)
						break;
					RecommendResponse recRes = rec.getRecommendResponse()
							.get(i);
					System.out.println("getting reviews for "
							+ recRes.getItemId());
					ReviewResponse revRes = wac.getReviews(recRes.getItemId()
							+ "");
					if (revRes != null) {
						List<Review> reviews = revRes.getReviews();
						if (reviews != null) {
							Collections.sort(reviews, new ReviewComparator());
							System.out
									.println("The rank odered reviews for the product "
											+ item.getItemId());
							System.out.println(new Gson().toJson(reviews));
						} else {
							System.out.println("no reviews are there");
						}

					} else {
						System.out.println("no reviews are there");
					}
				}
			} else {
				System.out.println("No recommendations are there");
			}
		} else {
			System.out.println("No products available");
		}

	}

	public SearchResponse hitSearchResult(String itemTobeSearched) {
		return WallmatApiHitter.getSearchResults(itemTobeSearched);
	}

	public Recommendations getRecommendations(String itemID) {
		return WallmatApiHitter.getRecommendResponse(itemID);
	}

	public ReviewResponse getReviews(String itemId) {
		return WallmatApiHitter.getReviewResponse(itemId);
	}

}
