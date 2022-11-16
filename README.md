# TestFalabella

- Proyecto para la construcción y ejecución de 5 funcionalidades de la plataforma Falabella
- El proyecto utiliza Java 8, Serenity BDD, Cucumber 4

## La estructura de directorio del proyecto
### Capas Principales:
* Features: En esta capa se escriben los archivos .feature, estos describen las características y escenarios a probar haciendo uso del lenguaje Gherkin, además se pueden entender como las historias de usuario a desarrollar.

* Runners: Contiene los archivos runner encargados de ejecutar los escenarios de los feature. Se usan las anotaciones @RunWhit() @CucumberOptions() para especificar qué ejecutar y cómo hacerlo.

* Step Definitions: Gestiona los fragmentos de código definidos en el Given, Then, When de los escenarios de los archivos .feature. Los fragmentos de código son conocidos como Code Snippets los cuales son métodos que mapean las instrucciones de los escenarios.

* Tasks: Esta clase contiene las clases que son el corazón del patrón de screenplay=Las tareas. Las tareas son acciones de alto nivel que definen un conjunto de interacciones en el lenguaje de negocio.

* Questions: Esta capa gestiona los Asserts o verificaciones de las pruebas las cuales son el fin último de las mismas, ya que con estas capturamos la información de la interfaz que puede ser usada. Text,Value, Visibility.

* User Interface: Almacena las clases en las cuales se mapean los elementos de la interfaz de usuario, inputs o botones.
                  NOTA: Únicamente se mapean los elementos, las interacciones con los mismos se llevan a cabo por las interacciones en la capa de interactions.
                  
                  
## Plugins Requeridos de IntelliJ:
Para el correcto uso del proyecto, se recomienda utilizar la versión de IntelliJ IDEA 2019 Community Edition en esta se debe adicionar los siguientes plugins:

* Gherkin
* Cucumber for Java
* SonarLint

> **Nota**:
>
> - Recuerde que en la herramienta de IntelliJ se puede hacer uso de la siguiente ruta para revisar los plugin instalados:
>
>       File >> Settings >> Plugins >> Pestaña Installed
>
> - Y para instalar un plugin requerido recuerde ir al repositorio de plugins:
>
>       File >> Settings >> Plugins >> Pestaña Marketplace

#### Comando para ejecutar los Test:
Ejecute ```gradlew test clean agreggate``` desde la linea de comandos

> **Nota**:
>
> - Para usuarios Windows: La ultima versión de chromedriver está incluida en el proyecto y tu sistema necesitara mínimo Chrome version 78 para correr las pruebas.
> - Por defecto, los test correran usando Chrome.
> - El resultado de los test será almacenado aquí `target/site/serenity/index.html`
