public class TweetData {
    public String tweetText;
    public String language;
    public String user;

    TweetData(String tweetText, String lang, String user, int retweetCount, int favoriteCount, int replyCount){
        this.tweetText = tweetText;
        language = lang;
        this.user = user;



    }
}
