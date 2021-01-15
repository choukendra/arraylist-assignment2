/*
even number greater than two could be written as the sum of two primes. 
Write a method that takes an even int as a parameter. 
It then prints to the terminal a pair of prime numbers that sum to that int. 
If there are more than one combination that sums to the number, you just need to print ONE possible combination.

	4 = 2 + 2
	6 = 3 + 3
	10 = 3 + 7 OR 5 + 5
	120 = 7 + 113 OR 11 + 109 OR 13 + 107 OR … 59 + 61 (many possible answers, just print one) 
*/

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
        
        for(){
            
        }
        return primes; 
    }

    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(100);

        System.out.println(primes(100));
    }

}