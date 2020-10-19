/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/
public class problem7 {
    public static void main(String[] args) {
        int numberOfPrime = 6;
        int number = 2;
        int factor = 1;
        int count = 0;
        while(count != numberOfPrime){
            while(number > factor){
                if(number%factor == 0){
                    factor++;
                }else{
                    number++;
                    factor = 1;
                }
            }
            count++;
        }
        System.out.println(number);
    }

}