/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SUELDOEMPLEADOS.java."

import java.io.*;

public class sueldoempleados {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		double mayor_sueldo;
		double menor_sueldo;
		double promedio;
		double sueldo;
		double suma;
		double vector[];
		vector = new double[10];
		mayor_sueldo = 0;
		menor_sueldo = 0;
		suma = 0;
		for (i=0;i<=9;i++) {
			System.out.println("- Ingrese el sueldo del empleado Nº "+i+1);
			vector[i] = Double.parseDouble(bufEntrada.readLine());
			suma = suma+vector[i];
		}
		promedio = suma/10;
		for (i=0;i<=9;i++) {
			if (promedio>mayor_sueldo || promedio<mayor_sueldo) {
				mayor_sueldo = vector[i];
			} else {
				if (promedio<mayor_sueldo) {
					menor_sueldo = vector[i];
				}
			}
		}
		System.out.println("** El Sueldo Promedio es: "+promedio);
		System.out.println("** El Sueldo mayor a Promedio es: "+mayor_sueldo);
		System.out.println("** El Sueldo menor a Promedio es: "+menor_sueldo);
	}


}

