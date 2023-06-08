/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        int opcion;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        EstudianteDistancia estudiante = new EstudianteDistancia();
        EstudiantePresencial presencial = new EstudiantePresencial();

        System.out.println("Ingrese 1 para crear Estudiante Distancia\n"
                + "Ingrese 2 para crear Estudiante Presencial\n");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            entrada.nextLine();
            System.out.println("Ingrese nombres");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de asignaturas");
            int asignaturas = entrada.nextInt();
            System.out.println("Ingrese costo asignatura");
            double costoAsignatura = entrada.nextDouble();
            estudiante.establecerNombresEstudiante(nombres);
            estudiante.establecerApellidoEstudiante(apellidos);
            estudiante.establecerEdadEstudiante(edad);
            estudiante.establecerIdentificacionEstudiante(identificacion);
            estudiante.establecerNumeroAsginaturas(asignaturas);
            estudiante.establecerCostoAsignatura(costoAsignatura);
            estudiante.calcularMatriculaDistancia();
            System.out.printf("%s\n", estudiante);

        } else if (opcion == 2) {
            entrada.nextLine();
            System.out.println("Ingrese nombres");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese apellidos");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacionP = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edadP = entrada.nextInt();
            System.out.println("Ingrese número de asignaturas");
            int asignaturasP = entrada.nextInt();
            System.out.println("Ingrese costo asignatura");
            double costoAsignaturaP = entrada.nextDouble();
            presencial.establecerNombresEstudiante(nombre);
            presencial.establecerApellidoEstudiante(apellido);
            presencial.establecerEdadEstudiante(edadP);
            presencial.establecerIdentificacionEstudiante(identificacionP);
            presencial.establecerNumeroCreditos(asignaturasP);
            presencial.establecerCostoCredito(costoAsignaturaP);
            presencial.calcularMatriculaPresencial();
            System.out.printf("%s\n", presencial);

        } else {
            System.out.println("Opcion Incorrecta");
        }
        entrada.nextLine();

    }
}
