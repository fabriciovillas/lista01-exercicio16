import java.util.Scanner;
import java.lang. Math;
public class LojaDeTintas {
    public static void main(String[] args) {
       int area;
       double litros;
       double quantidadedelatas; 
       double valorFinal;
       Scanner input;
       input = new Scanner(System.in);
       area = input.nextInt();
       litros = area / 3;
       quantidadedelatas = Math.ceil (litros / 18);
       valorFinal = quantidadedelatas * 80;
       System.out.println(quantidadedelatas);
       System.out.println("R$" + valorFinal);
    }
}
