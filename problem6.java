/*The sum of the squares of the first ten natural numbers is,
1^2+2^2+...+10^2=385
The square of the sum of the first ten natural numbers is,
(1+2+...+10)^2=55^2=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 
3025−385=2640.
Find the difference between the sum of the squares of the first one hundred natural numbers
 and the square of the sum.*/
public class problem6 {
    public static void main(String[] args) {
        double sumSquare = 0;
        double squareSum = 0;
        double sum = 0;
        double diff = 0;
        for(int i =1; i<= 100; i++){
            sumSquare = sumSquare + Math.pow(i, 2);
            sum = sum + i;
        }
        squareSum = Math.pow(sum, 2);
        diff = squareSum - sumSquare;
        System.out.println(diff);
        System.out.println(sumSquare);
        System.out.println(squareSum);
    }

}