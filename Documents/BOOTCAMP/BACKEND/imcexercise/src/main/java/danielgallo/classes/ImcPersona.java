package danielgallo.classes;

public class ImcPersona {
     public static void interpretarIMC(double imc) {
        if (imc < 16) {
            System.out.println("Delgadez severa");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Delgadez moderada");
        } else if (imc >= 17 && imc < 18.5) {

        
            System.out.println("Delgadez leve");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad leve");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad moderada");
        } else {
            System.out.println("Obesidad");
        }
    }
}
