package Estudiantes;

import java.util.HashMap;

public class RegistroEstudiantes 
{

	public static void main(String[] args)
	{
		// Creamos un HashMap para almacenar estudiantes con su ID como clave
        HashMap<Integer, Estudiante> estudiantes = new HashMap<>();

        // Añadimos algunos estudiantes al HashMap
        estudiantes.put(101, new Estudiante("Carlos", 20));
        estudiantes.put(102, new Estudiante("María", 22));
        estudiantes.put(103, new Estudiante("Juan", 19));

        // Buscamos un estudiante por su ID
        int idBuscado = 102;
        if (estudiantes.containsKey(idBuscado)) {
            Estudiante estudiante = estudiantes.get(idBuscado);
            System.out.println("Información del estudiante con ID " + idBuscado + ": " + estudiante);
        } else {
            System.out.println("Estudiante con ID " + idBuscado + " no encontrado.");
        }

	}

}
