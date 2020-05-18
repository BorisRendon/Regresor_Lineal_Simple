# Regresor lineal


1.Objective

Vision

Quisiera que el programa que haga lo pueda utilizar para mis clases de econometría y data science , porque al ser yo el programador, le puedo ir agregando las funciones que quiero.

###### Goals	
•	Poderlo usar en clases
•	Hacerle mejoras continuas
###### Succes metric:
•	Hacerlo universal para cualquier problema de regresión lineal y correlación.
•	Interfaz gráfica
•	Intuitivo
•	Upgrades continuos.
Personas:	El programa es para mí uso personal y para compañeros de clase

## 2. Release
**Release**	: Entrega_1
**Date** : Día de entrega de la fase 1

Features
•	Inputs de manera dinámica.
•	Resultado del modelo de regresión lineal

## 3. Features
##### Feature	Resultado
**Description:**	Operar la data ingresada para obtener el resultado del modelo de regresión.
**Purpose:**	Saber el resultado
**User problem:**	Problema de regresion lineal
**User Value:**	El usuario podrá ingresar y el programa le retornará los resultados y la gráfica
**Assumptions:**	El que use el programa tiene conocimientos sobre econometría.
**Not doing**:	Resultados de un modelo de regresión múltiple.

##### Feature	Lectura de datos
**Description:"**	Leer un archivo csv para operar una base de datos predeterminada
**Purpose:**	Poder operar con bases de datos mas grandes y no tenerlo que meter a mano
**User problem:**	No tener que meter a mano toda la base de datos
**User Value:**	Usar bases de datos ya estructuradas y grandes
**Assumptions:**	El usuario meterá la información en el formato especificado

##### Feature	Inputs
 **Description:** 	Guardar los inputs en un array para poderlos manejar de mejor manera gracias a los índices del array.
**Purpose:**	Esto me servirá para saber donde tengo los valores que necesito para hacer la operación
**User problem:**	Inputs dinámicos
**User Value:**	Poder usar el programa la cantidad de veces sin tener que ‘harcodear’el programa.
Assumptions	El que use el programa tiene conocimientos sobre econometría.
**Not doing:**	Interfaz gráfica (en esta entrega)
**Acceptance criteria:** 	Lee y guarda los inputs como quiero.

## 4. User flow and design 
La idea del programa es que el usuario pueda ingresar ya sea de manera manual o leer un archivo csv y que el programa le retorne de manera agradable a la vista los resultados del modelo de la regresión lineal simple 
	

### 5. Analytics
Creo que el feature de inputs hará que el programa sea más fácil de usar ya que el usuario probará los problemas que el tenga.
Creo que el feature de resultados hará que el usuario pueda leer el resultado del programa de una manera agradable y pueda observar la gráfica y su comportamiento.
Creo que el feature de lectura de datos será esencial para cuando el usuario tenga una base de datos más grande o una base de datos ya estructurada.


	


### 6. Future work
	
**Future work:** Hacer un programa de regresiones lineales múltiples
**Purpose:**		Extender el alcance de mi programa para otro tipo de problemas.

### Primera entrega
La primera entrega del proyecto deja que el usuario pueda meter un dataset de forma manual ,
dato Y primero y dato X después.
Luego de haberlo metido el usuario puede hacer un preview del dataset en el path /show 
y luego para obtener el resultado en el path regresion.

La primera entrega resuelve el problema de regresión lineal simple con un dataset que el usario metio

### Entrega final

El proyecto es capaz de funcionar de 3 maneras:

•   **1** Cargar datos desde un csv con la ruta "/llebarbatch" le tenemos que pasar como argumento un String que será el nombre del archivo que queremos cargar, por ejemplo "test.csv". Luego para obtener el resultado vamos al path "/regresion"

•   **2** Trabajar con arrays de manera dinámica, para hacerlo primero tenemos que definir el tamaño del array, eso lo hacemos en el path "/size" que le tenemos que enviar como parámetro un int. Luego en el path "/llenar" le tenemos que enviar dos int's que deberámn ser enviados en el orden Y X, esta ruta lo que hace es que va llenando de manera dinámica el arreglo que declaramos anteriormente con su respectivo tamaño. Para llenarlo tenemos que hacer las requests del tamaño que elegimos, cada una con diferente Y y X. Luego para obtener el resultado vamos al path "/regresion"

•   **3** La tercera manera puede persistir los archivos aunque se cierre el programa, tenemos que trabajar de la manera **2** pero en despues de haberlos cargado al path "/llenar" tenemos que hacerle request al path "/llenarcsv" esto lo que va a hacer es poder leer los datos y cargarlos al csv, podemos crear un nuevo archivo o bien cargarle informacion a uno existente. Luego para obtener el resultado vamos al path "/regresion"

