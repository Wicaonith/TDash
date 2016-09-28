package com.epsi.twitterdashboard.model;

/**
 * Model de Tweet
 * @author Allan
 */
public class Tweet {
    
    // ********** PRIVATE FIELDS **********
    /**
     * Bodu du Tweet
     */
    private String body;
    // ************************************
    
    
    
    // ********** CONSTRUCTOR **********
    /**
     * Constructeur de Tweet
     * @param pBody body du Tweet
     */
    public Tweet(String pBody) {
        this.body = pBody;
    }
    // *********************************
    
    
    
    // ********** ACCESSORS **********
    /**
     * Getter du body du Tweet
     * @return Le body du Tweet
     */
    public String getBody() {
        return body;
    }

    /**
     * Setter du body du Tweet
     * @param body nouveau body du Tweet
     */
    public void setBody(String body) {
        this.body = body;
    }
    // *******************************
}
