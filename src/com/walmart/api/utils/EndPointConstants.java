package com.walmart.api.utils;

public class EndPointConstants {
	
	public static final String apiKey = "kbp39u2ar7kab8crhk74ehwu";
	public static final String endPointUrl = "http://api.walmartlabs.com/v1/";
	public static final String queryVar = "#!tobereplaced#!";
	public static final String searchSegment = endPointUrl+"search?apiKey="+apiKey+"&query="+queryVar;
	public static final String recommendSegment = endPointUrl+"nbp?apiKey="+apiKey+"&itemId="+queryVar;
	public static final String reviewSegment = endPointUrl+"reviews/"+queryVar+"?apiKey="+apiKey;

}
