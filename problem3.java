import java.util.ArrayList;

/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?*/
public class problem3 {

    public static void main(String[] args) {
        long numb = 600851475143L;
        long largestPrime = 0;
        long factor = 2;
        ArrayList<Long> prime = new ArrayList<>();
        while(numb > 1){
            if(numb%factor == 0){
              prime.add(factor);
              numb = numb/factor;
            }else{
                factor ++;
            }
        }
        for(int i = 0; i<prime.size(); i++){
            System.out.println(prime.get(i));
            if(prime.get(i)>largestPrime){
                largestPrime = prime.get(i);
            }
        }
        System.out.println(largestPrime);

    }
}