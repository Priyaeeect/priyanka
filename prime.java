import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int c2=0;
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
int c1=0;
for(int i=0;i<a.length;i++)
c1=0;
for(int k=2;k<=a[i];k++)
{
if(a[i]%k==0)
{
c1++;
}
}
if(c1==1)
{
c2++;}
}
System.out.print(c2);
}
}
