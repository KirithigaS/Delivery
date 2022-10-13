package rss.test;


import rss.model.FeedNews;
import rss.model.FeedDailyNews;
import rss.write.RSSFeedNewWriter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WriteNewTest {

    public static void main(String[] args) {
        // create the rss feed

        String title = "Top-news to be listed in web site";
        String description = "For current news please visit the link";
        //String language = "en";
        String link = "http://cio.economictimes.indiatimes.com/rss/topstories";
        Calendar cal = new GregorianCalendar();
        Date creationDate = cal.getTime();
        SimpleDateFormat date_format = new SimpleDateFormat(
                "EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z", Locale.US);
        String pubdate = date_format.format(creationDate);
        FeedNews rssFeeder = new FeedNews(title, link, description, pubdate);

        // now add one example entry
        FeedDailyNews feed = new FeedDailyNews();
        feed.setTitle("Topnewstories");
        feed.setDescription("Current News to be display");
        feed.setGuid("http://cio.economictimes.indiatimes.com/rss/topstories");
        feed.setLink("http://cio.economictimes.indiatimes.com/rss/topstories");
        rssFeeder.getMessages().add(feed);

        // now write the file
        RSSFeedNewWriter writer = new RSSFeedNewWriter(rssFeeder, "topstories.rss");
        try {
            writer.write();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}