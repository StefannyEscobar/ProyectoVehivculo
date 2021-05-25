package FInal;
public class Moto extends Vehiculo{
    public Moto(String p, String m, String c){
        this(p,m,c,30000);
    }
    public Moto(String p, String m,String c, int v){
        super(p,m,c,v);
        setTipo("Moto");
    }
    
}
