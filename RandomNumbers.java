import java.io.*;
import java.util.*;
public class RandomNumbers{
  public static void main(String args[]){;
  Scanner s = new Scanner(System.in);
  System.out.print("Choose a lower bound( negative Number)");
  int lowerBound = s.nextInt();
  System.out.print("Choose a higher bound(Number must be positve and have greater absolute value)");
  int higherBound = s.nextInt();
  System.out.print("You got " + (int)(Math.random()*(higherBound-lowerBound)+ lowerBound) + " and " +  (int)(Math.random()*(higherBound-lowerBound)+ lowerBound));
  System.out.print("Type a whole Number");
  int num1 = s.nextInt();
  System.out.print("Type a decimal number");
  double num2 = s.nextDouble();
  System.out.print("Type a Name");
  String name = s.next();
  System.out.print("Type an adjective");
  String adjective = s.next();
  System.out.print("Type an activity");
  String activity = s.next();
  System.out.print(name + " went to the store where they bought " + num1 + " " + adjective + " bananas each costing $" + num2 + "to eat while " + activity + ". All those bananas cost " + (num1*num2) + " dollars!");
}
}