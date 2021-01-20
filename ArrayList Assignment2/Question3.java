import java.util.ArrayList;
class Question3{
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int endA = a.size()-1;
        int endB = b.size()-1;
        int carry = 0;
        int length = 0;
        if(a.size()-1 >= b.size()-1){
            length = a.size()-1;
            while(a.size()-1 != b.size()-1){
                b.add(0,0);
            }
        }else{
            length = b.size()-1;
            while(a.size()-1 != b.size()-1){
                a.add(0,0);
            }
        }

        for(int i = length; i >= 0; i--){
            int sum = 0;
            if(a.get(i) >= 0 && b.get(i) >= 0){
                sum = a.get(i) + b.get(i) + carry;
                carry = 0;
            }else if(a.get(i) >= 0){
                sum = a.get(i) + carry;
                carry = 0;
            }else if(b.get(i) >= 0){
                sum = b.get(i) + carry;
                carry = 0; 
            }
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            answer.add(0, sum);
            if(i == 0 && carry > 0){
                answer.add(0,1);
            }

        }
        return answer; 
    }

    public static void main (String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(9);
        n1.add(6);
        n1.add(6);
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        n2.add(6);
        n2.add(6);
        n2.add(6);
        ArrayList<Integer> n3 = add(n1, n2);
        System.out.println(n3);

    }
}