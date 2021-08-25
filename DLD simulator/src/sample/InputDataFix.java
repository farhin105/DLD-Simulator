package sample;

/**
 * Created by DELL on 12/2/2015.
 */
public class InputDataFix {
    int arrayTest[]=new int[6];
    public InputDataFix()
    {
        for(int i=0;i<6;i++)
        {
            arrayTest[i]=0;
        }
    }
    void checkInput(int i)
    {
        if(arrayTest[i]==1) {
            arrayTest[i]=0;
           System.out.println("In: "+arrayTest[i]);
        }
        else
        {
            arrayTest[i]=1;
            System.out.println("In: "+arrayTest[i]);
        }
    }
}
