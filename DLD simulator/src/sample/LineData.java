package sample;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * Created by DELL on 12/5/2015.
 */
public class LineData {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double midx;
    public double midy;
    public Line line1;
    public Line line2;
    public Circle circle1;
    public  Circle circle2;
    public LineData(double x1, double y1, double x2, double y2,double midx, double midy, Line line1, Line line2,Circle circle1,Circle circle2){
        this.x1 =x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.line1=line1;
        this.line2=line2;
        this.midx=midx;
        this.midy=midy;
        this.circle1=circle1;
        this.circle2=circle2;
    }
    public double getx1() {return x1;}
    public double getx2() {return x2;}
    public double gety1() {return y1;}
    public double gety2() {return y2;}
    public Line getLine1(){return line1;}
    public Line getLine2(){return line2;}
    public double getMidx(){ return midx;}
    public double getMidy(){ return midy;}
    public Circle getCircle1(){ return circle1; }
    public Circle getCircle2(){ return circle2; }
}
