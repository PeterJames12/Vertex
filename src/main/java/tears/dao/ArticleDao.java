package tears.dao;

import tears.model.Articles;

public interface ArticleDao {

    Articles getArticleByTitle();
    Articles getTitle();

    Articles [] getArticle();

}
