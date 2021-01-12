import java.util.ArrayList;
class Question1{
    public static ArrayList<Integer> primes( ArrayList<Integer> myList ) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for(int i = myList.size()-1; i >= 0; i--){
            int divideBy = 2;
            if((myList.get(i) / divideBy != 0) && divideBy < myList.get(i)){
                divideBy++;                
            }else{
                primes.remove(myList.get(i)); 
            }
            //primes.add(myList.get(i));
        }
        return primes; 
    }
    
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n = 100; 
        for(int i = 2; i < n; i++){
            nums.add(i); 
        }
        
        System.out.println("List of numbers: " + nums);
        System.out.println("List of prime numbers: " + primes(nums));
    }
    
}