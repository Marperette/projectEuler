/*There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
a < b < c , a^2 + b^2 = c^2
3^2 + 4^2 = 9 + 16 = 25 = 5^2.
*/
public class problem9 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 0;
        double product = 0;
        double sum = 1000;
        double tempA = 0;
        while(a<332){
            c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
            if(a+b+c > sum){
                a++;
                b = a+1;
            }else if(a+b+c < sum){
                b++;
            }else{
                product = a*b*c;
                tempA = a;
                a = 333;
            }
            
        }
        System.out.println("Product are: " + product + ". Numbers are: " + tempA + "," + b + " and " + c);
            
        
    }
}