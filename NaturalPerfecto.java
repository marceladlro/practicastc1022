import java.util.Scanner;
public class NaturalPerfecto
/*
Marcela De la Rosa
23/10/18
saber si un numero es natural perfecto o no
*/
{
  public static void main (String[] args)
  {
    //variables
    Scanner keyboard = new Scanner (System.in);
    int numero=0, suma=0, divisor=0;
    //codigo
    System.out.println("Ingresa un número: ");
    numero=keyboard.nextInt();
    for(divisor=1; divisor<numero; divisor++)
    {
      if(numero%divisor == 0)
      {
        suma=suma+divisor;
      }//fin if 
    }//fin for loop
    if(suma==numero)
    {
      System.out.println("El numero "+numero+" es perfecto");
    }//fin if
    else
    {
      System.out.println("El numero "+numero+" no es perfecto");
    }//fin else
  }//fin main
}//fin class
