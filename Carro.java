package FInal;
public class Carro extends Vehiculo{
    public Carro(String p, String m, String c){
        this(p,m,c,30000);
    }
    public Carro(String p, String m,String c, int v){
        super(p,m,c,v);
        setTipo("Carro");
    }
}
