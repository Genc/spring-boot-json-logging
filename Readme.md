# Spring Boot Docker Json Logging

A simple project where we can store logs in json format for docker and also keep http request and response(with POST body) logs with Logbook.

## Tech Stack

- Spring Boot - Version 2.6.6
- Spring Cloud Sleuth - Version 3.1.1
- Logbook (Zalando) - Version 2.14.0 
- Logstash Logback Encoder - Version 7.0.1

## Run the Application

Go to the project directory. For building the project using command line, run below command :

``` mvn clean install```

Run project in command line. Navigate to *target* directory.

``` java -jar spring-boot-docker-json-logging-1.0.0.jar```
## Default Console Log

* When the project runs in the **"dev"** profile by default, it writes to the console and **only appears request-response as JSON**

```bash

  ____                   _                     ____                    _       ____                   _                          _                           _                               _
 / ___|   _ __    _ __  (_)  _ __     __ _    | __ )    ___     ___   | |_    |  _ \    ___     ___  | | __   ___   _ __        | |  ___    ___    _ __     | |       ___     __ _    __ _  (_)  _ __     __ _ 
 \___ \  | '_ \  | '__| | | | '_ \   / _` |   |  _ \   / _ \   / _ \  | __|   | | | |  / _ \   / __| | |/ /  / _ \ | '__|    _  | | / __|  / _ \  | '_ \    | |      / _ \   / _` |  / _` | | | | '_ \   / _` |
  ___) | | |_) | | |    | | | | | | | (_| |   | |_) | | (_) | | (_) | | |_    | |_| | | (_) | | (__  |   <  |  __/ | |      | |_| | \__ \ | (_) | | | | |   | |___  | (_) | | (_| | | (_| | | | | | | | | (_| |
 |____/  | .__/  |_|    |_| |_| |_|  \__, |   |____/   \___/   \___/   \__|   |____/   \___/   \___| |_|\_\  \___| |_|       \___/  |___/  \___/  |_| |_|   |_____|  \___/   \__, |  \__, | |_| |_| |_|  \__, |
         |_|                         |___/                                                                                                                                   |___/   |___/               |___/ 
Powered by Spring Boot 2.6.6

2022-04-24 01:34:05.895  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] c.f.l.SpringBootJsonLoggingApplication   : Starting SpringBootJsonLoggingApplication using Java 11.0.9 on Faruk with PID 5788
2022-04-24 01:34:05.911  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] c.f.l.SpringBootJsonLoggingApplication   : The following 1 profile is active: "dev"
2022-04-24 01:34:07.848  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=b7d1d35c-d15c-3e6f-88dd-26931b70dbdc
2022-04-24 01:34:08.817  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-04-24 01:34:08.833  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-04-24 01:34:08.833  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.60]
2022-04-24 01:34:09.020  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-04-24 01:34:09.020  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3031 ms
2022-04-24 01:34:12.642  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 16 endpoint(s) beneath base path '/actuator'
2022-04-24 01:34:12.818  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-04-24 01:34:13.480  INFO [spring-boot-docker-json-logging,,] 5788 --- [           main] c.f.l.SpringBootJsonLoggingApplication   : Started SpringBootJsonLoggingApplication in 9.318 seconds (JVM running for 11.518)
2022-04-24 01:34:14.668  INFO [spring-boot-docker-json-logging,,] 5788 --- [3)-172.30.112.1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2022-04-24 01:34:14.668  INFO [spring-boot-docker-json-logging,,] 5788 --- [3)-172.30.112.1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2022-04-24 01:34:14.668  INFO [spring-boot-docker-json-logging,,] 5788 --- [3)-172.30.112.1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
2022-04-24 01:34:20.466 TRACE [spring-boot-docker-json-logging,f8fe8a5053320431,f8fe8a5053320431] 5788 --- [nio-8080-exec-2] org.zalando.logbook.Logbook              : {"origin":"remote","type":"request","correlation":"91e2503d24f84031","protocol":"HTTP/1.1","remote":"0:0:0:0:0:0:0:1","method":"GET","uri":"http://localhost:8080/","host":"localhost","path":"/","scheme":"http","port":"8080","headers":{"accept":["text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"],"accept-encoding":["gzip, deflate, br"],"accept-language":["en-US,en;q=0.9,tr;q=0.8"],"cache-control":["max-age=0"],"connection":["keep-alive"],"host":["localhost:8080"],"sec-ch-ua":["\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"100\", \"Google Chrome\";v=\"100\""],"sec-ch-ua-mobile":["?0"],"sec-ch-ua-platform":["\"Windows\""],"sec-fetch-dest":["document"],"sec-fetch-mode":["navigate"],"sec-fetch-site":["none"],"sec-fetch-user":["?1"],"upgrade-insecure-requests":["1"],"user-agent":["Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36"]}}
2022-04-24 01:34:20.508  INFO [spring-boot-docker-json-logging,f8fe8a5053320431,f8fe8a5053320431] 5788 --- [nio-8080-exec-2] c.f.logging.controller.HelloController   : Hello from HelloController
2022-04-24 01:34:20.557 TRACE [spring-boot-docker-json-logging,f8fe8a5053320431,f8fe8a5053320431] 5788 --- [nio-8080-exec-2] org.zalando.logbook.Logbook              : {"origin":"local","type":"response","correlation":"91e2503d24f84031","duration":163,"protocol":"HTTP/1.1","status":200,"headers":{"Connection":["keep-alive"],"Content-Length":["5"],"Content-Type":["text/html;charset=UTF-8"],"Date":["Sat, 23 Apr 2022 22:34:20 GMT"],"Keep-Alive":["timeout=60"]},"body":"Hello"}
```

- Default **HTTP Request** as JSON

```bash
{
   "origin":"remote",
   "type":"request",
   "correlation":"91e2503d24f84031",
   "protocol":"HTTP/1.1",
   "remote":"0:0:0:0:0:0:0:1",
   "method":"GET",
   "uri":"http://localhost:8080/",
   "host":"localhost",
   "path":"/",
   "scheme":"http",
   "port":"8080",
   "headers":{
      "accept":["text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"],
      "accept-encoding":["gzip, deflate, br"],
      "accept-language":["en-US,en;q=0.9,tr;q=0.8"],
      "cache-control":["max-age=0"],
      "connection":["keep-alive"],
      "host":["localhost:8080"],
      "sec-ch-ua":["\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"100\", \"Google Chrome\";v=\"100\""],
      "sec-ch-ua-mobile":["?0"],
      "sec-ch-ua-platform":["\"Windows\""],
      "sec-fetch-dest":["document"],
      "sec-fetch-mode":["navigate"],
      "sec-fetch-site":["none"],
      "sec-fetch-user":["?1"],
      "upgrade-insecure-requests":["1"],
      "user-agent":["Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36"]
   }
}
```

- Default **HTTP Response** as JSON

```bash
{
   "origin":"local",
   "type":"response",
   "correlation":"91e2503d24f84031",
   "duration":163,
   "protocol":"HTTP/1.1",
   "status":200,
   "headers":{
      "Connection":["keep-alive"],
      "Content-Length":["5"],
      "Content-Type":["text/html;charset=UTF-8"],
      "Date":["Sat, 23 Apr 2022 22:34:20 GMT"],
      "Keep-Alive":["timeout=60"]
   },
   "body":"Hello"
}
```

## JSON Log

* When the project runs with **"docker"** profile, it writes to console (STDOUT) .
* Simply run it as ```"java -jar -Dspring.profiles.active=docker spring-boot-docker-json-logging-1.0.0.jar"```

```bash

{"@timestamp":"2022-04-23T22:45:32.905Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"com.farukgenc.logging.SpringBootJsonLoggingApplication","thread_name":"main","message":"Starting SpringBootJsonLoggingApplication using Java 11.0.9 on Faruk with PID 9760"}
{"@timestamp":"2022-04-23T22:45:32.921Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"com.farukgenc.logging.SpringBootJsonLoggingApplication","thread_name":"main","message":"The following 1 profile is active: \"docker\""}
{"@timestamp":"2022-04-23T22:45:34.747Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.cloud.context.scope.GenericScope","thread_name":"main","message":"BeanFactory id=84ab223d-afab-319c-b425-e216f47d9e18"}
{"@timestamp":"2022-04-23T22:45:35.596Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer","thread_name":"main","message":"Tomcat initialized with port(s): 8080 (http)"}
{"@timestamp":"2022-04-23T22:45:35.611Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.apache.catalina.core.StandardService","thread_name":"main","message":"Starting service [Tomcat]"}
{"@timestamp":"2022-04-23T22:45:35.611Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.apache.catalina.core.StandardEngine","thread_name":"main","message":"Starting Servlet engine: [Apache Tomcat/9.0.60]"}
{"@timestamp":"2022-04-23T22:45:35.908Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/]","thread_name":"main","message":"Initializing Spring embedded WebApplicationContext"}
{"@timestamp":"2022-04-23T22:45:35.908Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext","thread_name":"main","message":"Root WebApplicationContext: initialization completed in 2909 ms"}
{"@timestamp":"2022-04-23T22:45:39.476Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver","thread_name":"main","message":"Exposing 1 endpoint(s) beneath base path '/actuator'"}
{"@timestamp":"2022-04-23T22:45:39.617Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer","thread_name":"main","message":"Tomcat started on port(s): 8080 (http) with context path ''"}
{"@timestamp":"2022-04-23T22:45:40.185Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"com.farukgenc.logging.SpringBootJsonLoggingApplication","thread_name":"main","message":"Started SpringBootJsonLoggingApplication in 9.501 seconds (JVM running for 11.428)"}
{"@timestamp":"2022-04-23T22:45:41.065Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/]","thread_name":"RMI TCP Connection(2)-172.30.112.1","message":"Initializing Spring DispatcherServlet 'dispatcherServlet'"}
{"@timestamp":"2022-04-23T22:45:41.065Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.web.servlet.DispatcherServlet","thread_name":"RMI TCP Connection(2)-172.30.112.1","message":"Initializing Servlet 'dispatcherServlet'"}
{"@timestamp":"2022-04-23T22:45:41.065Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.web.servlet.DispatcherServlet","thread_name":"RMI TCP Connection(2)-172.30.112.1","message":"Completed initialization in 0 ms"}
{"@timestamp":"2022-04-23T22:46:34.484Z","application_name":"spring-boot-docker-json-logging","level":"TRACE","logger_name":"org.zalando.logbook.Logbook","thread_name":"http-nio-8080-exec-1","message":{"origin":"remote","type":"request","correlation":"95447e6e76b3b58a","protocol":"HTTP/1.1","remote":"0:0:0:0:0:0:0:1","method":"GET","uri":"http://localhost:8080/","host":"localhost","path":"/","scheme":"http","port":"8080","headers":{"accept":["text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"],"accept-encoding":["gzip, deflate, br"],"accept-language":["en-US,en;q=0.9,tr;q=0.8"],"cache-control":["max-age=0"],"connection":["keep-alive"],"host":["localhost:8080"],"sec-ch-ua":["\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"100\", \"Google Chrome\";v=\"100\""],"sec-ch-ua-mobile":["?0"],"sec-ch-ua-platform":["\"Windows\""],"sec-fetch-dest":["document"],"sec-fetch-mode":["navigate"],"sec-fetch-site":["none"],"sec-fetch-user":["?1"],"upgrade-insecure-requests":["1"],"user-agent":["Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36"]}},"trace":{"trace_id":"aac8b858221c0f0e","span_id":"aac8b858221c0f0e"}}
{"@timestamp":"2022-04-23T22:46:34.528Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"com.farukgenc.logging.controller.HelloController","thread_name":"http-nio-8080-exec-1","message":"Hello from : HelloController","trace":{"trace_id":"aac8b858221c0f0e","span_id":"aac8b858221c0f0e"}}
{"@timestamp":"2022-04-23T22:46:34.564Z","application_name":"spring-boot-docker-json-logging","level":"TRACE","logger_name":"org.zalando.logbook.Logbook","thread_name":"http-nio-8080-exec-1","message":{"origin":"local","type":"response","correlation":"95447e6e76b3b58a","duration":139,"protocol":"HTTP/1.1","status":200,"headers":{"Connection":["keep-alive"],"Content-Length":["5"],"Content-Type":["text/html;charset=UTF-8"],"Date":["Sat, 23 Apr 2022 22:46:34 GMT"],"Keep-Alive":["timeout=60"]},"body":"Hello"},"trace":{"trace_id":"aac8b858221c0f0e","span_id":"aac8b858221c0f0e"}}

```

- For example, let's make the output in the first line pretty

```bash
{
   "@timestamp":"2022-04-23T22:45:32.905Z",
   "application_name":"spring-boot-docker-json-logging",
   "level":"INFO",
   "logger_name":"com.farukgenc.logging.SpringBootJsonLoggingApplication",
   "thread_name":"main",
   "message":"Starting SpringBootJsonLoggingApplication using Java 11.0.9 on Faruk with PID 9760"
}

```

- Default **HTTP Request** as JSON

```bash
{
   "@timestamp":"2022-04-23T22:46:34.484Z",
   "application_name":"spring-boot-docker-json-logging",
   "level":"TRACE",
   "logger_name":"org.zalando.logbook.Logbook",
   "thread_name":"http-nio-8080-exec-1",
   "message":{
      "origin":"remote",
      "type":"request",
      "correlation":"95447e6e76b3b58a",
      "protocol":"HTTP/1.1",
      "remote":"0:0:0:0:0:0:0:1",
      "method":"GET",
      "uri":"http://localhost:8080/",
      "host":"localhost",
      "path":"/",
      "scheme":"http",
      "port":"8080",
      "headers":""
   },
   "trace":{
      "trace_id":"aac8b858221c0f0e",
      "span_id":"aac8b858221c0f0e"
   }
}

```

- Default **HTTP Response** as JSON

```bash
{
   "@timestamp":"2022-04-23T22:46:34.564Z",
   "application_name":"spring-boot-docker-json-logging",
   "level":"TRACE",
   "logger_name":"org.zalando.logbook.Logbook",
   "thread_name":"http-nio-8080-exec-1",
   "message":{
      "origin":"local",
      "type":"response",
      "correlation":"95447e6e76b3b58a",
      "duration":139,
      "protocol":"HTTP/1.1",
      "status":200,
      "headers":""
      "body":"Hello"
   },
   "trace":{
      "trace_id":"aac8b858221c0f0e",
      "span_id":"aac8b858221c0f0e"
   }
}
```

* You can access the **logback configuration** under **src/main/resources/logback-spring.xml**

## Run as Docker Container

You can see Dockerfile in project directory. If you want to create an image you can use Dockerfile.
But I already created it, you can acces it on [DockerHub].

Let's run it quickly and look at the container logs;

```bash
docker pull omerfarukgenc34/spring-boot-docker-json-logging

docker run -d -p 8080:8080 --name spring-boot-docker-json-logging omerfarukgenc34/spring-boot-docker-json-logging

docker logs -f spring-boot-docker-json-logging
```

* It should look like this

```bash
~ docker ps

CONTAINER ID   IMAGE                                             COMMAND                  CREATED         STATUS         PORTS                    NAMES
9aac1947f3e4   omerfarukgenc34/spring-boot-docker-json-logging   "java -jar spring-bo…"   2 minutes ago   Up 2 minutes   0.0.0.0:8080->8080/tcp   spring-boot-docker-json-logging

~ docker logs spring-boot-docker-json-logging

{"@timestamp":"2022-04-23T23:31:55.805Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"com.farukgenc.logging.SpringBootJsonLoggingApplication","thread_name":"main","message":"Starting SpringBootJsonLoggingApplication v1.0.0 using Java 11.0.14.1 on 9aac1947f3e4 with PID 1 (/spring-boot-docker-json-logging/spring-boot-docker-json-logging.jar started by root in /spring-boot-docker-json-logging)"}
{"@timestamp":"2022-04-23T23:31:55.825Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"com.farukgenc.logging.SpringBootJsonLoggingApplication","thread_name":"main","message":"The following 1 profile is active: \"docker\""}
{"@timestamp":"2022-04-23T23:31:59.361Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.cloud.context.scope.GenericScope","thread_name":"main","message":"BeanFactory id=dfab2e43-939d-3350-99b6-e37454055a8c"}
{"@timestamp":"2022-04-23T23:32:01.373Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer","thread_name":"main","message":"Tomcat initialized with port(s): 8080 (http)"}
{"@timestamp":"2022-04-23T23:32:01.407Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.apache.catalina.core.StandardService","thread_name":"main","message":"Starting service [Tomcat]"}
{"@timestamp":"2022-04-23T23:32:01.408Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.apache.catalina.core.StandardEngine","thread_name":"main","message":"Starting Servlet engine: [Apache Tomcat/9.0.60]"}
{"@timestamp":"2022-04-23T23:32:01.631Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/]","thread_name":"main","message":"Initializing Spring embedded WebApplicationContext"}
{"@timestamp":"2022-04-23T23:32:01.631Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext","thread_name":"main","message":"Root WebApplicationContext: initialization completed in 5673 ms"}
{"@timestamp":"2022-04-23T23:32:06.663Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver","thread_name":"main","message":"Exposing 16 endpoint(s) beneath base path '/actuator'"}
{"@timestamp":"2022-04-23T23:32:06.824Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer","thread_name":"main","message":"Tomcat started on port(s): 8080 (http) with context path ''"}
{"@timestamp":"2022-04-23T23:32:06.89Z","application_name":"spring-boot-docker-json-logging","level":"INFO","logger_name":"com.farukgenc.logging.SpringBootJsonLoggingApplication","thread_name":"main","message":"Started SpringBootJsonLoggingApplication in 13.294 seconds (JVM running for 14.559)"}

```

## See also

* https://github.com/zalando/logbook
* https://logback.qos.ch/manual/index.html
* https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.logging
* https://cassiomolin.com/2019/06/30/log-aggregation-with-spring-boot-elastic-stack-and-docker/

## License
Apache License 2.0

[DockerHub]: <https://hub.docker.com/r/omerfarukgenc34/spring-boot-docker-json-logging>
