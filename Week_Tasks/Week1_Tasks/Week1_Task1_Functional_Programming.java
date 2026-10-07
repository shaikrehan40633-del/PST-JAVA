import java.util.*; 
import java.util.function.Function; 
public class Main { 
  public static void main(String[] args) {  
  Scanner sc = new Scanner(System.in);         int n = sc.nextInt(); 
  Function<Integer, Integer> cube = x -> x * x * x;   
  int result = cube.apply(n);  
  System.out.println("Number: " + n); 
  System.out.println("Cube: " + result); 
} 
}
