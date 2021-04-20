public class Vehiculo{
    public static Vehiculo[][] vehiculo; 
    public static int tamaño;
    public static int cantidad = 0;
    private String marca;
    private String color;
    private String placa;
    private int valorComercial;

     public Vehiculo(){
     }
     public Vehiculo(String p, String m,String c){
         this(p,m,c,30000000);
     }
     public Vehiculo(String p, String m,String c, int v){
         cantidad++;
         this.placa = p;
         this.marca = m;
         this.color = c;
         this.valorComercial = v;         
     }
     public void setPlaca(String p){
         this.placa = p;
     }
     public void setMarca(String m){
         this.marca = m;
     }
     public void setColor(String c){
         this.color = c;
        }
        public void setValor(int v){
             this.valorComercial = v;
         }
         public String getPlaca(){
             return this.placa;
         }
         public String getMarca(){
             return this.marca;
         }
         public String getColor(){
             return this.color;
         }
         public int getValor(){
             return this.valorComercial; 
         }
         public static int getTamaño(){
                return tamaño; 
         }
         public String toString(){
             return "Placa: " + this.placa +". Marca: " +this.marca+ ". Color: " +this.color+ ". Valor: "+ this.valorComercial;
         }
     
         public static String toStringVehiculos(){ 
             String h="";
             for (int i=0;i<vehiculo.length ;i++) {
                 for(int j=0;j<vehiculo[i].length;j++) {
                     if(vehiculo[i][j]!=null){
                         h+="Placa: "+ vehiculo[i][j].placa+ ". Marca: "+vehiculo[i][j].marca+ ". Color: "+vehiculo[i][j].color+ ". Valor: " +vehiculo[i][j].valorComercial+"\n";
                        }else{
                         continue;
                     }
                }
            }
             return h;
             }
         public static int cantidadVehiculos(){
             return cantidad;
         }
         public static String vehiculosColor(String c){
             String text="";
             
             for(int i=0; i< vehiculo.length;i++){
                 for(int j=0;j<vehiculo[i].length;j++) {
                     if((Sensor.sensores[i][j].getEstado()==1)&&(vehiculo[i][j].color.equalsIgnoreCase(c))){
                         text+=vehiculo[i][j].toString()+". Piso: "+i+". Espacio: "+j+"\n";
                     }
                 }
             }
             return text;
         }
         public static Vehiculo[] ordenadosValor(Vehiculo[][] ref){
             Vehiculo[]A = new Vehiculo[Vehiculo.cantidad];
             Vehiculo aux = new Vehiculo();
             int c=0;
             for (int i=0; i<ref.length;i++) {
                 for(int j=0;j<ref[0].length;j++) {
                     if(Vehiculo.vehiculo[i][j]!=null) {
                         A[c] = ref[i][j];
                         c++;
                     }                     
                 }         
             }
             for (int i = 0; i < A.length - 1; i++) {
                 for (int j = 0; j < A.length - i - 1; j++) {
                     if (A[j + 1].getValor() < A[j].getValor()) {
                         aux = A[j + 1];
                         A[j + 1] = A[j];
                         A[j] = aux;
                        }
                    }
                }
             
             return A;
         }
    }

                 
                 
                 
                 
          

     
            
                  