package tears.database;

import tears.model.Articles;

/**
 * @author Viktor Bilko on 17.08.2017.
 */
public class ArticlesData {

    public static Articles[] getArticles() {

        final Articles articles = new Articles();
        articles.setTitle("Big title");

        Articles [] articles1 = new Articles[1];
        articles1[0] = articles;

        return articles1;
    }
}
