To configure in memory DB like H2:
- go to http://localhost:8080/h2
- login with credentials in application.properties
- run insert query

To configure actuator:
- go to http://localhost:8080/actuator
- to see more data -> edit application.properties -> management.endpoints.web.exposure.include=*
