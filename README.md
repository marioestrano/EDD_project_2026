# ☕ Sistema de Gestión - Cafetería Java

Este proyecto es una aplicación de consola desarrollada en Java para gestionar los pedidos de una cafetería. Permite registrar clientes, asignar camareros, tomar notas de los productos consumidos (bebidas y platos) y generar un ticket final automatizado con el cálculo de precios y descuentos aplicables.

## 🚀 Características Principales

* **Gestión de Usuarios:** Registro de datos del `Cliente` y selección del `Camarero` que atiende la mesa.
* **Catálogo de Productos:** Menú predefinido que distingue entre `Bebidas` y `Platos` utilizando herencia orientada a objetos.
* **Cálculo de Descuentos:** Aplicación automática de descuentos (ej. 10% en verano para bebidas) mediante la interfaz `Descontable`.
* **Generación de Tickets:** Impresión detallada del recibo final con desglose de productos, descuentos aplicados y precio total.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java
* **Gestor de dependencias:** Maven
* **Testing:** JUnit 5
* **Documentación:** Javadoc
* **Control de Versiones:** Git / GitHub

## 📂 Estructura del Proyecto

* `/src`: Contiene todo el código fuente de la aplicación (`App.java`, modelos de datos, etc.).
* `/test`: Contiene las pruebas unitarias automatizadas para verificar la lógica de negocio.
* `/docs`: Contiene la documentación técnica del proyecto generada en formato HTML con Javadoc.
* `pom.xml`: Archivo de configuración de Maven con las dependencias y plugins necesarios.

## ⚙️ Cómo compilar y ejecutar el proyecto

Este proyecto utiliza **Maven** y **Java** para su gestión. tomar en cuenta que debes tener ambos para poder hacerlo funcionar.
Para ejecutarlo desde la terminal, sigue estos pasos:

1. **Clonar el repositorio** 
   ```bash
   git clone https://github.com/marioestrano/EDD_project_2026
   cd <nombre-de-la-carpeta-generada>
    ```

    si lo abres desde un ide solo tienes que darle a RUN

    si ejecutas la terminal solo debes ejecutar el comando 
    ```bash
    mvn exec:java -Dexec.mainClass="App"
    ```
## 💡 Instrucciones de uso
Una vez que la aplicación esté en marcha, el sistema funciona mediante interacción por consola:

Datos del cliente: El sistema te pedirá por teclado que introduzcas el nombre, apellido y teléfono del cliente. Presiona Enter tras cada dato.

Selección de personal: Se mostrará una lista de los camareros disponibles. Introduce el número (1, 2 o 3) del camarero que te atendió.

Realizar el pedido: Verás la carta completa de la cafetería con sus precios. Introduce el número del producto que deseas pedir y pulsa Enter. Puedes repetir este paso tantas veces como quieras para añadir múltiples productos.

Finalizar pedido: Cuando no desees añadir nada más, introduce el número 0.

Lectura del ticket: El programa finalizará mostrando por pantalla el ticket de compra detallado, indicando si se ha aplicado algún descuento y el total exacto a cobrar.

## 📚 Documentación
La documentación técnica de las clases y métodos principales está disponible en formato web. Para consultarla:

Navega hasta la carpeta /docs.

Abre el archivo index.html en cualquier navegador web.

## 📝 Autoría y Licencia

Autor: Mario

Licencia: Este proyecto ha sido desarrollado con fines estrictamente académicos y educativos. El código es de uso libre para revisión y evaluación.