package mate.academy.dao;

import java.util.List;
import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.model.Book;

@Dao
public interface BookDao {
    Book create(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Book update(Book book);

    boolean deleteById(Long id);
}