package tears.dao;

import tears.model.Article;

public interface ArticleDao {
    /**
     * @return article.
     */
    Article getArticle();

    /**
     * @return list of articles.
     */
    Article[] getAricles();
}
