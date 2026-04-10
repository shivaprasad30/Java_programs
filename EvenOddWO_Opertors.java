import java.util.*;

//find weather given number is even or odd with out using athermatic opertors

public class EvenOddWO_Opertors {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if((x & 1)==0)
    {
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }

}
}
