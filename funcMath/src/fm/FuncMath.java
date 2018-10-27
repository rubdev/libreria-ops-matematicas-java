
package fm;

import java.util.List;

/**
 *
 * @author ruben
 * @version 0.2
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
    
    public int maximoDe(int n1, int n2) {
        int max;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        return max;
    }
    
    public int minimoDe(int n1, int n2) {
        int min;
        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }
        return min;
    }
    
    public int mediaDeXNumeros(List<Integer> numeros) {
        int suma=0,media;
        for (Integer numero : numeros) {
            suma += numero;
        }
        media = suma / numeros.size();
        return media;
    }
    
    public int aleatorioHasta(int limite) {
        int aleatorio = (int) ((Math.random()*limite)+1);
        return aleatorio;
    }
    
}
