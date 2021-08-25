package sample;
/**
 * Created by User on 11/30/2015.
 */
public class GateData {
    public double x;
    public double y;
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public int GateNo;
    public int GateIndex;

    public GateData(double x, double y ,double x1, double y1, double x2, double y2, int GateNo, int GateIndex){
        this.x = x;
        this.y=y;
        this.x1 = x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.GateNo=GateNo;
        this.GateIndex=GateIndex;
    }
    public double getx() {return x;}
    public double gety() {
        return y;
    }
    public double getx1() {return x1;}
    public double getx2() {return x2;}
    public double gety1() {
        return y1;
    }
    public double gety2() {
        return y2;
    }
    public int getGateNo() {
        return GateNo;
    }
    public int getGateIndex() {
        return GateIndex;
    }
}
