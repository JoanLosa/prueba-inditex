# Prueba técnica Inditex

Esta es una pequeña demo como prueba técnica para Inditex. Aquí se detallan los requisitos para ejecutar el código y
explicaciones sobre la arquitectura y principios utilizados

## Requisitos

* Java 17+ instalado
* Lombok instalado en el IDE

## Explicación

### Arquitectura

Me he decantado por una arquitectura hexagonal por ser la preferida por la empresa para la prueba. He creado una **façade** 
para evitar el anti-patrón de *fat controller*. El servicio no debería tener responsabilidad de componer, así que la *façade*
era una buena elección también por eso. El modelo ha quedado *anémico* (carente de lógica) pero la prueba no
requería validaciones de los resultados de la BDD, así que tampoco era necesario añadir nada. Lo mismo para el servicio,
que ha quedado como una pasarela al repositorio por falta de lógica fuera de la BDD. 

### Principios
He utilizado el principio SOLID a la vez que el KISS y el YAGNI. Es decir, he evitado hacer abstracciones complejas que 
pudieran dificultar la lectura y mantenimiento del código, por eso me he decantado por usar las interfaces de 
JPA para construir queries abstractas a través del nombre del método. Se entiende perfectamente la petición que realiza
el método únicamente leyendo el (larguísimo) nombre.

### Eficiencia

He añadido un *covering index* (un índice que cubre todos los campos de la consulta) para una mayor eficiencia. También
he evitado añadir anotaciones propias u abstracciones costosas a nivel de recursos (y de entendimiento).

### Notas

No estoy familiarizado con controllerAdvice, así que he preferido no utilizarlo.