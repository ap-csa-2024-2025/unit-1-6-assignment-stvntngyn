public class Problem3
{
  public static void main(String[] args)
  {
    double decimal = 67.3424;
    int answer1 = (int)((decimal % 1) * 10);
    int answer2 = (int)((decimal % 0.1) * 100);
    int answer3 = (int)((decimal % 0.01) * 1000);
    System.out.println ("deciaml number: " + decimal);
    System.out.println ("Answer: " + answer1 + " " + answer2 + " " + answer3);
  }
}