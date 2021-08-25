package sample;

/**
 * Created by DELL on 12/9/2015.
 */
public class FindSameIndexAndSet {
    public void SetIndex(int index,int result,int A_Array[][],int size,int Final_Array[][])
    {
        for(int i=0;i<size;i++)
        {
            if(A_Array[index][1]==A_Array[i][0])Final_Array[i][0]=result;
            if(A_Array[index][1]==A_Array[i][2])Final_Array[i][2]=result;
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<4;j++)
                System.out.println("here in find Same index: "+Final_Array[i][j]);
        }
    }
}
