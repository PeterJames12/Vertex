package tears.database;

import tears.model.Article;

/**
 * Imitation database for {@link Article} entity.
 *
 * @author Igor Hnes on 8/17/17.
 */
public class ArticleData {

    public static Article[] getArticles() {
        final Article article = new Article();
        article.setTitle("Game of thrones");
        article.setDescription("I've never seen it");

        Article[] articlesAboutGameOfThrones = new Article[1];
        articlesAboutGameOfThrones[0] = article;

        return articlesAboutGameOfThrones;
    }
}
