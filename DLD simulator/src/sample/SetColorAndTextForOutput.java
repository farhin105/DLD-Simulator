package sample;

import javafx.scene.paint.Color;

/**
 * Created by DELL on 12/9/2015.
 */
public class SetColorAndTextForOutput {
    void SetColor(SimulatorController controller,int Final_Array[][],Main m)
    {
        for(int i=0;i<m.drawingLine.OutputData.size();i++)
        {
            if(Final_Array[m.drawingLine.OutputData.get(i).Output][1]==1)
            {
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==0)
                {
                    controller.TextOutput1.setText("1");
                    controller.output1.setFill(Color.RED);
                }
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==1)
                {
                    controller.TextOutput2.setText("1");
                    controller.output2.setFill(Color.RED);
                }
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==2)
                {
                    controller.TextOutput3.setText("1");
                    controller.output3.setFill(Color.RED);
                }
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==3)
                {
                    controller.TextOutput4.setText("1");
                    controller.output4.setFill(Color.RED);
                }
            }
            if(Final_Array[m.drawingLine.OutputData.get(i).Output][1]==0)
            {
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==0)
                {
                    controller.TextOutput1.setText("0");
                    controller.output1.setFill(Color.YELLOW);
                }
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==1)
                {
                    controller.TextOutput2.setText("0");
                    controller.output2.setFill(Color.YELLOW);
                }
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==2)
                {
                    controller.TextOutput3.setText("0");
                    controller.output3.setFill(Color.YELLOW);
                }
                if(m.drawingLine.OutputData.get(i).OutArrayIndex==3)
                {
                    controller.TextOutput4.setText("0");
                    controller.output4.setFill(Color.YELLOW);
                }
            }
        }

    }
}
