public class Sensor {
    public static Sensor[][] sensores;
    private int estado;
    
    public Sensor(){
        estado = 0;
    }
    public Sensor(int e){
        this.estado=e;  
    }
    public int getEstado(){
        return estado;
    }
    public void setEstado(int e){
        this.estado=e;
    }
    public String toString(){
        String estac="";
        if(estado==1){
            estac="Estado: 1 (OCUPADO)";
        }else if(estado==0){
            estac= "Estado: 0 (LIBRE)";
        }
        //no sé que no da
        return estac;
    }
public static String sensorLibre(){
        String breve = "";
        for(int i=0;i<sensores.length;i++){
            for(int j=0;j<sensores[0].length;j++){
                if(sensores[i][j].getEstado()==0){
                    breve += "En el piso "+i+", espacio "+j+" hay un lugar libre\n";
                }
            }
        }
        return breve;
    }
    public static String sensoresEstado(){
        String breve = "";
        for(int i=0;i<sensores.length;i++){
            for(int j=0;j<sensores[0].length;j++){
                breve += "Piso: "+i+". Espacio: "+j+". "+Sensor.sensores[i][j].toString()+"\n";
            }
        }
        return breve;
    }
}