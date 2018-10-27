import java.util.Scanner;
public class AñoBisiesto
/*
Marcela De la Rosa
23/10/18
saber si un año es bisiesto o no
*/
{
  public static void main (String[] args)
  {
    //variables
    Scanner keyboard = new Scanner (System.in);
    int año=0;
    Boolean añoBisiesto=false;
    //codigo
    System.out.println("Ingresa un año: ");
    año=keyboard.nextInt();
    if (año%4==0)
    {
      añoBisiesto=true;
      if (año%100==0)
      {
        añoBisiesto=false;
        if (año%400==0)
        {
          añoBisiesto=true;
        }
      }
    }
    if (añoBisiesto)
    {
      System.out.println("El año: " + año + " es un año bisiesto");
    }
    else
    {
      System.out.println("El año: " + año + " no es un año bisiesto");
    }
  }//fin main
}//fin class
