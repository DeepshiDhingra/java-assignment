import java.util.*;
class stu{
    int roll,r;
    String name,s;
    float marks,m;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("enter the roll");
        roll=sc.nextInt();
        sc.nextLine();
          System.out.println("enter the name");
        name=sc.nextLine();
          System.out.println("enter the marks");
        marks=sc.nextFloat();
    }
    void display()
    {
        System.out.println("the details are as follows:   "+roll+"  "+name+"  "+marks);
    }
    
}
public class Main
{
public static void main(String args[])
{
    stu ob=new stu();
  ob.input();
    ob.display();
}

}