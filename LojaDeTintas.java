import java.util.Scanner;
import java.lang. Math;
public class LojaDeTintas {
    public static void main(String[] args) {
       int area;
       double litros;
       double quantidadeDeLatas; 
       double valorFinal;
       Scanner input;
       input = new Scanner(System.in);
       area = input.nextInt();
       litros = area / 3;
       quantidadeDeLatas = Math.ceil (litros / 18);
       valorFinal = quantidadeDeLatas * 80;
       System.out.println(quantidadeDeLatas);
       System.out.println("R$" + valorFinal);
    }
}
