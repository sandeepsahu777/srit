import java.util.*;
public class gradingsys {
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double score1=sc.nextInt();
double score2=sc.nextInt();
double score3=sc.nextInt();
sc.close();
double scoreaverage=(score1+score2+score3)/3;
char grade;
if(scoreaverage>=90){
    grade='A';
}
else if(scoreaverage>=80){
    grade='B';

}
else if(scoreaverage>=70){
    grade='C';

}
else if(scoreaverage>=60){
    grade='D';
}
else{
    grade='F';
}
System.out.printf("The average score is: %.2f%n",scoreaverage);
System.out.println("The grade is:" + grade);
 }   
}
