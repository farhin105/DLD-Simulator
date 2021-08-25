package sample;

/**
 * Created by DELL on 12/3/2015.
 */
public class InputDataFromLine {
    private static SimulatorController c;
    public int InputArrayActiveTest[]=new int[6];
    public int OutputArrayActive[]=new int[4];
    public static int CHECKING_MIDNODE =100;
    public  int finalY;
    InputDataFromLine(SimulatorController controller)
    {
        c=controller;
    }
    public void InputTest(double x1,double y1,int index)
    {
        if(x1>=83 && x1<=88+10 && y1>=134 && y1<=139+8)
        {
            InputArrayActiveTest[0]=index;
            System.out.println("index: "+index);
            System.out.println("inputA");
            System.out.println("here inputA: "+c.TextInputA.getText());
        }
        if(x1>=83 && x1<=88+10 && y1>=185 && y1<=190+8)
        {
            //InputArrayActiveTest[1]=1;
            InputArrayActiveTest[1]=index;
            System.out.println("index: "+index);
            System.out.println("inputB");
        }
        if(x1>=83 && x1<=88+10 && y1>=242 && y1<=247+8)
        {
            InputArrayActiveTest[2]=index;
            System.out.println("index: "+index);
            System.out.println("inputC");
        }
        if(x1>=83 && x1<=88+10 && y1>=303 && y1<=308+8)
        {
            InputArrayActiveTest[3]=index;
            System.out.println("index: "+index);
            System.out.println("inputD");
        }
        if(x1>=83 && x1<=88+10 && y1>=374 && y1<=379+8)
        {
            InputArrayActiveTest[4]=index;
            System.out.println("index: "+index);
            System.out.println("inputE");
        }
        if(x1>=83 && x1<=88+10 && y1>=436 && y1<=441+8)
        {
            InputArrayActiveTest[5]=index;
            System.out.println("index: "+index);
            System.out.println("inputF");
        }
        if(x1>=695 && x1<=705+18 && y1>=160 && y1<=168+11)//output
        {
            OutputArrayActive[0]=index;
            System.out.println("Output1");
        }
        if(x1>=695 && x1<=705+18 && y1>=220 && y1<=233+11)
        {
            OutputArrayActive[1]=index;
            System.out.println("index: "+index);
            System.out.println("Output2");
        }
        if(x1>=695 && x1<=705+18 && y1>=297 && y1<=307+11)
        {
            OutputArrayActive[2]=index;
            System.out.println("index: "+index);
            System.out.println("Output3");
        }
        if(x1>=695 && x1<=705+18 && y1>=376 && y1<=384+11)
        {
            OutputArrayActive[3]=index;
            System.out.println("index: "+index);
            System.out.println("Output4");
        }

    }
}
