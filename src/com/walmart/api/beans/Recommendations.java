package com.walmart.api.beans;

import java.util.ArrayList;
import java.util.List;

public class Recommendations {
	
	private List<RecommendResponse> recommendResponse = new ArrayList<RecommendResponse>();

	public List<RecommendResponse> getRecommendResponse() {
		return recommendResponse;
	}

	public void setRecommendResponse(List<RecommendResponse> recommendResponse) {
		this.recommendResponse = recommendResponse;
	}

}
