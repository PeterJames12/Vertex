package tears.dao;

import tears.model.Article;

/**
 * @author Igor Hnes on 8/17/17.
 */
public interface ArticleDao {

    /**
     * @return {@link Article}.
     */
    Article getArticle();

    /**
     * @return list of articles.
     */
    Article[] getArticles();

    /**
     * @param id is article's id.
     * @return {@link Article} by given id.
     */
    Article getArticleById(Long id);
}
