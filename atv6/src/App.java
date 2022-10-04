import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça o raio de um círculo, 
        //calcule e mostre sua área.

Scanner sc = new Scanner(System.in);
System.out.println("Digite o raio do circulo");
int r = sc.nextInt();

double area = Math.PI * Math.pow(r, r);
System.out.println("A area do circulo é " + area);
    }
}
