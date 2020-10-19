/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
public class problem5 {
    public static void main(String[] args) {
        int smallest = 1;
        int i = 1;
        while(i <= 20){
            if(smallest%i==0){
                i++;
            }else{
                smallest ++;
                i = 1;
            }
        }
        System.out.println(smallest);
    }
}