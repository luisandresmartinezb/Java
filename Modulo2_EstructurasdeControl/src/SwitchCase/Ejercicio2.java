package SwitchCase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		  // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para realizar múltiples operaciones hasta que el usuario decida salir
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitar al usuario que ingrese el primer número
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();

                // Solicitar al usuario que ingrese el segundo número
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();

                // Solicitar al usuario que ingrese un operador
                System.out.print("Ingrese el operador (+, -, *, /, %, o 'q' para salir): ");
                String operadorInput = scanner.next();

                // Si el usuario desea salir, romper el bucle
                if (operadorInput.equals("q")) {
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    continue; // Saltar a la siguiente iteración del bucle (que sería la salida)
                }

                // Convertir el operador ingresado en un char
                char operador = operadorInput.charAt(0);

                // Variable para almacenar el resultado
                int resultado = 0;
                boolean operacionValida = true;

                // Usar el switch para realizar la operación según el operador ingresado
                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                        break;
                    case '-':
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                        break;
                    case '*':
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                        } else {
                            System.out.println("Error: División por cero no permitida.");
                            operacionValida = false;
                        }
                        break;
                    case '%':
                        if (num2 != 0) {
                            resultado = num1 % num2;
                            System.out.println("Resultado: " + num1 + " % " + num2 + " = " + resultado);
                        } else {
                            System.out.println("Error: División por cero no permitida.");
                            operacionValida = false;
                        }
                        break;
                    default:
                        System.out.println("Operador no válido. Intente nuevamente.");
                        operacionValida = false;
                        break;
                }

                // Confirmar si la operación fue válida y mostrar el resultado
                if (operacionValida) {
                    System.out.println("Operación realizada correctamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese números enteros válidos.");
                scanner.next(); // Limpiar el scanner para evitar el bucle infinito de errores
            }
        }

        // Cerrar el scanner
        scanner.close();
		
		
	}

}
