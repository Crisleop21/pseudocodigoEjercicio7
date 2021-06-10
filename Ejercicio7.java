import java.io.*;
import java.math.*;

public class Ejercicio7 {

	public static void main(String args[]) {
		double contadorCero;
		double contadorImpar;
		double contadorPar;
		double i;
		double numRandom;
		contadorImpar = 0;
		contadorPar = 0;
		contadorCero = 0;
		for (i=1;i<=15;i++) {
			numRandom = 0+Math.floor(Math.random()*36);
			System.out.println("Los numeros son: "+numRandom);
			if (numRandom==0) {
				contadorCero = contadorCero+1;
			} else {
				if (numRandom%2==0) {
					contadorPar = contadorPar+1;
				} else {
					contadorImpar = contadorImpar+1;
				}
			}
		}
		System.out.println("EL porcentaje de numeros pares es: "+((contadorPar*100)/15)+"%");
		System.out.println("El porcentaje de numeros impares es: "+((contadorImpar*100)/15)+"%");
		System.out.println("El porcentaje de ceros generados es: "+((contadorCero*100)/15)+"%");
	}


}