package net.htlgrieskirchen.hintereggerj.pos.eratosthenesprimesieve;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Obergrenze angeben: ");
        int input = s.nextInt();
        EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(input);
        sieve.printPrimes();
    }
}
