package danielgallo.classes;

public class Imc {
    public static double calculoIMC (Persona persona){
        return persona.peso / (Math.pow(persona.estatura,2));
    }
}
