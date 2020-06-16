
import data.repository.AuthorRepository;
import data.repository.AuthorRepositoryImpl;
import simpleJsonParser.parser.ParseException;

import java.io.IOException;
import java.util.List;

public class AuthorChallenge {

    public static void main(String[] args) throws IOException, ParseException {
       final AuthorRepository authorRepository = new AuthorRepositoryImpl();
        /*un comment next line to test first function*/
        //List<String> usernames = authorRepository.getUsernames(1);

        /*un comment next line to test second function*/
        //String nameWithHighestCommentCount = authorRepository.getUsernameWithHighestCommentCount(1);

        /*un comment next line to test third function*/
        //List<String> namesSorted = authorRepository.getUsernamesSortedByRecordDate(1);

    }
}
