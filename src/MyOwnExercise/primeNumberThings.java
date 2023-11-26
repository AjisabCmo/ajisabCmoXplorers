package MyOwnExercise;

public class primeNumberThings {

    public static void main(String[] args) {
        int n =20;
        for (int i = 1 ; i <= n ; i++){
            System.out.println(i+""+isPrime(i));
        }

    }

    private static boolean isPrime(int n ) {
        if (n <= 1){
            return false;

        }
        int c = 2;
//        if (c<=Math.sqrt(n))
        if (c * c <=n){
            if (n % c ==0){
                return false;

            }
            c++;
        }
        return true;
    }
}