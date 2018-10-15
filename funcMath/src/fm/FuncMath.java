
package fm;

/**
 *
 * @author ruben
 * @version 0.1
 * 
 * Librería con algunas de las operaciones matemáticas más utilizadas
 */
public class FuncMath {
    
    public int sumar(int n1, int n2) {
        return n1 + n2;
    }
    
    public int restar(int n1, int n2) {
        return n1 - n2;
    }
    
    public int multiplicar(int n1, int n2) {
        return n1 * n2;
    }
    
    public int dividir(int n1, int n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.err.println("Es imposible dividir entre 0");
            return 0;
        }
    }
    
    public boolean esMultiplo(int n1, int n2) {
        boolean esMultiplo = false;
        if (n1 % n2 == 0) {
            esMultiplo = true;
        } 
        return esMultiplo;
    }
    
    public boolean esPrimo(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public  int maximoComunDivisor(int n1, int n2) {
        int mcd = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        return mcd;
    }
    
    public  int minimoComunMultiplo(int n1, int n2) {
        int mcm = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        mcm = (a/maximoComunDivisor(a, b))*b;
        return mcm;
    }
    
}
