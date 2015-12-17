
package com.walmart.api.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Review {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("overallRating")
    @Expose
    private OverallRating overallRating;
    @SerializedName("productAttributes")
    @Expose
    private List<ProductAttribute> productAttributes = new ArrayList<ProductAttribute>();
    @SerializedName("reviewer")
    @Expose
    private String reviewer;
    @SerializedName("reviewText")
    @Expose
    private String reviewText;
    @SerializedName("submissionTime")
    @Expose
    private String submissionTime;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("upVotes")
    @Expose
    private String upVotes;
    @SerializedName("downVotes")
    @Expose
    private String downVotes;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The overallRating
     */
    public OverallRating getOverallRating() {
        return overallRating;
    }

    /**
     * 
     * @param overallRating
     *     The overallRating
     */
    public void setOverallRating(OverallRating overallRating) {
        this.overallRating = overallRating;
    }

    /**
     * 
     * @return
     *     The productAttributes
     */
    public List<ProductAttribute> getProductAttributes() {
        return productAttributes;
    }

    /**
     * 
     * @param productAttributes
     *     The productAttributes
     */
    public void setProductAttributes(List<ProductAttribute> productAttributes) {
        this.productAttributes = productAttributes;
    }

    /**
     * 
     * @return
     *     The reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * 
     * @param reviewer
     *     The reviewer
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * 
     * @return
     *     The reviewText
     */
    public String getReviewText() {
        return reviewText;
    }

    /**
     * 
     * @param reviewText
     *     The reviewText
     */
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    /**
     * 
     * @return
     *     The submissionTime
     */
    public String getSubmissionTime() {
        return submissionTime;
    }

    /**
     * 
     * @param submissionTime
     *     The submissionTime
     */
    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The upVotes
     */
    public String getUpVotes() {
        return upVotes;
    }

    /**
     * 
     * @param upVotes
     *     The upVotes
     */
    public void setUpVotes(String upVotes) {
        this.upVotes = upVotes;
    }

    /**
     * 
     * @return
     *     The downVotes
     */
    public String getDownVotes() {
        return downVotes;
    }

    /**
     * 
     * @param downVotes
     *     The downVotes
     */
    public void setDownVotes(String downVotes) {
        this.downVotes = downVotes;
    }

}
