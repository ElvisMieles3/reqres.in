# Automatización de Servicios

Se realizar la automatización de servicios tipo Rest obtenidos desde el portal https://reqres.in/; se desea validar y verificar el correcto funcionamiento de las funcionalidades.
 
 1.Registrar cliente.
 
 2.Eliminar Cliente por ID.
 
 3.Actualizar datos del cliente.
 
 4. Consultar cliente por ID.

Comenzando ✒️

Con este proyecto se desea  realizar una automatización de servicios REST basandonos  en los principios SOLID y FIRST, para un mejor entendimiento en los resportes se utiliza BDD, Cucumber y serenity con  el gestor de dependencias Maven.

Pre-requisitos 📋

Para la ejecución de este proyecto desdemos tener presente que debemos tener instalado el JDK de java y las variables de entorno, las cuales son:

 1. JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files (x86)\Java\jdk1.8.0_251
 2. MAVEN_HOME: Descarga el Apache Maven y se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en C:\Program Files\apache-maven-3.6.3-bin\apache-maven-3.6.3
 3. Tener un IDEA instalado para la observación o modificación del codigo.
 4. En la raiz de proyecto debemos tener 2 documentos.

Ejecutando las pruebas ⚙️

Para la ejecución del proyecto debe tener presente que las variables de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas la cual se encuentra en el archivo  pom.xml.

La prueba se puede ejecutar por medio de la clase RegistrarRunners, la cual esta ubicada en src\test\java\co\certificación\reqres\runner o por medio de la consola del proyecto con el comando mvn clean verify

Para observar las evidencias de las pruebas debemos ejecutar el script y ingresar a la ruta target\site\serenity , allí buscamos el primer archivo HTML que encontramos en la carpeta.


