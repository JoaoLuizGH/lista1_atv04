import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

       Scanner teclado = new Scanner(System.in);

       double nota1, nota2, nota3, nota4, media;

       System.out.println("Informe a primeira nota: ");
       nota1 = teclado.nextDouble();

       System.out.println("Informe a segunda nota: ");
       nota2 = teclado.nextDouble();

       System.out.println("Informe a terceira nota: ");
       nota3 = teclado.nextDouble();

       System.out.println("Informe a quarta nota: ");
       nota4 = teclado.nextDouble();

       media = (nota1 + nota2 + nota3 + nota4) / 4;

       teclado.close();

       System.out.println("A média das notas foi: " + media);


    }
}
