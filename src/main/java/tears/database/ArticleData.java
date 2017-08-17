package tears.database;

import tears.model.Articles;


public class ArticleData {

    public static Articles[] getArticles() {
        final Articles article = new Articles();
        article.setTitle("My title");

        Articles[] arrayOfArticles = new Articles[1];
        arrayOfArticles[0] = article;

        return arrayOfArticles;
    }
}
