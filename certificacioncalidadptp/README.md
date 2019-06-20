# Certificacion Calidad (PTP: prueba te�rico-pr�ctica)

El presente repositorio es usado como base para iniciar la prueba de automatizaci�n que esta contemplada dentro del proceso de Certificaci�n para las personas de Calidad.

A continuaci�n se presenta un conjunto de actividades que deben ser contempladas durante la prueba de automatizaci�n:

Actividad            | Consideraciones importantes
:------------------- |:-------------------------------------
0. Precedente |*Antes del inicio de la prueba automatizada* la persona de Calidad ya debi� haber desarrollado ciertas **actividades** y/o an�lisis sobre un **ejercicio planteado** como parte del proceso de certificaci�n.
 | Para el desarrollo de la automatizaci�n debe tener en cuenta:
 | - El **ejercicio planteado** en d�as pasados.
 | - Las **actividades previamente** analizadas y solucionadas en relaci�n con el ejercicio planteado.
 | - La informaci�n y/o indicaciones recibidas por medio de correo electr�nico (*en donde se expresa la visita al presente repositorio*)
1. Cree una rama a partir del repositorio actual (dicha rama debe ser usada para desarrollar la automatizaci�n de la prueba)|El nombre de la rama debe poseer el siguiente formato: feature/CERT_PTP_1er_nombre_1er_apellido_fecha_DDMMAAAA
|**Ejemplo** (nombre de la rama): feature/CERT_PTP_Luis_Florez_15052019
|Es requerido que el repositorio original **NO** sea modificado; por tal motivo debe realizar la prueba en la rama generada.
2. Cree su proyecto de automatizaci�n en la rama creada|En la rama creada: adicione las carpetas, configuraciones, recursos, y dem�s archivos que deban componer el proyecto de automatizaci�n para su correcta ejecuci�n.
3. Realice la automatizaci�n del escenario de prueba seleccionado y/o planteado en la prueba|El escenario de prueba debe contemplar un flujo completo de negocio (*tenga en cuenta la intensi�n final del negocio planteado en la prueba*)
|Use datos de prueba din�micos (*es decir *no incrustar* los datos de prueba dentro de las clases del proyecto*)
|Dentro de los recursos del proyecto incluya una carpeta llamada: "*solucionfuncional*".
|En la carpeta "*solucionfuncional*" guarde el archivo de MS Excel que contiene la soluci�n a las actividades que ha desarrollado hasta este momento como parte del proceso de certificaci�n.
|La ejecuci�n del escenario de prueba automatizado debe ser satisfactoria mediante l�nea de comando.
4. Genere pull request con el proyecto de automatizaci�n desarrollado|El pull request debe estar dirigido/asignado a las personas que hayan sido definidas en el correo electr�nico donde se expresa la visita al presente repositorio (en su defecto: por favor asignar la solicitud al revisor: "certificacion_calidad")
|Opcional: Se recomienda adjuntar en el pull request una imagen que evidencie la ejecuci�n correcta del(de los) escenario(s) de prueba.
|Antes de enviar la solicitud de pull request: por favor seleccione la opci�n de: "Close master after the pull request is merged" / "Cerrar master despu�s que la solicitud sea fusionada"
5. Notifique v�a email la finalizaci�n de la automatizaci�n|Indique en el correo:
|*a)* Nombre de la rama donde desarroll� la automatizaci�n.
|*b)* Comando con el cual se debe ejecutar la(s) prueba(s) automatizada(s) desde consola.