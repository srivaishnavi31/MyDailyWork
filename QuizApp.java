import java.util.Scanner;
class Question
{
String text;
String[] options;
int correctOption;
public Question(String text,String[] options,int correctOption) 
{
this.text =text;
this.options =options;
this.correctOption =correctOption;
}
}
public class QuizApp 
{
public static void main(String[] args) 
{
//sample questions
Question[] questions={
new Question("What is the capital of India?",
new String[]{"Paris","NewDelhi","Berlin","Madrid"}, 1),
new Question("what is the national bird of India?",
new String[]{"peacock","Pigeon","Parrot","Eagle"},0),
            // Add more questions here
};
int score=0;
Scanner sc=new Scanner(System.in);
for(Question q : questions) 
{
System.out.println(q.text);
for (int i = 0; i < q.options.length; i++) 
{
System.out.println((i + 1) + ". " + q.options[i]);
}
System.out.print("Enter your choice (1-" + q.options.length + "): ");
int userChoice = sc.nextInt();
if(userChoice == q.correctOption + 1) {
System.out.println("Correct!\n");
score += 10;
} 
else 
{
System.out.println("Incorrect.\n");
}
}
System.out.println("Your final score: " + score);
}
}