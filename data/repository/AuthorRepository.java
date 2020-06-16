package data.repository;

import simpleJsonParser.parser.ParseException;

import java.io.IOException;
import java.util.List;

public interface AuthorRepository {

    public List<String> getUsernames(int threshold) throws IOException, ParseException;
    public String getUsernameWithHighestCommentCount(int threshold) throws IOException, ParseException;
    public List<String> getUsernamesSortedByRecordDate(int threshold) throws IOException, ParseException;

}
