package main.personas;
//junit
public class main {
    public static void main(String[] args) {
        Persona a = new Paula(2);
        a.print(); //Soy paula

        Persona b =new Maria(2);
        b.print();//soy una persona y tengo 2 años

        Maria c = new Maria(2);
        c.print(); //soy una persona y tengo 2 años

        Persona d = new Maria(23);
        ((Maria)d).sayHello();

        Persona[] array = {new Maria(23), new Maria(34), new Paula(45)};
        for (int i=0;i< array.length;i++){
            array[i].print();
        }

    }
}
