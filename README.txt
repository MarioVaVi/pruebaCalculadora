+Estructura:
   Esta prueba está estructurada dos proyectos independientes:

    --Una API con 4 operaciones,dos visibles (Suma y resta) y dos no publicadas en la interfaz (Multiplicación y División),por
    aquello de las futuras versiones que indica en el enunciado.
    Tambien estan incluidos los test Junit,proporcionando una cobertura del 100% a la capa de servicio.
    
    --Un proyecto muy básico de Spring-Boot con dos operaciones REST (Una para cada operación publicada,con la ruta
    http://localhost:8087/calculadora/api/restador y http://localhost:8087/calculadora/api/sumador) que puede ser consumido 
    desde cualquier programa cliente (Tipo SOAP-UI) al cual he añadido al POM la dependencia de la librería traccer (Que 
    básicamente imprime el resultado) que esta utilizada en ambas operaciones.

+Instalacion y Arranque:
    1º- Puesto que ambos proyectos se encuentran en un repositorio,la opción mas sensata es la de utilizar un plugin propio de    
    nuestro entorno de desarrollo (En este caso,vamos a utlizar Eclipse con el plugin Subversive) y realizar un checkout de 
    ambos proyectos para añadirlos automaticamente a nuestro Workspace.
    
    2º- Como se puede observar,se trata de un par de proyectos tipo Maven,pero aun no tienen la estructura de paquetes creada.
    Para ello,basta con hacer click derecho en el proyecto,selecionar Configure --> Convert to Maven Proyect.
    De esta manera se recreará el proyecto y se creará la estructura necesaria para su correcto funcionamiento.
    
    3º- A continuacion,si se tiene configurado de forma automatica (Si no,habrá que hacerlo de forma manual haciendo click 
    derecho sobre el proyecto y seleccionando Maven --> Update Proyect) se descargaran las dependencias necesarias para la 
    compilacionde los proyectos.
    
    4º- Una vez solventados todos (O casi todos) los errores de compilacion,hacemos click derecho en cada proyecto,seleccionando 
    Run As --> Maven Build e introduciendo como comando clean install -U o clean package -U para que lo construya (Y descargue 
    las dependencias que no se hubiesen solventado).
    No olvidar desmarcar la opcion Skip Test,si en ese momento no se desea la evaluacion de los mismos.
    
    5º- Por ultimo basta con seleccionar la clase ProyectoRestServiceApplication con el boton derecho,seleccionar Run As --> 
    Java Aplication para arrancar el proyecto.
    
+Uso:
    Para hacer uso de las operaciones publicadas,solamente es necesario utilizar cualquier programa que haga las funciones de    
    cliente Rest (Como por ejemplo SOAP-UI o Postman) apuntando a las URLs de la seccion estructura,
    con un mensaje request del tipo:
            
            <RequestSumador>
                <elemento1>2.0</elemento1>
                <elemento2>1.0</elemento2>
            </RequestSumador>
            
     Obteniendose una respuesta del tipo:
            
            <responseSumador>
                <solucion>3.0</solucion>
            </responseSumador>
            
+Seguimiento del desarrollo:

    -Tal como se explica en la sección de estructura,esta prueba se compone de 2 proyectos,una API y un proyecto
    de WebService Rest.
    
    Para llevarlo a cabo,en primer lugar hemos creado el proyecto api,en el cual hemos implementado en la capa de servicio,los 
    metodos que queremos utilizar en el WS (Se puede observar que intencionadamente,no los hemos publicado todos en la 
    interfaz),solamente los que nos interesan.Tambien hemos añadido al POM las dependencias necesarias.
    
    -Hemos creado una clase de Test (JUnit) para verificar el correcto funcionamiento de dichos metodos,alcanzando una cobertura  
    del 100% en la capa de servicio.
    
    -Adicionalmente se ha creado una clase de configuracion,ApiConfig,para añadir cualquier configuracion posterior que 
    necesitasemos y como punto de anclaje al escaneo de beans,así todos los beans que se encuentren o se añadan a su misma 
    altura o en subpaquetes inferiores serán automaticamente instanciados por Spring (Al arrancar) sin volver a tocar la 
    configuracion.
    
    -Por último,en el aplication.properties,hemos definido las propiedades de arranque del proyecto (En este caso el puerto 8087 
    y el contexto que es /calculadora).
    
    -Una vez que hemos tenido completada la parte de la API,empezamos con el proyecto de WebServices.
    Hemos creado un proyecto con un controlador tipo Rest que contiene las dos operaciones que hemos descrito anteriormente 
    (Sumador y Restador) y hemos añadido al pom tanto las dependencias necesarias como las librerias de nuestra API y la de   
    Tracer (La cual hemos instalado previamente por consola para almacenar la dependencia en nuestro reposotorio de maven).
    
    -Para poder hacer las peticiones REST,es imprescindible crear un objeto request (Que contendrá el mensaje de entrada) y un 
    objeto Response (Que contendrá la respuesta),los cuales los crearemos en la carpeta model.
    
    -Puesto que se trata de operaciones muy sencillas y sin conexiones a BBDD de ningun tipo,no vemos necesario el uso de DTOs 
    como tal y podemos crear ambas peticiones con clases Java básicas (En este caso se utiliza el tipo Double).
    
    -Por último se crea la clase de arranque (Y se añade al POM) ProyectoRestServiceApplication y una clase de configuracion 
    similar a la de la API,añadiendo ambas al @ComponentScan.
    
Para finalizar,se arranca el proyecto REST como una Java Application en el servidor embebido de Spring.
