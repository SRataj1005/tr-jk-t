import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner nowy = new Scanner(System.in);
    char[] abc = {'a','b','c'};
    int[] xyz = new int[3];
    boolean test = false;
    for(int i = 0; i < 3; i++)
      {
        System.out.print("Podaj "+ abc[i]+ ":");
        xyz[i] = nowy.nextInt();
      }
    if(xyz[0] + xyz[1] > xyz[2])
    {
      if(xyz[0] + xyz[2] > xyz[1])
      {
        if(xyz[1] + xyz[2] > xyz[0])
        {
          test = true;
          if(test = true)
          {
          System.out.println("Taki trójkąt istnieje");
          }
        }
      }
    }
  }
}