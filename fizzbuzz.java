// Fizz buzz
public class fizzbuzz
{
	public static void main(String[] args) {
	    int i;
		for(i =0; i <=100 ; i++)
		
		if(i % 3 == 0 && i % 5 == 0){
		    System.out.println("Fizzbuzz " + i);
		}else if(i % 3 ==0){
		    System.out.println("Fizz " + i);
		}else if(i % 5 == 0){
		    System.out.println("Buzz " + i);
		}
	}
}
