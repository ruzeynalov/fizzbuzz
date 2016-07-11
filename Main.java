public class Main {
   public static void main(String[] args) {
	fizzbuzz(1, 100);
   }
  
   public static void fizzbuzz (int start, int end) {
	int []fizzes = new int[] {1, 0, 0};
	int []buzzes = new int[] {2, 0, 0, 0, 0};
	String [] words =  new String[] {null, "Fizz", "Buzz", "FizzBuzz"};
    
	for (int i=start; i<=end; i++)
	{
		words[0]= Integer.toString(i);
		System.out.println(words[fizzes[i%3] + buzzes[i%5]]);
	}
     }
}
