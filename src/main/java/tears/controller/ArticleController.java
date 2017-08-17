package tears.controller;

import tears.service.ArticleService;
import tears.service.impl.ArticleServiceImpl;

/**
 * Article controller.
 *
 * @author Igor Hnes on 8/17/17.
 */
public class ArticleController {

    public static void main(String[] args) {

        ArticleService articleService = new ArticleServiceImpl();
        articleService.getArticles();
    }
}
