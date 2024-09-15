package Seguridad;

import java.util.Random;

public class Password 
{
	private int longitud;
    private String password;

    // Constructor por defecto
    public Password() {
        this.longitud = 10;
        this.password = generar();
    }

    // Constructor que recibe la longitud deseada
    public Password(int longitud) {
        this.longitud = longitud;
        this.password = generar();
    }

    // Getters
    public int getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }

    // Setter para longitud
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    // Método para generar la contraseña
    private String generar() {
        StringBuilder nuevaPassword = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int tipoCaracter = random.nextInt(3) + 1; // Número aleatorio entre 1 y 3

            if (tipoCaracter == 1) { // Minúscula
                char minuscula = (char) (random.nextInt(122 - 97 + 1) + 97);
                nuevaPassword.append(minuscula);
            } else if (tipoCaracter == 2) { // Mayúscula
                char mayuscula = (char) (random.nextInt(90 - 65 + 1) + 65);
                nuevaPassword.append(mayuscula);
            } else { // Número
                char numero = (char) (random.nextInt(57 - 48 + 1) + 48);
                nuevaPassword.append(numero);
            }
        }

        return nuevaPassword.toString();
    }

    // Método para validar si la contraseña es segura
    public boolean validar() {
        int cantidadNumeros = 0;
        int cantidadMinusculas = 0;
        int cantidadMayusculas = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                cantidadNumeros++;
            } else if (Character.isLowerCase(c)) {
                cantidadMinusculas++;
            } else if (Character.isUpperCase(c)) {
                cantidadMayusculas++;
            }
        }

        // Condición de seguridad
        return cantidadNumeros >= 5 && cantidadMinusculas >= 1 && cantidadMayusculas >= 2;

    }

}
