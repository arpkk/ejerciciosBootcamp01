package main.personas;

final public class Paula extends Persona{

    public Paula (int edad){
        super(edad);
    }
    @Override
    public String print() {
        String saludo="Soy Paula";
        System.out.println(saludo);
        return saludo;
    }
}
