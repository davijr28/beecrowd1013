import java.util.Scanner;
public class Beecrowd1013 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int a,b,c,maiorab;
        
        
        //ler variáveis
        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();
        
        maiorab = (a+b+Math.abs(a-b))/2;
        
        //mostrar resultado no console
        System.out.printf("%d eh o maior%n" , Math.max(maiorab, c));
    }
}