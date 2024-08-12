import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
Random random=new Random();
int score=0;
int rounds=0;
boolean playagain=true;
while(playagain) 
{
int guessnumber=random.nextInt(100)+1;
int attempts=0;
boolean correct=false;
System.out.println("Round " + (++rounds) + ": Guess a number between 1 and 100:");
while(!correct && attempts<3)
{
int usernumber=sc.nextInt();
attempts++;
if(usernumber==guessnumber) 
{
System.out.println("Correct! You found the number in " + attempts + " attempts.");
correct=true;
score++;
} 
else if(usernumber<guessnumber) 
{
System.out.println("Too low! Try again.");
} 
else 
{
System.out.println("Too high! Try again.");
}
}
if(!correct)
{
System.out.println("You didn't find the number. It was " + guessnumber + ".");
}
System.out.println("Your current score is " + score + " out of " + rounds + " rounds.");
System.out.println("Do you want to play again? (yes/no)");
playagain = sc.next().equals("yes");
}
sc.close();
}
}

