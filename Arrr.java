import java.util.*;

public  class Arrr {
    public static void main(String arg[])
    {
        List<Integer> arr=new ArrayList<>();
        //arr.add(12,45,55,8,40);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            
            arr.add(sc.nextInt());
        }
        int h=0;
        int sh=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>h)
            {
                sh=h;
                h=arr.get(i);
            }
            else if(arr.get(i)>sh && arr.get(i)<h) {
                sh=arr.get(i);

            }
        }
        System.out.println(sh);
    }
    
}
