Algoritmo pseudocodigoEjercicio7
	contadorImpar = 0
	contadorPar = 0
	Para i<-1 Hasta 15 Con Paso 1 Hacer
		num_random<-0+azar(36)
		Escribir "Los numeros son: ",num_random
		si num_random == 0 Entonces
			contadorCero = contadorCero+1
			
		SiNo
			si num_random mod 2 == 0 Entonces
				contadorPar = contadorPar+1
				
			SiNo
				contadorImpar = contadorImpar+1
			FinSi
		FinSi
	Fin Para
	
	Escribir "EL porcentaje de numeros pares es: ",((contadorPar*100)/15),"%"
	Escribir "El porcentaje de numeros impares es: ",((contadorImpar*100)/15),"%"
	Escribir "El porcentaje de ceros generados es: ",((contadorCero*100)/15),"%"
FinAlgoritmo
