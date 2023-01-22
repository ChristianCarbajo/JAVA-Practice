


public class PruebaMain{


 public static void main (String[] args) {
   Vehiculo vehiculo = new Vehiculo ("Toyota","negro","Corolla",false,125);
   Vehiculo cochazo = new Vehiculo ("Mercedes" ,"amarillo","Benz",true, 250 );
   System.out.println(vehiculo.getFabricante());
   vehiculo.acelerar(50);
   System.out.println(vehiculo.getVelocidad());
   System.out.println(cochazo.getFabricante());
 } 

}
