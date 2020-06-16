package data.model;

import simpleJsonParser.JSONObject;

import java.util.Date;

public class Author  {
    public long id;
    public String username;
    public String about;
    public long submitted;
    public String updated_at;
    public long submission_count;
    public long comment_count = 0;
    public long created_at;

    public Author(){}
    Author(JSONObject jsonObject){
        this.id = (Long) jsonObject.get("id");
        this.about = (String) jsonObject.get("about");
        this.username = (String) jsonObject.get("username");
        this.submitted = (Long) jsonObject.get("submitted");
        this.updated_at = (String) jsonObject.get("updated_at");
        this.submission_count = (Long) jsonObject.get("submission_count");
        this.comment_count = (Long) jsonObject.get("comment_count");
        this.created_at = (Long) jsonObject.get("created_at");
    }
}


/*
"id": 1,
            "username": "epaga",
            "about": "Java developer / team leader at inetsoftware.de by day<p>iOS developer by night<p>http://www.mindscopeapp.com<p>http://inflightassistant.info<p>http://appstore.com/johngoering<p>[ my public key: https://keybase.io/johngoering; my proof: https://keybase.io/johngoering/sigs/I1UIk7t3PjfB5v2GI-fhiOMvdkzn370_Z2iU5GitXa0 ]<p>hnchat:oYwa7PJ4Yaf1Vw9Om4ju",
            "submitted": 654,
            "updated_at": "2019-08-29T13:45:12.000Z",
            "submission_count": 197,
            "comment_count": 439,
            "created_at": 1301039509
 */