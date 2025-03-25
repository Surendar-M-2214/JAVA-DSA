import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class QuestionService {
    Question[] qns=new Question[3];
   public  QuestionService(){
       qns[0]=new Question(2,"Who is the Best TL ?","Prabha", "Prabha", "Jeni", "SAI", "Hari");

       qns[1]=new Question(2,"Capital of TamilNadu?","Chennai", "Madurai", "Chennai", "Trichy", "Theni");
       qns[2]=new Question(1,"Capital of India?","Delhi","Chennai", "Delhi", "Kolkata","Mumbai");

    }
   public  void play(){

       Scanner sc=new Scanner(System.in);
for (Question q:qns){
    System.out.println("Q"+q.getId()+" "+  q.getQues());
    int i=1;
    for (String op:q.getOpt()){
        System.out.println(i++ +")"+op);
    }
    System.out.println("Choose the option");
   int an= sc.nextInt();
   if (Objects.equals(q.getOpt()[an - 1], q.getAns()))
   {
       System.out.println("Correct!!");
   }
   else
   {
       System.out.println("Wrong");
   }
   if (q.getId()!=3) {
       System.out.println("Do you want to continue? (y/n)");
       String ch = sc.next();
       if (Objects.equals(ch, "y") || Objects.equals(ch, "Y")) {

       } else {
           System.out.println("END");
           break;
       }
   }

}


    }
}
