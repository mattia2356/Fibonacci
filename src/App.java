import java.util.Scanner;

public class App {
    public static void main(String args[]){
        Fattoriale f = new Fattoriale();
        // System.out.println("metodo calcolo fattoriale di un numero: " +f.fattoriale(5));
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Il fattoriale di un numero: " );
        int num = tastiera.nextInt();

        System.out.println(f.Fibonacci_itr(num));
        
        System.out.println("Fibonacci con la ricorsione: "+f.Fibonacci(5));
        System.out.println("Fibonacci iterazione: "+f.Fibonacci(5));

        // le chimate per stampare 
        System.out.println("Somma: " + f.somma(2));
        System.out.println("Esponente: " + f.esponente(4,8));
        System.out.println("Length: " + f.Lunghezza("ciao"));
        System.out.println("GCD: " + f.gcd_ricorsione(26,6));

    }
}