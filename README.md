# SpringSecurityREST
Spring Security Basic Authentication REST

This is a  RESTful service which is secured with HTTP Basic Authentication provided by Spring Security.
XML and JSONresponses are supported depending upon the "Accept" header. For example Accept : application/json will give a json response and Accept : application/xml will give XML response.

This App is deployed on Heroku.
Secure Heroku URL - https://pure-earth-1315.herokuapp.com/springsecurityrest/user/get/{your-name}

Username : omkar and  Password : omkar.

This can be tested using POSTMAN or AdvancedRESTClient tools.

url pattern 'springsecurityrest/user/**' is secured and 'springsecurityrest/hello/**' is not secured.

This call does not required Authentication : https://pure-earth-1315.herokuapp.com/springsecurityrest/hello/{your-name}


