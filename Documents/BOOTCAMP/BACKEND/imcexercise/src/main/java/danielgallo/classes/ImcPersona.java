package danielgallo.classes;

public class ImcPersona {
     public static void interpretarIMC(double imc) {
        if (imc < 1.6) {
            System.out.println("Delgadez severa");
        } else if (imc >= 1.6 && imc < 1.7) {
            System.out.println("Delgadez moderada");
        } else if (imc >= 1.7 && imc < 1.85) {
            System.out.println("Delgadez leve");
        } else if (imc >= 1.85 && imc < 2.5) {
            System.out.println("Peso normal");
        } else if (imc >= 2.5 && imc < 3.0) {
            System.out.println("Sobrepeso");
        } else if (imc >= 3.0 && imc < 3.5) {
            System.out.println("Obesidad leve");
        } else if (imc >= 3.5 && imc < 4.0) {
            System.out.println("Obesidad moderada");
        } else {
            System.out.println("Obesidad");
        }
    }
}
