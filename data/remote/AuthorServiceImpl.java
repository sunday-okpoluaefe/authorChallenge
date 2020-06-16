package data.remote;

import data.model.ApiResponse;
import simpleJsonParser.JSONObject;
import simpleJsonParser.parser.JSONParser;
import simpleJsonParser.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

public class AuthorServiceImpl implements AuthorService {

    JSONParser jsonParser = new JSONParser();

    private String httpRequest(int threshold) throws IOException {

        String baseUrl = "https://jsonmock.hackerrank.com";
        URL url = new URL(String.format("%s/api/article_users/search?page=%d", baseUrl, threshold));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;

        StringBuilder content = new StringBuilder();
        while ((inputLine = bufferedReader.readLine()) != null) {
            content.append(inputLine);
        }
        bufferedReader.close();
        con.disconnect();
        return content.toString();
    }

    @Override
    public ApiResponse getAuthors(int threshold) throws IOException, ParseException {
        JSONObject jsonResponse = (JSONObject) jsonParser.parse(httpRequest(threshold));
        return new ApiResponse(jsonResponse);
    }

}
