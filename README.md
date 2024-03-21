# Homework Introduction
### Notification
* you may not be able to open the properties folder from 
gitHub webpage. This may be caused by properties/.git. Please view
propertiesFiles folder instead
* My service (DBService) requires Java 11 

## Functions and How to use them
* merged result of my service and details:
    * launch config, discovery, gateway, DBService, details and search. 
    * Send a request without parameters to GET localhost:8200/weather/search (My web browser and postman cannot access eureka). 
    * Please wait for a while before sending this request. Sometimes Gateway need some time to find instances
* Swagger ui:
  * launch config, discovery, DBService
  * type localhost:9501/swagger-ui.html. I include all Hibernate APIs. Before you use this, change the port of DBService to unencrypted
* Hystrix: I set a fallback method and a timeout setting with 10 seconds in search-dev.properties
