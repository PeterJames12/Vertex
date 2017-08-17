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

    /**
     * @param partTitle is some
     * @return {@link Article} entity  by part of the text
     */
    Article getByTitlePart(String partTitle);

}