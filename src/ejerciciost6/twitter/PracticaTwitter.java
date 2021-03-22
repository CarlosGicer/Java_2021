package ejerciciost6.twitter;

import java.util.ArrayList;
import java.util.List;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class PracticaTwitter {

	private Twitter tr;
	
	public PracticaTwitter() {
		//Conexión a Twitter
		
		//Para poner todas las variables de configuración que necesita la librería
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("PtEwDeTVd3UJUyGpDuADIb1ED")
		  .setOAuthConsumerSecret("hlAbY7npzKtRzBxCDEYbhyzStIjqUusfDgQ4cm5dtHc3PXdRNO")
		  .setOAuthAccessToken("520614924-typWsiINY6Z2BDbUe9aLRNNLwrHIXnAquIh7rSDw")
		  .setOAuthAccessTokenSecret("ITbpAFmkMFuZq03y9Cz7IGd0ak2noiBMywiclHdQZbB3p");
		
		//Creamos la factoría que nos permite crear objetos Twitter, se le pasa el ConfigurationBuilder
		TwitterFactory tf = new TwitterFactory(cb.build());
		this.tr = (Twitter) tf.getInstance();
	}
	
	/**
	 * Método que devuelve en un ArrayList los nombres de los usuarios amigos de Twitter
	 * @param nombreUsuario - De quien vamos a sacar sus amigos
	 * @return
	 */
	public ArrayList<String> getFriends(String nombreUsuario) {
		
		ArrayList<String> friends = new ArrayList<>();
		 try {
	            Twitter twitter = this.tr;
	            long cursor = -1;
	            IDs ids;
	            //Voy sacando los IDs de los amigos del nombreUsuario pasado como parámetro
	            do {
	            	
	                ids = twitter.getFriendsIDs(nombreUsuario, cursor);
	              
	                User user;
	                for (long id : ids.getIDs()) {
	                	//Con el id de usuario de twitter, saco el objeto User para mostrar su nombre
	                	user = this.tr.showUser(id);
	                	//Añado al ArrayList el nombre del usuario
	                    friends.add(user.getName());
	                    //System.out.println(user.getName());
	                }
	                
	            } while ((cursor = ids.getNextCursor()) != 0); 

	            return friends; //Devuelvo el ArrayList
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to get friends' ids: " + te.getMessage());
	            
	            return null; //Si hay error devuelvo null
	        }
		
	}
	
	
public ArrayList<String> getUserTimeLine(String nombreUsuario) {
		
		ArrayList<String> timeline = new ArrayList<>();
		 try {
	            Twitter twitter = this.tr;
	            
	            Paging paging = new Paging(1, 100);
	            List<Status> estados = twitter.getUserTimeline(nombreUsuario,paging);
	            for(Status s : estados) {
	            	timeline.add("Usuario: "+s.getUser().getName()+" Texto: "+s.getText());
	            }

	            return timeline; //Devuelvo el ArrayList
	        } catch (TwitterException te) {
	            te.printStackTrace();
	            System.out.println("Failed to timeline: " + te.getMessage());
	            
	            return null; //Si hay error devuelvo null
	        }
		
	}


	/**
	 * @return the tr
	 */
	public Twitter getTwitter() {
		return tr;
	}

	//Main
	public static void main(String[] args) {
		
		
		PracticaTwitter pt = new PracticaTwitter();
		Twitter tw = pt.getTwitter();
		
		String userName = "MardukeCheka";
		ArrayList<String> amigos = pt.getFriends(userName);
		
		for(String amigo : amigos) {
			System.out.println("Amigo: "+ amigo);
		}
		
		ArrayList<String> timeline = pt.getUserTimeLine(userName);
		for(String men : timeline) {
			System.out.println(men);
		}
		
		
	}
}
