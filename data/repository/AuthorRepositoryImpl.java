package data.repository;

import data.model.Author;
import data.remote.AuthorService;
import data.remote.AuthorServiceImpl;
import simpleJsonParser.parser.ParseException;
import utils.AuthorSortDesc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository{

    private final AuthorService authorService = new AuthorServiceImpl();

    @Override
    public List<String> getUsernames(int threshold) throws IOException, ParseException {
        List<String> names = new ArrayList<>();
        List<Author> authors = authorService.getAuthors(threshold).data;

        for (Author author: authors) names.add(author.username);
        return names;
    }

    @Override
    public String getUsernameWithHighestCommentCount(int threshold) throws IOException, ParseException {
        List<Author> authors = authorService.getAuthors(threshold).data;

        Author maxAuthor = new Author();
        for (Author author: authors){
            if(author.comment_count > maxAuthor.comment_count) maxAuthor = author;
        }
        return maxAuthor.username;
    }

    @Override
    public List<String> getUsernamesSortedByRecordDate(int threshold) throws IOException, ParseException {
        List<String> names = new ArrayList<>();
        List<Author> authors = authorService.getAuthors(threshold).data;
        authors.sort(new AuthorSortDesc());

        for (Author author: authors) names.add(author.username);
        return names;
    }
}
