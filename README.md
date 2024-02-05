Autenticacion con spring boot:
Tecnologias:
- Spring boot 3
- Spring Security 6
- JWT
- MySQl
- Maven

Endpoints:

- http://localhost:8080/auth/login
  Body Params:
    {
    "username":"",
    "password":"",
}
  
- http://localhost:8080/auth/register
  Body Params:
  {
    "username":"",
    "password":"",
    "lastname":"",
    "firstname":"",
    "country":""
}
