package dgljunitTestCase1;

public class EvenOrOdd 
{
  public boolean isEvenNumber(int number)
  {
	  boolean result=false;
	  //To check if the number is completely divisible by 2
	  //and the remainder is 0
	  
	  if(number%2==0)
	  {
		  result=true;
	  }
	  return result;
  }
}
