package main.frutas;

public class Juguera {
    private int n;
    private double mlManzana=0;
    private double mlPlatano=0;
    private double mlPera=0;

    public Juguera(int n) {
        this.n = n;
    }

    public boolean seRebalsa(){
        if(mlManzana+mlPlatano+mlPera>n)
            return true;
        return false;
    }

    public String agregarFruta (String nombreFruta,int ml){
        String respuesta="";
        if(!seRebalsa()){
            if(nombreFruta.equals("Manzana")){
                this.mlManzana+=ml;
            }
            else if(nombreFruta.equals("Platano")){
                this.mlPlatano+=ml;
            }
            else if(nombreFruta.equals("Pera")){
                this.mlPera+=ml;
            }
            else{
                return null;
            }
            respuesta="Agregue "+nombreFruta;
        }
        else{
            respuesta="No se puede llenar mas";
        }
        return respuesta;
    }

    public String beber(int mlBebido){
        double total= mlManzana+mlPlatano+mlPera;
        //(manzana/x)+(platano/n)+(pera/x)=total - bebido
        //!=0
        double restaTotal=total-mlBebido;
        //manzana + platano + pera = total - bebido * x
        //total = restatotal * x
        // total/restatotal= x
        double x =total/restaTotal;

        mlManzana=mlManzana/x;
        mlPlatano=mlPlatano/x;
        mlPera=mlPera/x;

        if(restaTotal>0){
            return "Me quedo "+restaTotal+" ml de jugo";
        }else
            return "Se acabo";
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getMlManzana() {
        return mlManzana;
    }

    public void setMlManzana(double mlManzana) {
        this.mlManzana = mlManzana;
    }

    public double getMlPlatano() {
        return mlPlatano;
    }

    public void setMlPlatano(double mlPlatano) {
        this.mlPlatano = mlPlatano;
    }

    public double getMlPera() {
        return mlPera;
    }

    public void setMlPera(double mlPera) {
        this.mlPera = mlPera;
    }
}
