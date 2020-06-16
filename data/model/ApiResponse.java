package data.model;

import data.model.Author;
import simpleJsonParser.JSONArray;
import simpleJsonParser.JSONObject;
import simpleJsonParser.parser.JSONParser;
import simpleJsonParser.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class ApiResponse {
    public String page;
    public Long per_page;
    public Long total;
    public Long total_pages;
    public List<Author> data = new ArrayList<>();

    public ApiResponse(JSONObject jsonObject) throws ParseException {
        this.page = (String) jsonObject.get("page");
        this.per_page = (Long) jsonObject.get("per_page");
        this.total = (Long) jsonObject.get("total");
        this.total_pages = (Long) jsonObject.get("total_pages");

        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray)  jsonObject.get("data");

        for (Object json : jsonArray) {
            data.add(new Author((JSONObject) json));
        }
    }
}
