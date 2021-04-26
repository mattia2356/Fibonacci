public class Fattoriale {    

    //costruttore default
    public Fattoriale() {         

    }
    //Ricorsione Fibonacci 
    public int Fibonacci(int valore){
        int fib;
        if(valore==0 || valore==1){
            fib=1;
        }
        else{
            fib=Fibonacci(valore-1)+Fibonacci(valore-2);
        }
        return fib;
    }
    //Fibonacci 
    public int Fibonacci_itr(int valore){
        int fib=0, fibN1, fibN2;
        if(valore==0 || valore==1){
            fib=1;
        }else{
            fibN2=1;
            fibN1=1;
            for (int i = 2; i <= valore; i++) {
                fib=fibN1+fibN2;
                fibN2=fibN1;
                fibN1=fib;
            }
        }
        return fib;
    }
    //Esercizio somma Ricorsione
    public int somma (int N) {          
        if(N==1) {
            return 1; 
        }
        else {
            return N + somma(N-1);
        }
    }

    //esercizio esponente ricorsione
    public double esponente(double A, int N) {     
        if(N==1) {
            return A;
        }
        else {
            return A * esponente(A, N-1);
        }
    }

    //esercizio string ricorsione
    public int Lunghezza(String str) {         
        if(str.equals("")) {
            return 0; 
        }
        else {
            return 1+Lunghezza(str.substring(1));
        }
    }

    //esercizio massimo comune divisore ricorsione
    public int gcd_ricorsione(int m, int n) {          
        if(m==0) {
            return n;
        }
        else {
            return gcd_ricorsione(n%m,n);
        }
    }
}