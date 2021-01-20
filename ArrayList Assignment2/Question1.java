
import java.util.ArrayList;
class Question1{
    public static ArrayList<Integer> primes(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            primes.add(i); 
        }
        
        for(int i = 0; i < primes.size(); i++){
            int p = primes.get(i);
            for(int j = primes.size()-1; j >= i + 1; j--){
             if(primes.get(j) % p == 0){
                 primes.remove(j);
                }
            }
        }
        return primes; 
    }

    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(100);

        System.out.println("List of prime numbers: " + primes(100));
    }

}