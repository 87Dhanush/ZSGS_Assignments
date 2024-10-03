public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 30:");
        
        for (int num = 2; num <= 30; num++) {
            boolean isPrime = true;
            
            for (int i = 2; i <=num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
