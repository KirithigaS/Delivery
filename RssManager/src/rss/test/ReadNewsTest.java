package rss.test;

import rss.model.FeedDailyNews;
import rss.model.FeedNews;
import rss.read.RSSNewsFeedParser;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadNewsTest {
    private static URL myUrl1;

    public static void main(String[] args) {
        File myFile=new File("InTopstories.rss");
        try {

            myUrl1= new File("InTopstories.rss").toURI().toURL();

            System.out.println(myUrl1.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        RSSNewsFeedParser parser = new RSSNewsFeedParser(
                myUrl1);
        FeedNews feed = parser.readFeed();
        System.out.println(feed);
        for (FeedDailyNews message : feed.getMessages()) {
            System.out.println(message);

        }

    }
}