public class Main {

    static int suma (int n1, int n2, int n3 )
    {
        int resultado;

        resultado = n1 + n2 + n3 ;

        return resultado;
    }
   public static void main (String[] args) {
        int num1, num2, num3;

        num1 = 3;
        num2 = 5;
        num3 = 7;

        System.out.println("el resutado de la suma es:" + suma(num1,num2, num3));

        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
   }



    class Coche {
      public int  puertas = 0;

      public void AumentarPuertas(){
          this.puertas--;
      }
    }
}


