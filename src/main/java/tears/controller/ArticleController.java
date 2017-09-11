package tears.controller;

import tears.service.ArticleService;
import tears.service.impl.ArticleServiceImpl;

/**
 * @author Vladimir on 8/17/2017.
 */
public class ArticleController {
    public static void main(String[] args) {

        ArticleService articleService= new ArticleServiceImpl();

        articleService.getArticles();

    }
}
