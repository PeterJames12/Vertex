package tears.database;

import tears.model.Article;

public class ArticleData {
    public Article[] getArticles(int count){
        Article article = new Article();
        article.setTitle("Title");
        article.setDiscription("Desc");

        Article article1 = new Article();
        article.setTitle("Title1");
        article.setDiscription("Desc1");

        Article[] articles = new Article[count];
        articles[0] = article;
        articles[1] = article1;

        return articles;
    }

}
