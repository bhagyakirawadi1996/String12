class Sample
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the string");
String str=scanner.next();
int[]arr=new int[123];
for(int i=0;i<str.length();i++)
 char ch=str.charAt(i);
arr[ch]++;
}
for(int i=0;i<arr.length;i++)
{
   if(arr[i]!=0)
{
 System.out.println((char)i+"-->"+arr[i]);
}
}