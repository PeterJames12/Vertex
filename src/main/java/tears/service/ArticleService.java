package tears.service;

import tears.model.Article;

public interface ArticleService {

    /**
     * @return article.
     */
    Article getArticle();

    /**
     * @return list of articles
     */
    Article[] getArticles();



}
