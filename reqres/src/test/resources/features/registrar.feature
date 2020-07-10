#language: es
# Author: elvismieles@gmail.com

Característica: creacion cliente desde el servicio
  Yo como Analista de Calidad
  Deseo validar la funcionalidad del modulo cliente de los servicios Rest
  Para garantizar que los usuarios puedan  realizar el CRUD


  Escenario: El Analista de Calidad verifica la respuesta del servicio de registrar cliente
    Dado el Analista envia la peticion con los datos:
      | email              | password |
      | eve.holt@reqres.in | pistol   |
    Cuando que el Analista desea consumir el servicio llamado 'register'
    Entonces el deberia ver que la respuesta es un codigo '201'
    Y el mensaje '415' en el campo 'id'



  Escenario: El Analista de Calidad verifica que el servicio permita elimimar el cliente
    Dado El analista consulta el servicio de consultar 'cliente'
    Cuando El analista realiza la consulta de 'eliminar' cliente con el siguiente Id '2'
    Entonces El Analista obtiene como codigo de respuesta '204'


