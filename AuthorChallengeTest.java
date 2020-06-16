import data.repository.AuthorRepository;
import data.repository.AuthorRepositoryImpl;
import org.junit.jupiter.api.*;
import simpleJsonParser.parser.ParseException;

import java.io.IOException;
import java.util.List;

public class AuthorChallengeTest {

    final AuthorRepository authorRepository = new AuthorRepositoryImpl();

    @Test
    void testGetUsernames() throws IOException, ParseException{

    }

    @Test
    void testGetUsernameWithHighestCommentCount() throws IOException, ParseException{

    }
    @Test
    void testGetUsernamesSortedByRecordDate() throws IOException, ParseException{

    }
}
