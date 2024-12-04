<<<<<<< HEAD
public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
    }
}
=======
public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        isPrime(num);
    }

    
    public static void isPrime(int num) {
        boolean[] isPrime = new boolean[num + 1];  
        int sum = 0; 
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) { 
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;  
                }
            }
        }
        System.out.println("Prime numbers up to " + num + ": ");
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");  
                sum++;
            }
        }
        System.out.println(); 
        System.out.println("There are " + sum + " primes between 2 and " + num + " (" + (sum * 100 / num) + "% are primes)");
    }
}
>>>>>>> b5426f6 (part1)
