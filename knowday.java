import java.util.Scanner;
public class knowday
{
    public static void main(String[] args) 
    {
        int i,d,d1,m,y,y1,r=0,r1,r11,r2,k=0,sum=0;
        Scanner s=new Scanner(System.in);
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String days[]={"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Enter the date: ");
        d=s.nextInt();
        m=s.nextInt();
        y=s.nextInt();
        System.out.println(d+"/"+m+"/"+y);
        if((y%400==0)||(y%100!=0&&y%4==0))
        {
            month[2]=29;
        }
        if(d<0||m<0||d>31||m>12||y<0||y>9999)
        {
            System.out.println("Invalid range of date!!!");
        }
        else
        {
            r=y%100;
            y1=y-r;
            if(y1%400==0)
            {
                k=0;
            }
            else if(y1%400==100)
            {
                k=5;
            }
            else if(y1%400==200)
            {
                k=3;
            }
            else if(y1%400==300)
            {
                k=1;
            }
        }
        r1=r-1;
        r11=r1/4;
        r2=r1-r11;  
        for(i=0;i<m;i++)
        {
            sum=sum+month[i]; 
        }
        sum=(k+(r11*2)+r2)+sum+d;
        d1=sum%7;
        System.out.println(days[d1]);
        s.close();
    }
}