import java.util.Scanner;
public class MainWhile {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
      
    int numeroEntrada=0, resultado=0, control=0;

   System.out.println("Ingrese el numero que desea calcular");
   numeroEntrada= N.nextInt();

     LogicaWhile prueba1= new LogicaWhile(numeroEntrada, resultado, control);
     prueba1.calcularNumero();
     N.close();

}


}
