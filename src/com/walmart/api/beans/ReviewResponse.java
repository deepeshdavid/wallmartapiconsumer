
package com.walmart.api.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ReviewResponse {

    @SerializedName("itemId")
    @Expose
    private Integer itemId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("categoryPath")
    @Expose
    private String categoryPath;
    @SerializedName("brandName")
    @Expose
    private String brandName;
    @SerializedName("productTrackingUrl")
    @Expose
    private String productTrackingUrl;
    @SerializedName("productUrl")
    @Expose
    private String productUrl;
    @SerializedName("categoryNode")
    @Expose
    private String categoryNode;
    @SerializedName("reviews")
    @Expose
    private List<Review> reviews = new ArrayList<Review>();
    @SerializedName("reviewStatistics")
    @Expose
    private ReviewStatistics reviewStatistics;
    @SerializedName("availableOnline")
    @Expose
    private Boolean availableOnline;

    /**
     * 
     * @return
     *     The itemId
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 
     * @param itemId
     *     The itemId
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

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
     *     The upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * 
     * @param upc
     *     The upc
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * 
     * @return
     *     The categoryPath
     */
    public String getCategoryPath() {
        return categoryPath;
    }

    /**
     * 
     * @param categoryPath
     *     The categoryPath
     */
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    /**
     * 
     * @return
     *     The brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 
     * @param brandName
     *     The brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 
     * @return
     *     The productTrackingUrl
     */
    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    /**
     * 
     * @param productTrackingUrl
     *     The productTrackingUrl
     */
    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    /**
     * 
     * @return
     *     The productUrl
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * 
     * @param productUrl
     *     The productUrl
     */
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * 
     * @return
     *     The categoryNode
     */
    public String getCategoryNode() {
        return categoryNode;
    }

    /**
     * 
     * @param categoryNode
     *     The categoryNode
     */
    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    /**
     * 
     * @return
     *     The reviews
     */
    public List<Review> getReviews() {
        return reviews;
    }

    /**
     * 
     * @param reviews
     *     The reviews
     */
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    /**
     * 
     * @return
     *     The reviewStatistics
     */
    public ReviewStatistics getReviewStatistics() {
        return reviewStatistics;
    }

    /**
     * 
     * @param reviewStatistics
     *     The reviewStatistics
     */
    public void setReviewStatistics(ReviewStatistics reviewStatistics) {
        this.reviewStatistics = reviewStatistics;
    }

    /**
     * 
     * @return
     *     The availableOnline
     */
    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    /**
     * 
     * @param availableOnline
     *     The availableOnline
     */
    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

}
