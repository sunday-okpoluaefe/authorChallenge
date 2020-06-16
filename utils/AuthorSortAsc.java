package utils;

import data.model.Author;

import java.util.Comparator;

public class AuthorSortAsc implements Comparator<Author> {

    @Override
    public int compare(Author author, Author t1) {
        return (int) ( t1.created_at - author.created_at);
    }

    @Override
    public Comparator<Author> reversed() {
        return null;
    }
}
