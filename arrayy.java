public class arrayy
{
void reversearray(int[] arr)
{
for(int i=0; i < (arr.length)/2; i++)
{
int temp = arr[i];
arr[i]=arr[arr.length-1-i];
arr[arr.length-1-i] = temp;
}

for(int i : arr)
{
System.out.println(i);
}
}

public static void main(String[] args)
{
int [] arr = { 2, 5, 6, 8 ,1, 3, 6,4 , 7} ;
arrayy obj = new arrayy();
obj.reversearray(arr);
}
}