package sample;

import javafx.scene.paint.Color;

/**
 * Created by DELL on 12/16/2015.
 */
public class SetAllforOutput {
    private static SimulatorController c;
    SetAllforOutput(SimulatorController c)
    {
        this.c=c;
        c.output1.setFill(Color.TAN);
        c.output2.setFill(Color.TAN);
        c.output3.setFill(Color.TAN);
        c.output4.setFill(Color.TAN);
        c.TextOutput1.setText(null);
        c.TextOutput2.setText(null);
        c.TextOutput3.setText(null);
        c.TextOutput4.setText(null);
    }

}
