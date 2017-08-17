package tears.dao;

import tears.model.Article;

public interface ArticleDao {
    /**
     * @return article.
     */
    Article getArticle();

    /**
     * @return list of articles
     */
    Article[] getArticles();

    /**
     * @param partTitle is some
     * @return {@link Article} entity  by part of the text
     */
    Article getByTitlePart(String partTitle);
}
