import java.util.ArrayList;
class Question2{
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

    public static void goldbach(int n){
        ArrayList<Integer> primes = primes(n);
        for(int i = 0; i < primes.size(); i++){
            int firstPrime = primes.get(i);
            int secondPrime = n - primes.get(i);
            
            if(primes.contains(secondPrime)){
                System.out.println(firstPrime + " + " + secondPrime + " = " + n);
                return; 
            }
        }
    }
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(100);

        for(int i = 4; i < 101; i = i + 2){
            goldbach(i); 
        }
    }

}