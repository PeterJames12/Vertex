package tears.service.htmp;

import tears.model.htmp.Book;

/**
 * @author Vladimir on 8/21/2017.
 */
public interface BookService {

    /**
     * @param title is book's title.
     * @return {@link Book} entity by given title.
     */
    Book getBookByTitle(String title);

    /**
     * @param name is book author's name.
     * @return {@link Book} entity by given title.
     */
    Book getBookByAuthor(String name);

    /**
     * @return list of books.
     */
    Book[] getBooks();
}
