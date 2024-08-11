import java.util.Scanner;
public class studentgrade
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no. of subjects:");
int subjects=sc.nextInt();
//subject marks
int[] marks=new int[subjects];
for(int i=0;i<subjects;i++)
{
System.out.println("marks for subject "+(i+1)+":");
marks[i]=sc.nextInt();
}
//total marks
int totalmarks=0;
for(int mark:marks)
{
totalmarks+=mark;
}
//average percentage
double avgpercentage=(double)totalmarks/subjects;
//grade calculation
char grade;
if(avgpercentage>=90) 
{
grade='A';
} 
else if(avgpercentage>=80) 
{
grade='B';
}
else if(avgpercentage>=70) 
{
grade='C';
} 
else if(avgpercentage>=60) 
{
grade='D';
}
else
{
grade='F';
}
//results
System.out.println("total marks: "+totalmarks);
System.out.println("average percentage: "+avgpercentage+"%");
System.out.println("grade: "+grade);
sc.close();
}
}