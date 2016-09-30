/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epsi.twitterdashboard.twitter4j;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Classe de test de l'API Twitter4j
 * @author Allan
 */
public class TwitterApi {
    
    /**
     * Authentifie l'utilisateur sur Twitter
     * @return L'instance Twitter initialisé avec l'utilisateur authentifié
     */
    public static Twitter Authenticate() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        // Get OAuth from Twitter Application Registration
        cb.setDebugEnabled(true)
          .setOAuthConsumerKey("*********************")
          .setOAuthConsumerSecret("******************************************")
          .setOAuthAccessToken("**************************************************")
          .setOAuthAccessTokenSecret("******************************************");   
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }
    
    /**
     * Retourne la timeline de l'instance Twitter en entrée
     * @param twitter
     * @return
     * @throws TwitterException 
     */
    public static List getTimeline(Twitter twitter) throws TwitterException {
        return twitter.getHomeTimeline();
    }
}
