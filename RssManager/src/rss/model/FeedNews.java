package rss.model;

import java.util.ArrayList;
import java.util.List;

/*
 * Stores an RSS feed
 */
public class FeedNews {

    final String title;
    final String link;
    final String description;
    final String language;

    final List<FeedDailyNews> entries = new ArrayList<FeedDailyNews>();

    public FeedNews(String title, String link, String description, String language) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.language = language;

    }

    public List<FeedDailyNews> getMessages() {
        return entries;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }


    @Override
    public String toString() {
        return "Feed [description=" + description
                + ", language=" + language + ", link=" + link + ", title=" + title + "]";
    }

}