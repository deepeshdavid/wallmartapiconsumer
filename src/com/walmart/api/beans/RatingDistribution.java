
package com.walmart.api.beans;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RatingDistribution {

    @SerializedName("count")
    @Expose
    private String count;
    @SerializedName("ratingValue")
    @Expose
    private String ratingValue;

    /**
     * 
     * @return
     *     The count
     */
    public String getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The ratingValue
     */
    public String getRatingValue() {
        return ratingValue;
    }

    /**
     * 
     * @param ratingValue
     *     The ratingValue
     */
    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }

}
