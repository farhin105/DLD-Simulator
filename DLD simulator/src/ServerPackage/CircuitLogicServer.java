package ServerPackage;

import java.io.Serializable;

/**
 * Created by DELL on 12/8/2015.
 */
public class CircuitLogicServer implements Serializable{
    public int CircuitAnd(int in1,int in2)
    {
        if(in1 == 1 && in2 == 1) return 1;
        return 0;
    }
    public int CircuitOr(int in1,int in2)
    {
        if(in1 == 0 && in2 == 0) return 0;
        return 1;
    }
    public int CircuitNot(int in1)
    {
        if(in1 == 0) return 1;
        return 0;
    }
    public int CircuitNand(int in1,int in2)
    {
        return CircuitNot(CircuitAnd(in1,in2));
    }
    public int CircuitNor(int in1,int in2)
    {
        return CircuitNot(CircuitOr(in1, in2));
    }
    public int CircuitXor(int in1, int in2)
    {
        if((in1 == 1 && in2 ==0) || (in1 == 0 && in2 == 1)) return 1;
        return 0;
    }
    public int CircuitXnor(int in1, int in2)
    {
        return CircuitNot(CircuitXor(in1, in2));
    }
}
