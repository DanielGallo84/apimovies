package danielgallo;

import java.util.Scanner;

import danielgallo.classes.Imc;
import danielgallo.classes.ImcPersona;
import danielgallo.classes.Persona;

/**
 * Hello world!
 */
public  class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Estatura: ");
        double estatura = scanner.nextDouble();

        Persona persona = new Persona(peso, estatura);
        double imc = Imc.calculoIMC(persona);

        System.out.println("El IMC es: " + imc);

        ImcPersona.interpretarIMC(imc);
        scanner.close();
    }
}
