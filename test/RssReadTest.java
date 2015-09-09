import domain.Feed;
import domain.FeedMessage;
import domain.RSSFeedParser;

/**
 * Created by root on 2015/09/07.
 */
public class RssReadTest {
     RSSFeedParser parser = new RSSFeedParser("http://www.vogella.com/article.rss");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);

        }
}
