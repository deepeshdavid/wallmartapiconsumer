
package com.walmart.api.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ReviewStatistics {

    @SerializedName("averageOverallRating")
    @Expose
    private String averageOverallRating;
    @SerializedName("overallRatingRange")
    @Expose
    private String overallRatingRange;
    @SerializedName("ratingDistributions")
    @Expose
    private List<RatingDistribution> ratingDistributions = new ArrayList<RatingDistribution>();
    @SerializedName("totalReviewCount")
    @Expose
    private String totalReviewCount;

    /**
     * 
     * @return
     *     The averageOverallRating
     */
    public String getAverageOverallRating() {
        return averageOverallRating;
    }

    /**
     * 
     * @param averageOverallRating
     *     The averageOverallRating
     */
    public void setAverageOverallRating(String averageOverallRating) {
        this.averageOverallRating = averageOverallRating;
    }

    /**
     * 
     * @return
     *     The overallRatingRange
     */
    public String getOverallRatingRange() {
        return overallRatingRange;
    }

    /**
     * 
     * @param overallRatingRange
     *     The overallRatingRange
     */
    public void setOverallRatingRange(String overallRatingRange) {
        this.overallRatingRange = overallRatingRange;
    }

    /**
     * 
     * @return
     *     The ratingDistributions
     */
    public List<RatingDistribution> getRatingDistributions() {
        return ratingDistributions;
    }

    /**
     * 
     * @param ratingDistributions
     *     The ratingDistributions
     */
    public void setRatingDistributions(List<RatingDistribution> ratingDistributions) {
        this.ratingDistributions = ratingDistributions;
    }

    /**
     * 
     * @return
     *     The totalReviewCount
     */
    public String getTotalReviewCount() {
        return totalReviewCount;
    }

    /**
     * 
     * @param totalReviewCount
     *     The totalReviewCount
     */
    public void setTotalReviewCount(String totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

}
