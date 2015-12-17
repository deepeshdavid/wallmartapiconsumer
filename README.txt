Overview of the Walmart Api Homework :

             It was great Opportunity to do this assignment , What this project contains are
			 1.Searching for the products based upon a user-provided search string (in search API url the user provided string is appended)
			 2.Using the first item in the search response which is given as input for a product recommendation search( First item from search API is given as input to Product Recommendation API) 
			 3.Retrieving reviews of the first 10 product recommendations (From Product Recommendation API given as input to review API)
			 4.Ranking the  order using recommended products based upon the review sentiments(Took overall rating and rating sentiments as input ).
			 
Steps for Executing this project :

  I have created the EXECUTABLE JAR file which contains all external Libraries like(GSON 2.2.2jar)
  
  To run this 
  1. Open CMD
  2. GO to C:/
  3. GO to the file location where the Executable Jar is there using cd /(filelocation where jar is there)
  4. Once the file location is set type in (java -cp  wallmartapiconsumer.jar com.walmart.api.consumer.WallmartAPIConsumer)
  5. Enter the user Provided search string 
  6. Search string will be added automatically to search API using endpoint 
  7. First item from search API is given as input using endpoint Product Recommendation API 
  8. From Product Recommendation API given as input using endpoint review API
  9. overall rating and rating sentiments as input for Ranking order
  