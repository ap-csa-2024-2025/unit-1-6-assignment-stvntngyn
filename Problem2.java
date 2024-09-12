public class Problem2
{
  public static void main(String[] args)
  {
    // insert code here
    double num1 = 57.3934;
    double num2 = 22.5211;
    int num1Round = (int)(Math.round(num1));
    int num2Round = (int)(Math.round(num2));
    int answer = num1Round + num2Round;

    System.out.println ("Two original numbers: ");
    System.out.println (num1);
    System.out.println (num2);
    System.out.println ("Answer: " + num1Round + " + " + num2Round + " = " + answer);
  }
}

