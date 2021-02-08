package poo_t6;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conexión a Twitter
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("PtEwDeTVd3UJUyGpDuADIb1ED")
		  .setOAuthConsumerSecret("hlAbY7npzKtRzBxCDEYbhyzStIjqUusfDgQ4cm5dtHc3PXdRNO")
		  .setOAuthAccessToken("520614924-typWsiINY6Z2BDbUe9aLRNNLwrHIXnAquIh7rSDw")
		  .setOAuthAccessTokenSecret("ITbpAFmkMFuZq03y9Cz7IGd0ak2noiBMywiclHdQZbB3p");
		TwitterFactory tf = new TwitterFactory(cb.build());
		//Creación del objeto Twitter
		Twitter twitter = (Twitter) tf.getInstance();
		
		//Uso del objeto twitter
		String username = "lineadecodigo";
		try {
			User usuario = twitter.showUser(username);
			System.out.println("Nombre: " + usuario.getName());
			System.out.println("Descripcion: " + usuario.getDescription());
			System.out.println("Id Usuario: " + usuario.getId());
			System.out.println("Número Seguidores: " + usuario.getFollowersCount());
			
			Query query = new Query("Covid");
			query.setCount(200);
		    QueryResult result = twitter.search(query);
		    for (Status status : result.getTweets()) {
		        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
		    }
		} catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to delete status: " + te.getMessage());
            System.exit(-1);
        }
		
				
	}

}
