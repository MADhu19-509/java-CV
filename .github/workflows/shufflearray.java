import java.util.Random ;
import java.util.Arrays;
public class shufflearray
{
    static void shuffle( int array[],int n) 
    {
        Random r=new Random();
        for (int i =n-1; i>0; i--)
        {
            int j =r.nextInt(i+1);
            int temp =array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        System.out.println(Arrays.toString(array));
        }
        public static void main(String[] args)
        {
            int[] array={1,2,3,4,5,6,7};
            int n=array.length;
            shuffle(array,n);
        }
    }
