package sample;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * Created by User on 12/6/2015.
 */
public class DeleteWireCheck {
    public double x;
    public double y;
    public Line line1;
    public Line line2;
    public Circle circle1;
    public Circle circle2;
    public int bool=0;
    // public double shortx;
    // public  double shorty;
    public DeleteWireCheck(double x, double y, DrawingLine drawingLine){
        // DrawingLine drawingLine=new DrawingLine();
        this.x=x;
        this.y=y;
        for(int i=0 ; i<drawingLine.dataLine.size();i++){
            if(drawingLine.dataLine.get(i).getx1()==drawingLine.dataLine.get(i).getMidx() && drawingLine.dataLine.get(i).gety1()==drawingLine.dataLine.get(i).getMidy()) {
                if ((x <= drawingLine.dataLine.get(i).getx1() && x >= drawingLine.dataLine.get(i).getx2()) || (x <= drawingLine.dataLine.get(i).getx2() && x >= drawingLine.dataLine.get(i).getx1())) {
                    if (y >= drawingLine.dataLine.get(i).gety1() - 5 && y <= drawingLine.dataLine.get(i).gety1() + 5) {
                        bool = 1;
                        line1 = drawingLine.dataLine.get(i).getLine1();
                        line2 = drawingLine.dataLine.get(i).getLine2();
                        circle1=drawingLine.dataLine.get(i).getCircle1();
                        circle2=drawingLine.dataLine.get(i).getCircle2();
                        // shortx=drawingLine.dataLine.get(i).getx2();
                        // shorty=drawingLine.dataLine.get(i).gety2();
                        drawingLine.dataLine.remove(i);
                        return;
                    }
                }
            }if(drawingLine.dataLine.get(i).getx1()==drawingLine.dataLine.get(i).getMidx() && drawingLine.dataLine.get(i).gety1()!=drawingLine.dataLine.get(i).getMidy()) {
                if ((x <= drawingLine.dataLine.get(i).getx1() && x >= drawingLine.dataLine.get(i).getx2()) || (x <= drawingLine.dataLine.get(i).getx2() && x >= drawingLine.dataLine.get(i).getx1())) {
                    if (y >= drawingLine.dataLine.get(i).gety2() - 5 && y <= drawingLine.dataLine.get(i).gety2() + 5) {
                        bool = 1;
                        line1 = drawingLine.dataLine.get(i).getLine1();
                        line2 = drawingLine.dataLine.get(i).getLine2();
                        circle1=drawingLine.dataLine.get(i).getCircle1();
                        circle2=drawingLine.dataLine.get(i).getCircle2();
                        drawingLine.dataLine.remove(i);
                        return;
                    }
                } if ((y <= drawingLine.dataLine.get(i).gety1() && y >= drawingLine.dataLine.get(i).gety2()) || (y <= drawingLine.dataLine.get(i).gety2() && y >= drawingLine.dataLine.get(i).gety1())) {
                    //if (x > drawingLine.dataLine.get(i).getx1() - 5 && x < drawingLine.dataLine.get(i).getx1() + 5) {
                    if (x >= drawingLine.dataLine.get(i).getMidx() - 5 && x <= drawingLine.dataLine.get(i).getMidx() + 5) {
                        bool = 1;
                        line1 = drawingLine.dataLine.get(i).getLine1();
                        line2 = drawingLine.dataLine.get(i).getLine2();
                        circle1=drawingLine.dataLine.get(i).getCircle1();
                        circle2=drawingLine.dataLine.get(i).getCircle2();
                        drawingLine.dataLine.remove(i);
                        return;
                    }
                }
            }
        }
    }
    public int getbool(){ return bool; }
    public Line getLine1(){  return line1; }
    public Line getLine2(){  return line2; }
    public Circle getCircle1(){ return circle1; }
    public Circle getCircle2(){ return circle2; }
}
