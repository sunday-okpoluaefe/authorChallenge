package data.remote;

import data.model.ApiResponse;
import simpleJsonParser.parser.ParseException;

import java.io.IOException;

public interface AuthorService {
    ApiResponse getAuthors(int threshold) throws IOException, ParseException;
}
