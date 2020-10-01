# Toures Balón API 

## Herramientas utilizadas
```sh
1. Java: Lenguaje de programación orientado a objetos (v11).
2. Spring Boot: Framework basado en JavaEE para reducción de complejidad de creación.
3. Maven: Herramienta para construcción de apps java.
4. MySQL: Sistema gestor de base de datos.
5. Swagger: Herramienta para documentación de los servicios.
```

### Revisión del proyecto

Este proyecto se encuentra publicado en la nube mediante el proveedor Azure contenido en Kubernetes.
Puede consultarlo la documentación de los servicios desde el siguiente enlace: [toures-balon-app](http://52.179.220.78:8080/toures-balon-api/swagger-ui/index.html?configUrl=/toures-balon-api/swagger-config)

### Ejecución local del proyecto - IDE / Java
```sh
NOTA: Para estos pasos debe tener instalado "java" y "mvn".

1. Realiza el clonado del proyecto.
$ git clone https://github.com/IngSwEspec2030/TouresBalon.git
$ git checkout back-end

2. Bajar dependencias
$ Desde el IDE al importarlo o mvn dependency:copy-dependencies ...

3. Correr la aplicación
-- Desde el IDE --
$ Ejecutar el archivo TouresBalonApplication.java en la ruta src/main/java/edu/javeriana/touresbalon

-- Desde Mvn
$ mvn clean package
$ cd target
$ java -jar Toutes-Balon-0.0.1-SNAPSHOT.jar
```

### Ejecución local del proyecto - Docker
```sh
El proyecto se encuentra montado en docker hub.
NOTA: Para estos pasos debe tener instalado "docker".

1. Bajar imagen
$ docker pull arquitectonicos3/ingsoft:1.3

2. Ejecutar la imagen
$ docker run --name xxxxx -d arquitectonicos3/ingsoft:1.3
```
