package se.lexicon.librarymanagementapplication.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.librarymanagementapplication.entity.Book;

@Repository
public interface BookDAO extends CrudRepository<Book, Integer> {
}
