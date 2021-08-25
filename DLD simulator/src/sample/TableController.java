package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuItem;
public class TableController {
    private Main main ;
    @FXML
    private TextField Function;
    @FXML
    private MenuItem And;
    @FXML
    private MenuItem Or;
    @FXML
    private MenuItem Nor;
    @FXML
    private MenuItem Nand;
    @FXML
    private MenuItem Xor;
    @FXML
    private MenuItem Xnor;
    @FXML
    private MenuItem Not;
    @FXML
    private MenuItem A;
    @FXML
    private MenuItem B;
    @FXML
    private MenuItem C;
    @FXML
    private MenuItem D;

    @FXML
    void ActionBack(ActionEvent event){
        try {
            main.showStartPage();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void ActionClose(ActionEvent event){
        main.stage.close();
    }
    public void setMain(Main c)
    {
        this.main=c ;
    }
    public void FunctionAction(ActionEvent event) {

    }
    static int countOperator=0;
    static int countInput=0;
    public void ActionAnd(ActionEvent event) {
        if(Function==null)Function.setText("  and ");
        else Function.appendText("  and ");
        countOperator++;
    }

    public void ActionOr(ActionEvent event) {
        if(Function==null)Function.setText(" or ");
        else Function.appendText("  or ");
        countOperator++;
    }

    public void ActionNor(ActionEvent event) {
        if(Function==null) Function.setText(" nor ");
        else Function.appendText("  nor ");
        countOperator++;
    }

    public void ActionNand(ActionEvent event) {
        if(Function==null)Function.setText(" nand ");
        else Function.appendText("  nand ");
        countOperator++;
    }

    public void ActionXor(ActionEvent event) {
        if(Function==null) Function.setText(" xor ");
        else Function.appendText("  xor ");
        countOperator++;
    }

    public void ActionXnor(ActionEvent event) {
        if(Function==null) Function.setText(" xnor ");
        else Function.appendText("  xnor ");
        countOperator++;
    }

    public void ActionNot(ActionEvent event) {
        if(Function==null) Function.setText(" not ");
        else Function.appendText("  not ");
        countOperator++;
    }

    public void ActionA(ActionEvent event) {
        if(Function==null) Function.setText("A");
        else Function.appendText("A");
        countInput++;
    }

    public void ActionB(ActionEvent event) {
        if(Function==null) Function.setText("B");
        else Function.appendText("B");
        countInput++;
    }

    public void ActionC(ActionEvent event) {
        if(Function==null)  Function.setText("C");
        else Function.appendText("C");
        countInput++;
    }

    public void ActionD(ActionEvent event) {
        if(Function==null)Function.setText("D");
        else Function.appendText("D");
        countInput++;
    }

    public void ActionFirst(ActionEvent event) {
        if(Function==null)Function.setText("(");
        else Function.appendText("(");
    }

    public void ActionCloseBrace(ActionEvent event) {
        if(Function==null)Function.setText(")");
        else Function.appendText(")");
    }
}
