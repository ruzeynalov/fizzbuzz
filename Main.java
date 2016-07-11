public class Main {
	public static void main(String[] args) {
	
	fizzbuz(100);
	}
  
	public static void fizzbuz (int n)
    {
		int []fizzes = new int[] {1, 0, 0};
		int []buzzes = new int[] {2, 0, 0, 0, 0};
		String [] words =  new String[] {null, "Fizz", "Buzz", "FizzBuzz"};
    
		for (int i=1; i<=n; i++)
		{
			words[0]= Integer.toString(i);
			System.out.println(words[fizzes[i%3] + buzzes[i%5]]);
		}
	}
}
