# Front - End Toures Balón
![](src/assets/icon/favicon.png)

## Herramientas utilizadas
```sh
1. Npm: Gestor de paquetes para Node Js.
2. Node: Ejecución server side Angular.
3. Ionic: Framework de desarrollo hibrido.
4. Azure: Proveedor de nube para publicar el proyecto a un app service.
```

### Revisión del proyecto
```sh
Este proyecto se encuentra publicado en la nube mediante el proveedor Azure.
Puede consultarlo mediante la URL: http://toures-balon.azurewebsites.net/
```

### Ejecución local del proyecto
```sh
NOTA: Para estos pasos debe tener instalado "npm", "node" y el CLI de "ionic".

1. Realiza el clonado del proyecto.
$ git clone https://github.com/IngSwEspec2030/TouresBalon.git
$ git checkout front-end

2. Bajar dependencias
$ npm i

3. Correr la aplicación
$ ionic serve
```
### Publicación y despliegue en el ambiente productivo.
```sh
NOTA: Para estos pasos debe tener instalado "npm", "node", el CLI de "ionic" y el CLI de azure "az".

1. Realizar el login hacia azure
$ az login

1. Generar el build del aplicativo
$ ionic build

2. Ingresar a la carpeta del build y publicar en el app service.
$ cd www
$ az webapp up -n toures-balon -l "East US" -g "puj-pica-tb" --html

```
