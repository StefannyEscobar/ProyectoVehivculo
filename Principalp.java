import java.util.InputMismatchException;
import java.util.Scanner;
public class PrincipalP{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Usuario, ingrese la cantidad de pisos y la cantidad de espacios.");
        int pisos= scan.nextInt();
        int espacios= scan.nextInt();
        int num=-1;
              
        Vehiculo.vehiculo = new Vehiculo [pisos][espacios];
        Sensor.sensores = new Sensor [pisos][espacios];
    
        for(int i=0;i<pisos;i++){
            for(int j=0;j<espacios;j++){
                Sensor.sensores[i][j] = new Sensor();
            }
        }

        Vehiculo.tamaño = (espacios*pisos);

        System.out.println("Escriba una opción: ");
        System.out.println("0. Salir del sitema.");
        System.out.println("1. Sensores libres.");
        System.out.println("2. Registrar parqueo de vehículo.");
        System.out.println("3. Registrar parqueo de vehículo con valor comercial.");
        System.out.println("4. Listar información vehículos que están parqueados.");
        System.out.println("5. Mostrar cantidad vehículos que se han parqueado.");
        System.out.println("6. Verificar estado de un lugar en el estacionamiento.");
        System.out.println("7. Mostrar estado de sensores.");
        System.out.println("8. Filtrar por color.");
        System.out.println("9. Mostrar vehículos por valor comercial.");
               while(num!=0){  
                    try{num = scan.nextInt();}
                    catch(InputMismatchException e){
                    scan.next();
                    continue;
                    }
                    switch(num){
                        case 1:
                            System.out.println(Sensor.sensorLibre());
                            break;
                        case 2://hacerlo todo
                            System.out.println("Ingrese el piso y el espacio que desea: ");
                            int piso=scan.nextInt();
                            int espacio= scan.nextInt();
                            if(Vehiculo.cantidad<=Vehiculo.getTamaño()){
                                if(Sensor.sensores[piso][espacio].getEstado()==0){
                                    System.out.println("Ingrese por favor placa, marca y color");
                                    String placa = scan.next();
                                    String marca = scan.next();
                                    String color = scan.next();
                                    
                                    Vehiculo.vehiculo[piso][espacio] = new Vehiculo(placa, marca,color);
                                    Sensor.sensores[piso][espacio].setEstado(1);
                                    
                                    System.out.println(Vehiculo.vehiculo[piso][espacio]);
                                } else {
                                    System.out.println("Espacio de estacionamiento ocupado. Por favor elija otro espacio.");
                                }
                            } else {
                                System.out.println("El estacionamiento está lleno.");                        
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese el piso y el espacio que desea: ");                         
                            piso = scan.nextInt();
                            espacio = scan.nextInt();
                                
                            if(Vehiculo.cantidad<=Vehiculo.getTamaño()){
                                 if(Sensor.sensores[piso][espacio].getEstado()==0){
                                      System.out.println("Ingrese por favor placa, marca, color y valor comercial del vehículo.");
                                      String placa = scan.next();
                                      String marca = scan.next();
                                      String color = scan.next();
                                      int valor = scan.nextInt();
                                        
                                      Vehiculo.vehiculo[piso][espacio]= new Vehiculo (placa, marca,color,valor);
                                      Sensor.sensores[piso][espacio].setEstado(1);
                                        
                                      System.out.println(Vehiculo.vehiculo[piso][espacio]);
                                } else {
                                    System.out.println("Espacio de estacionamiento ocupado. Por favor elija otro espacio.");
                                    }
                                } else {
                                    System.out.println("El estacionamiento está lleno.");
                            }
                            break;
                        case 4:
                            System.out.println(Vehiculo.toStringVehiculos());
                            break;
                        case 5:
                            System.out.println("Hay " +Vehiculo.cantidad+ " vehículo(s) estacionado(s).");
                            break;
                        case 6:
                            System.out.println("Ingrese el piso y el espacio que desea verificar: ");
                            piso=scan.nextInt();
                            espacio= scan.nextInt();
                            if(Sensor.sensores[piso][espacio].getEstado()==0){
                                System.out.println("Estado: "+Sensor.sensores[piso][espacio].getEstado()+" (LIBRE)");
                            } else {
                                System.out.println("Estado: "+Sensor.sensores[piso][espacio].getEstado()+" (OCUPADO)");
                            }
                            break;
                        case 7:
                            System.out.println(Sensor.sensoresEstado());
                            break;
                            
                        case 8:
                            System.out.println("Ingrese el color deseado");
                            String color = scan.next();
                            System.out.println(Vehiculo.vehiculosColor(color));
                            break;
                        case 9:
                            Vehiculo[] arr = Vehiculo.ordenadosValor(Vehiculo.vehiculo);
                            for(int i=0;i<Vehiculo.cantidad;i++){
                                System.out.println(arr[i]);
                            }
                            break;
                        default:
                            System.out.println("Comando inválido. Por favor, escriba un número de la lista.");
                            break;
                      }
                    try{num = scan.nextInt();}
                    catch(InputMismatchException e){
                    scan.next();
                    continue;
                    }            
               }
                System.out.println("Saliendo...");
    }
}
      
                            
                              
                        