import java.util.ArrayList;

/*A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/
public class problem4 {

    public static void main(String[] args) {
        ArrayList <Integer> palindromList = new ArrayList<>();
        int largestPalindrom = 0;
        
        for(int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                int product = i * j;
                String temp = Integer.toString(product);
                StringBuilder sb = new StringBuilder(temp);
                String temp2 = sb.reverse().toString();
                int l = 0;
                int temp3 = temp.length();
                while(temp3 > 0 ){
                    if(temp.charAt(l) == temp2.charAt(l)){
                        l++;
                    }
                    temp3--;
                }
                if(l == temp.length()){
                    palindromList.add(product);
                }
            }
        }
        for(int k = 0; k < palindromList.size(); k++){
            if(palindromList.get(k) > largestPalindrom){
                largestPalindrom = palindromList.get(k);
            }
        }
        System.out.println(largestPalindrom);
    }
}