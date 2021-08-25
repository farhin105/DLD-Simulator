package sample;

import javafx.scene.paint.Color;

/**
 * Created by DELL on 12/3/2015.
 */
public class SetAllForOnButton {
    private static SimulatorController c;
    SetAllForOnButton(SimulatorController c)
    {
        this.c=c;
    }
    void SetText()
    {
        c.TextInputA.setText("0");
        c.TextInputB.setText("0");
        c.TextInputC.setText("0");
        c.TextInputD.setText("0");
        c.TextInputE.setText("0");
        c.TextInputF.setText("0");
    }
    void setColor()
    {
        c.inputCircleA.setFill(Color.DODGERBLUE);
        c.inputCircleB.setFill(Color.DODGERBLUE);
        c.inputCircleC.setFill(Color.DODGERBLUE);
        c.inputCircleD.setFill(Color.DODGERBLUE);
        c.inputCircleE.setFill(Color.DODGERBLUE);
        c.inputCircleF.setFill(Color.DODGERBLUE);
    }
}
