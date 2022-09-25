package net.htlgrieskirchen.hintereggerj.pos.eratosthenesprimesieve;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    int max;

    boolean[] primes;

    ArrayList<Integer> res_primes = new ArrayList<>();

    public EratosthenesPrimeSieve(int max) {
        this.max = max;
        primes = new boolean[max];
    }

    @Override
    public boolean isPrime(int p) {
        return false;
    }

    private void fillarr()
    {
        for (int i = 2; i <= max; i++) {
            if (i%2 == 1 || i == 2) {
                primes[i - 2] = true;
            } else primes[i-2] = false;
        }
    }

    private List<Integer> calculateprimes()
    {
        fillarr();
        for (int i = 2; i <= max; i++) {
            if (primes[i-2])
            {
                res_primes.add(i);
                for (int j = i*i; j <= max; j += i) {
                    primes[j-2] = false;
                }
            }
        }
        return res_primes;
    }

    @Override
    public void printPrimes() {
        for (int i : calculateprimes())
        {
            System.out.println(i);
        }
    }
}
