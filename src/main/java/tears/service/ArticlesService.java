package tears.service;
import tears.model.Article;

public interface ArticlesService {
    /**
     * @return article.
     */
    Article getArticle();

    /**
     * @return list of articles.
     */
    Article[] getAricles();

}
