package com.walmart.api.consumer;

import java.util.Comparator;

import com.walmart.api.beans.Review;

public class ReviewComparator implements Comparator<Review> {

	@Override
	public int compare(Review arg0, Review arg1) {
		if (Integer.parseInt(arg0.getOverallRating().getRating()) < Integer
				.parseInt(arg1.getOverallRating().getRating())) {
			return 1;
		} else {
			return -1;
		}
	}

}
