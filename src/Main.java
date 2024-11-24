import java.util.Arrays;
//sortari JAVA - pagina 145 - curs GELLERT
public class Main {

    public static int[] bubbleSortA(int[] mx) //ascending
    {
        for (int i = 0; i < mx.length - 1; i++)
        {
            for (int j = 0; j < mx.length - 1; j++)
            {

                if(mx[j] > mx[j+1])
                {
                    int locca;
                    locca = mx[j];
                    mx[j] = mx[j+1];
                    mx[j+1] = locca;

                }
            }
        }
        return mx;
    }
    public static int[] bubbleSortD(int[] mx) //descending
    {
        for (int i = 0; i < mx.length - 1; i++)
        {
            for (int j = 0; j < mx.length - 1; j++)
            {

                if(mx[j] < mx[j+1])
                {
                    int locca;
                    locca = mx[j];
                    mx[j] = mx[j+1];
                    mx[j+1] = locca;

                }
            }
        }
        return mx;
    }

    public static int[] selectSortD(int[] mx) //descending
    {
        for(int i=0;i<=(mx.length-1);i++)
        {
            for (int j = 0; j <=mx.length-1; j++)
            {
                int locca;
                if (mx[j]>mx[i])
                {
                    locca=mx[j];
                    mx[j]=mx[i];
                    mx[i]=locca;
                }
            }
        }
        return mx;
    }

    public static int[] selectSortA(int[] mx) //ascending
    {
        for(int i=0;i<=(mx.length-1);i++)
        {
            for (int j = 0; j <= mx.length-1; j++)
            {
                int locca;
                if (mx[j]>mx[i])
                {
                    locca=mx[j];
                    mx[j]=mx[i];
                    mx[i]=locca;
                }
            }
        }
        return mx;
    }

    public static int[] insCuSortD(int[] mx) //descending
    {
        for(int i = 0; i < mx.length; i++)
        {
            int j = i;
            while((j>0)&&(mx[j-1]<mx[j]))
            {
                int tmp = mx[j];
                mx[j] = mx[j-1];
                mx[j-1] = tmp;
                j--;
            }
        }
        return mx;
    }

    public static int[] insCuSortA(int[] mx) //ascending
    {
        for(int i = 0; i < mx.length; i++)
        {
            int j = i;
            while((j>0)&&(mx[j-1]>mx[j]))
            {
                int tmp = mx[j];
                mx[j] = mx[j-1];
                mx[j-1] = tmp;
                j--;
            }
        }
        return mx;
    }
    public static void main(String[] args)
    {
        int vect[] = new int[]{36,25,97,18,3,77,33,11,28};

        vect=insCuSortA(vect);
        System.out.println(Arrays.toString(vect));

        vect=insCuSortD(vect);
        System.out.println(Arrays.toString(vect));

        vect=selectSortD(vect);
        System.out.println(Arrays.toString(vect));

        vect=selectSortA(vect);
        System.out.println(Arrays.toString(vect));

        vect=bubbleSortD(vect);
        System.out.println(Arrays.toString(vect));

        vect=bubbleSortA(vect);
        System.out.println(Arrays.toString(vect));
    }
}