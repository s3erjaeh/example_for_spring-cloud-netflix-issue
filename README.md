# spring-cloud-netflix-issue-
this is a reproducing of issue: https://github.com/spring-cloud/spring-cloud-netflix/issues/

launch ZuulApplication and MockServerApplication.

request to reproduce:
```
 curl -X POST \
    'http://127.0.0.1:8089/test?name=hello%20world' \
     -H 'content-type: multipart/form-data;' \
     -F key=value
  ```
actual:   "name = hello world,hello world"
expected: "name = hello world"
```
 curl -X POST \
    'http://127.0.0.1:8089/test?name=hello_world' \
     -H 'content-type: multipart/form-data;' \
     -F key=value
  ```
actual:   "name = hello_world"
expected: "name = hello_world"

key name has duplicated value if it contains a space (%20) character;
