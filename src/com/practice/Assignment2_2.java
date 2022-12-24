package src.com.practice;
public class Assignment2_2
{
    public static void main (String args[])
    {
        char a = '2';
        int b = 8;
        System.out.println(b + a);//ascii value of 2 is 50
        //System.out.println(args[5]);
        Student s = new Student();
        School sc = new School();
        s.print();
        sc.print();
        Assignment2_2 c = new Assignment2_2();
        c.studentMethod();
        Answer ans = new Answer(5);
        Answer an = new Answer();
        String nptel, space, java;
//Initialize the variables with proper input
        nptel = "NPTEL";
        space = " ";
        java = "JAVA";
        System.out.print(nptel+space+java);
    }
    public void studentMethod()
    {
        Question q = new Question();
        q.print() ;
    }
}