package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * Created by DELL on 12/1/2015.
 */
public class DrawingLine {
    int test;
    static double x1,x2,y1,y2;
    public ObservableList<LineData> dataLine= FXCollections.observableArrayList();
    public ObservableList<GateData> data = FXCollections.observableArrayList();
    public ObservableList<OutputIndex> OutputData = FXCollections.observableArrayList();
    public ObservableList<SameIndex> SameIndexData = FXCollections.observableArrayList();

    public void UpdateData(double x,double y,double x1, double y1 , double x2 , double y2, int GateNo,int GateIndex) {
        GateData gateData=new GateData(x,y,x1,y1,x2,y2,GateNo,GateIndex);
        data.add(gateData);
      /*  for(int i =0;i<data.size();i++) {
            System.out.println((data.get(i).getx1()+" "+data.get(i).gety1()+" "+data.get(i).getx2()+" "+data.get(i).gety2()+" " +data.get(i).getGateNo()+" "+data.get(i).getGateIndex()));
        }*/

    }

    public void UpdateLineData(double x1, double y1 , double x2 , double y2,double midx,double midy, Line line1,Line line2,Circle circle1,Circle circle2) {
        LineData gateData=new LineData(x1, y1, x2, y2, midx, midy, line1, line2, circle1, circle2);
        dataLine.add(gateData);
       /* for(int i =0;i<dataLine.size();i++) {
            System.out.println(("x1: "+dataLine.get(i).getx1()+" "+"y1: "+dataLine.get(i).gety1()+" "+"x2: "+dataLine.get(i).getx2()+" "+"y2: "+dataLine.get(i).gety2() ));}*/

    }
    public void UpdateOutputIndex(int output,int outputIndex)
    {
        OutputIndex gatedata=new OutputIndex(output,outputIndex);
        OutputData.add(gatedata);
        for(int i=0;i<OutputData.size();i++)
        {
            System.out.println("OutputIndex:    "+OutputData.get(i).OutArrayIndex+"   i is  : "+i);
        }
    }
    public void UpdateSameIndex(int index1,int index2,int finalIndex)
    {
        SameIndex gatedata=new SameIndex(index1,index2,finalIndex);
        SameIndexData.add(gatedata);
      /*  for(int i=0;i<OutputData.size();i++)
        {
            System.out.println("OutputIndex:    "+OutputData.get(i).OutArrayIndex+"   i is  : "+i);
        }*/
    }
    void checktest()
    {
        if(test==0)test=1;
        else test=0;
    }

}
