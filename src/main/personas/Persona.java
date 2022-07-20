package main.personas;

abstract public class Persona {
    private int edad;

    public Persona(int edad){
        this.edad=edad;
    }

    public String print(){
        String saludo="Soy una persona y tengo "+edad+" años";
        System.out.println(saludo);
        return saludo;
    }
}
