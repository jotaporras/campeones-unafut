# campeones-unafut
Ejemplo para comenzar a usar jOOQ y Spring Boot

## Instalación

1. Crear la bases de datos con los archivos de la carpeta db. Primero correr el que crea la BD, (por supuesto!) Se creará una base de datos llamada unafut con dos tablas.

2. Cambiar los parámetros de conexion a la base en el pom.xml y application.properties.

3. Si esta usando un IDE, puede importarlo como un proyecto de maven existente. Si no, puede compilarlo con mvn package. Esto generara los archivos necesarios paras que corra en el target, asi como las clases que se generan automaticamente con el generador de codigo de jOOQ.
 
4. mvn run para correrlo desde consola, o simplemente correr como aplicacion Java en el IDE. El proyecto tiene un servidor apache empotrado que va a correr en http://localhost:8080/
