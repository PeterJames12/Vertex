package tears.database;

import tears.model.Articles;

/**
 * Created by qw-user on 17.08.2017.
 */
public class ArticlesData {

    private static Articles[] getDesk() {
        final Articles articles = new Articles();
        articles.setDesc("Hello body's");

        Articles[] articles1 = new Articles[1];
        articles1[0] = articles;
        return articles1;
    }
}
