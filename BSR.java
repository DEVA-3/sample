class A
{
int BSR (int a[],int low,int high,int key)
{
int mid=(low+high)/2;
if (key==a[mid])
return mid;
else if(key<a[mid])
{
return BSR(a,low,mid-1,key);
}
else if(key>a[mid])
{
return BSR(a,high,mid+1,key);
}
else 
return -1;
}
}
class B
{
public static void main(String args[])
{
int a[]={4,6,7,9,22,41,45,52};
int low=0,high=a.length-1,mid,key=22,i;
A oa=new A();
i=oa.BSR(a,low,high,key);
if(i==-1)
{
System.out.println("element not found");
}
else 
System.out.println("element found"+i);
}
}