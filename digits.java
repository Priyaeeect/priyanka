import java.util.*;
class digits{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a,k=0;
int z[]=new int[100];
while(n!=0)
{
a=n%10;
z[k]=a;
k++;
n/=10;
}
for(int i=0;i<k;i++)
{
System.out.print(z[i]);
}
}}
