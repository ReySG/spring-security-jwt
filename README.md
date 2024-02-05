Autenticacion con spring security 6 y JWT
Base de Datos: MySQL

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
