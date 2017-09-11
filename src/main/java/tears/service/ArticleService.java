package tears.service;

import tears.model.Article;

/**
 * @author Vladimir on 8/17/2017.
 */
public interface ArticleService {
    /**
     * @param title is article's title.
     * @return {@link Article} entity by given title.
     */
    Article getArticleByTitle(String title);

    /**
     * @return list of articles.
     */
    Article[] getArticles();

}
