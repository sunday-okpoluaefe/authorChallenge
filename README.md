
In this challenge, the REST API contains information about a collection of users and articles they created. Given the threshold value, the goal is to use the API to get the following

The list of most active authors according to a set threshold
The author with the highest comment count.
The list of the authors sorted by when their record was created according to a set threshold.
To access the collection of users perform HTTP GET request to

```

https://jsonmock.hackerrank.com/api/article_users/search?page=<pageNumber>

```

where is an integer denoting the page of the results to return.

for example, GET request to:

```

https://jsonmock.hackerrank.com/api/article_users/search?page=2

```

will return the second page of the collection of users. Pages are numbered from 1, so inorder to access the first page, you need to ask for page number 1.

The response to such request is a JSON with the following 5 fields

page: The current page of the result
per_page: The maximum number of users returned per page
total: The total number of users on all pages of the result
total_pages: The total number of pages with results
data: An aray of objects containing users returned on the requested page
Each user record has the following schema:

id: unique ID of the user
username: the username of the user
about: the about infomation of the user
submitted: total number of articles submitted by the user
updated_at: the date and time of the last update to this record
submission_count: the number of submitted articles that are approved
comment_count: the total number of comments the user made
created_at: the date and time when the record was created
function one
The list of most active authors according to a set threshold

```

public static List<String> getUsernames(int threshold) {
   
}

```

This function would retrieve the names of the most active authors(using submission_count as the criteria) according to a set threshold.

function two
The author with the highest comment count.

```

public static String getUsernameWithHighestCommentCount...

```
This function would retrieve the name of the author with the highest comment count.

function three
The list of the authors sorted by when their record was created according to a set threshold.

```

public static List<String> getUsernamesSortedByRecordDate(int threshold) {
   
}

```
