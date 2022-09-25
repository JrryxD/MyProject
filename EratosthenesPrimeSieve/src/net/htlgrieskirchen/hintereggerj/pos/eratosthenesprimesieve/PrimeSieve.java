package net.htlgrieskirchen.hintereggerj.pos.eratosthenesprimesieve;

public interface PrimeSieve {
    // Überprüft ob p eine Primezahl ist oder nicht
    public boolean isPrime(int p);
    // Gibt alle Primzahlen bis zur Obergrenze auf der Konsole aus.
    public void printPrimes();
}
