# epam-talent-land
MicroServicios

Los archivos user.zip y balance.zip son proyectos que se generaron
desde 0 usando https://start.spring.io/
para ver las dependencias y configuraciones que se usaron ver 
los archivos user.png y balance.png

los archivos descomprimidos de user y balance 
se encuentran listos para importar usando maven o Gradle.

Instrucciones:
Descargar STS de : https://spring.io/tools
Click derecho en Package Explorer y poner opcion import

Seleccionar Existing Maven project para balance
y Gradle para user


ejemplos con Curl para app users:

--List users
curl -v localhost:8081/users | json_pp

-- Get user by id
curl -v localhost:8081/users/yussef.glz@epam.com | json_pp

----Insert user
curl -X POST localhost:8081/users -H 'Content-type:application/json' -d '{"id": "talent_land@epam.com", "completeName": "TL/EPAM", "idRol":"1", "isActive":"1","password":"$1$SfdTRgfSDDSGF"}'

--Alter user
curl -X PUT localhost:8081/users/yussef.glz@epam.com -H 'Content-type:application/json' -d '{"completeName": "Nuevo nombre actualizado", "idRol":"1", "isActive":"1", "password":"$1$SfdTRgfSDDSGF"}'


--Delete user
curl -X DELETE localhost:8081/users/yussef.glz@epam.com




ejemplos curl balance app


curl -v  localhost:8080/balance/getLastThreeMonths/yussef.gz@epam.com | json_pp


Nota: Si son metodos GET pueden usar el navegador ejemplo:

http://localhost:8080/balance/getLastThreeMonths/yussef.gz@epam.com



