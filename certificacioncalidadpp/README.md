# Certificacion Calidad (PP: Prueba Práctica)

El presente repositorio es usado como base para presentar la prueba práctica de automatización que esta contemplada dentro del proceso de Certificación para las personas de Calidad.

A continuación se presenta un conjunto de actividades que deben ser contempladas durante la prueba de automatización:


Actividad            | Consideraciones importantes
:------------------- |:-------------------------------------
0. Precedente |El presente repositorio ya cuenta con un proyecto BDD de automatización que usa las herramientas: gradle, cucumber y serenity BDD (usando: Page, Steps y Definitions).
|Para el desarrollo de la prueba debe tener en cuenta:
|- La información y/o indicaciones recibidas por medio de correo electrónico (en donde se expresa la visita al presente repositorio)
1. Cree una rama a partir del repositorio actual|Esta rama debe ser usada para desarrollar los ajustes de automatización que sean necesarios para que el escenario automatizado ejecute correctamente y realice lo planteado en el Gherkin
|El nombre de la rama debe poseer el siguiente formato: feature/CERT_PP_1er_nombre_1er_apellido_fecha_DDMMAAAA
|**Ejemplo** (nombre de la rama): feature/CERT_PP_Maira_Patinio_04062019
|Es requerido que el repositorio original **NO** sea modificado; por tal motivo debe realizar los ajustes en la rama generada.
2. Lea y entienda el objetivo del escenario planteado en el Gherkin.|
3. Realice los ajustes necesarios para que el escenario de prueba se logre compilar y ejecutar correctamente mediante la consola de comandos (_y según lo que se menciona en el Gherkin_).|
4. Genere pull request con los ajustes realizados en el proyecto de automatización.|El pull request debe estar dirigido/asignado a las personas que hayan sido definidas en el correo electrónico donde se expresa la visita al presente repositorio (en su defecto: por favor asignar la solicitud al revisor: "certificacion_calidad")
|Opcional: Se recomienda adjuntar en el pull request una imagen que evidencie la ejecución correcta del(de los) escenario(s) de prueba.
|Antes de enviar la solicitud de pull request: por favor seleccione la opción de: "Close master after the pull request is merged" / "Cerrar master después que la solicitud sea fusionada"
5. Notifique vía email la finalización de la prueba|Indique en el correo:
|*a)* Nombre de la rama donde desarrolló la automatización.
|*b)* Comando con el cual se debe ejecutar la(s) prueba(s) automatizada(s) desde consola.