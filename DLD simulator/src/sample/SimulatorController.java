package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import util.NetworkUtil;

import java.awt.*;
import java.io.IOException;


public class SimulatorController implements Runnable {
    @FXML
    public ImageView imageAnd;
    @FXML
    public ImageView imageAnd1;
    @FXML
    public ImageView imageAnd2;
    @FXML
    public ImageView imageAnd3;
    @FXML
    public ImageView imageAnd4;
    @FXML
    public ImageView imageAnd5;
    @FXML
    public ImageView imageAnd6;
    @FXML
    public ImageView imageAnd7;
    @FXML
    public ImageView imageAnd8;
    @FXML
    public ImageView imageAnd9;
    @FXML
    public ImageView imageAnd10;
    @FXML
    public ImageView imageOr;
    @FXML
    public ImageView imageOr1;
    @FXML
    public ImageView imageOr2;
    @FXML
    public ImageView imageOr3;
    @FXML
    public ImageView imageOr4;
    @FXML
    public ImageView imageOr5;
    @FXML
    public ImageView imageOr6;
    @FXML
    public ImageView imageOr7;
    @FXML
    public ImageView imageOr8;
    @FXML
    public ImageView imageOr9;
    @FXML
    public ImageView imageOr10;
    @FXML
    public ImageView imageNot;
    @FXML
    public ImageView imageNot1;
    @FXML
    public ImageView imageNot2;
    @FXML
    public ImageView imageNot3;
    @FXML
    public ImageView imageNot4;
    @FXML
    public ImageView imageNot5;
    @FXML
    public ImageView imageNot6;
    @FXML
    public ImageView imageNot7;
    @FXML
    public ImageView imageNot8;
    @FXML
    public ImageView imageNot9;
    @FXML
    public ImageView imageNot10;
    @FXML
    public ImageView imageNor;
    @FXML
    public ImageView imageNor1;
    @FXML
    public ImageView imageNor2;
    @FXML
    public ImageView imageNor3;
    @FXML
    public ImageView imageNor4;
    @FXML
    public ImageView imageNor5;
    @FXML
    public ImageView imageNor6;
    @FXML
    public ImageView imageNor7;
    @FXML
    public ImageView imageNor8;
    @FXML
    public ImageView imageNor9;
    @FXML
    public ImageView imageNor10;
    @FXML
    public ImageView imageXor;
    @FXML
    public ImageView imageXor1;
    @FXML
    public ImageView imageXor2;
    @FXML
    public ImageView imageXor3;
    @FXML
    public ImageView imageXor4;
    @FXML
    public ImageView imageXor5;
    @FXML
    public ImageView imageXor6;
    @FXML
    public ImageView imageXor7;
    @FXML
    public ImageView imageXor8;
    @FXML
    public ImageView imageXor9;
    @FXML
    public ImageView imageXor10;
    @FXML
    public ImageView imageNand;
    @FXML
    public ImageView imageNand1;
    @FXML
    public ImageView imageNand2;
    @FXML
    public ImageView imageNand3;
    @FXML
    public ImageView imageNand4;
    @FXML
    public ImageView imageNand5;
    @FXML
    public ImageView imageNand6;
    @FXML
    public ImageView imageNand7;
    @FXML
    public ImageView imageNand8;
    @FXML
    public ImageView imageNand9;
    @FXML
    public ImageView imageNand10;
    @FXML
    public ImageView imageXnor;
    @FXML
    public ImageView imageXnor1;
    @FXML
    public ImageView imageXnor2;
    @FXML
    public ImageView imageXnor3;
    @FXML
    public ImageView imageXnor4;
    @FXML
    public ImageView imageXnor5;
    @FXML
    public ImageView imageXnor6;
    @FXML
    public ImageView imageXnor7;
    @FXML
    public ImageView imageXnor8;
    @FXML
    public ImageView imageXnor9;
    @FXML
    public ImageView imageXnor10;
    @FXML
    public ImageView imageWires;
    @FXML
    public AnchorPane anchorPane;
    @FXML
    public TextField TextInputA;
    @FXML
    public TextField TextInputB;
    @FXML
    public TextField TextInputC;
    @FXML
    public TextField TextInputD;
    @FXML
    public TextField TextInputE;
    @FXML
    public TextField TextInputF;
    @FXML
    public Circle inputCircleA;
    @FXML
    public Circle inputCircleB;
    @FXML
    public Circle inputCircleC;
    @FXML
    public Circle inputCircleD;
    @FXML
    public Circle inputCircleE;
    @FXML
    public Circle inputCircleF;
    @FXML
    public Circle output1;
    @FXML
    public Circle output2;
    @FXML
    public Circle output3;
    @FXML
    public Circle output4;
    @FXML
    public TextField TextOutput1;
    @FXML
    public TextField TextOutput2;
    @FXML
    public TextField TextOutput3;
    @FXML
    public TextField TextOutput4;
    public static  int k=0;
    int On_k=0;
    public ImageView iand[]=new ImageView[10];
    public ImageView ior[]=new ImageView[10];
    public ImageView inot[]=new ImageView[10];
    public ImageView inor[]=new ImageView[10];
    public ImageView ixor[]=new ImageView[10];
    public ImageView inand[]=new ImageView[10];
    public ImageView ixnor[]=new ImageView[10];
    @FXML
    public void initAnd() {
        keepImageAnd();
        Image imgWire=new Image(Main.class.getResourceAsStream("wires.png"));
        imageWires.setImage(imgWire);
        Image imgAnd = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd.setImage(imgAnd);
        Image imgAnd1 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd1.setImage(imgAnd1);
        Image imgAnd2 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd2.setImage(imgAnd2);
        Image imgAnd3 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd3.setImage(imgAnd3);
        Image imgAnd4 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd4.setImage(imgAnd4);
        Image imgAnd5 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd5.setImage(imgAnd5);
        Image imgAnd6 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd6.setImage(imgAnd6);
        Image imgAnd7 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd7.setImage(imgAnd7);
        Image imgAnd8 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd8.setImage(imgAnd8);
        Image imgAnd9 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd9.setImage(imgAnd9);
        Image imgAnd10 = new Image(Main.class.getResourceAsStream("and.png"));
        imageAnd10.setImage(imgAnd10);
    }
    @FXML
    public void initOr()
    {
        keepImageOr();
        Image imgOr = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr.setImage(imgOr);
        Image imgOr1 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr1.setImage(imgOr1);
        Image imgOr2 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr2.setImage(imgOr2);
        Image imgOr3 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr3.setImage(imgOr3);
        Image imgOr4 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr4.setImage(imgOr4);
        Image imgOr5 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr5.setImage(imgOr5);
        Image imgOr6 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr6.setImage(imgOr6);
        Image imgOr7 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr7.setImage(imgOr7);
        Image imgOr8 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr8.setImage(imgOr8);
        Image imgOr9 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr9.setImage(imgOr9);
        Image imgOr10 = new Image(Main.class.getResourceAsStream("or.png"));
        imageOr10.setImage(imgOr10);
    }
    @FXML
    public void initNor()
    {
        keepImageNor();
        Image imgNor = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor.setImage(imgNor);
        Image imgNor1 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor1.setImage(imgNor1);
        Image imgNor2 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor2.setImage(imgNor2);
        Image imgNor3 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor3.setImage(imgNor3);
        Image imgNor4 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor4.setImage(imgNor4);
        Image imgNor5 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor5.setImage(imgNor5);
        Image imgNor6 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor6.setImage(imgNor6);
        Image imgNor7 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor7.setImage(imgNor7);
        Image imgNor8 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor8.setImage(imgNor8);
        Image imgNor9 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor9.setImage(imgNor9);
        Image imgNor10 = new Image(Main.class.getResourceAsStream("Nor.png"));
        imageNor10.setImage(imgNor10);

    }
    @FXML
    public void initNand()
    {
        keepImageNand();
        Image imgNand = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand.setImage(imgNand);
        Image imgNand1 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand1.setImage(imgNand1);
        Image imgNand2 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand2.setImage(imgNand2);
        Image imgNand3 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand3.setImage(imgNand3);
        Image imgNand4 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand4.setImage(imgNand4);
        Image imgNand5 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand5.setImage(imgNand5);
        Image imgNand6 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand6.setImage(imgNand6);
        Image imgNand7 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand7.setImage(imgNand7);
        Image imgNand8 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand8.setImage(imgNand8);
        Image imgNand9 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand9.setImage(imgNand9);
        Image imgNand10 = new Image(Main.class.getResourceAsStream("Nand.png"));
        imageNand10.setImage(imgNand10);
    }
    @FXML
    public void initNot()
    {
        keepImageNot();
        Image imgNot = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot.setImage(imgNot);
        Image imgNot1 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot1.setImage(imgNot1);
        Image imgNot2 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot2.setImage(imgNot2);
        Image imgNot3 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot3.setImage(imgNot3);
        Image imgNot4 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot4.setImage(imgNot4);
        Image imgNot5 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot5.setImage(imgNot5);
        Image imgNot6 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot6.setImage(imgNot6);
        Image imgNot7 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot7.setImage(imgNot7);
        Image imgNot8 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot8.setImage(imgNot8);
        Image imgNot9 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot9.setImage(imgNot9);
        Image imgNot10 = new Image(Main.class.getResourceAsStream("Not.png"));
        imageNot10.setImage(imgNot10);
    }
    @FXML
    public void initXor()
    {
        keepImageXor();
        Image imgXor = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor.setImage(imgXor);
        Image imgXor1 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor1.setImage(imgXor1);
        Image imgXor2 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor2.setImage(imgXor2);
        Image imgXor3 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor3.setImage(imgXor3);
        Image imgXor4 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor4.setImage(imgXor4);
        Image imgXor5 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor5.setImage(imgXor5);
        Image imgXor6 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor6.setImage(imgXor6);
        Image imgXor7 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor7.setImage(imgXor7);
        Image imgXor8 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor8.setImage(imgXor8);
        Image imgXor9 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor9.setImage(imgXor9);
        Image imgXor10 = new Image(Main.class.getResourceAsStream("Xor.png"));
        imageXor10.setImage(imgXor10);
    }
    @FXML
    public void initXnor()
    {
        keepImageXnor();
        Image imgXnor = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor.setImage(imgXnor);
        Image imgXnor1 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor1.setImage(imgXnor1);
        Image imgXnor2 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor2.setImage(imgXnor2);
        Image imgXnor3 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor3.setImage(imgXnor3);
        Image imgXnor4 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor4.setImage(imgXnor4);
        Image imgXnor5 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor5.setImage(imgXnor5);
        Image imgXnor6 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor6.setImage(imgXnor6);
        Image imgXnor7 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor7.setImage(imgXnor7);
        Image imgXnor8 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor8.setImage(imgXnor8);
        Image imgXnor9 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor9.setImage(imgXnor9);
        Image imgXnor10 = new Image(Main.class.getResourceAsStream("Xnor.png"));
        imageXnor10.setImage(imgXnor10);
    }
    public void keepImageAnd()
    {
        iand[0]=imageAnd1;
        iand[1]=imageAnd2;
        iand[2]=imageAnd3;
        iand[3]=imageAnd4;
        iand[4]=imageAnd5;
        iand[5]=imageAnd6;
        iand[6]=imageAnd7;
        iand[7]=imageAnd8;
        iand[8]=imageAnd9;
        iand[9]=imageAnd10;
    }
    public void keepImageNot()
    {
        inot[0]=imageNot1;
        inot[1]=imageNot2;
        inot[2]=imageNot3;
        inot[3]=imageNot4;
        inot[4]=imageNot5;
        inot[5]=imageNot6;
        inot[6]=imageNot7;
        inot[7]=imageNot8;
        inot[8]=imageNot9;
        inot[9]=imageNot10;
    }
    public void keepImageOr()
    {
        ior[0]=imageOr1;
        ior[1]=imageOr2;
        ior[2]=imageOr3;
        ior[3]=imageOr4;
        ior[4]=imageOr5;
        ior[5]=imageOr6;
        ior[6]=imageOr7;
        ior[7]=imageOr8;
        ior[8]=imageOr9;
        ior[9]=imageOr10;
    }
    public void keepImageNand()
    {
        inand[0]=imageNand1;
        inand[1]=imageNand2;
        inand[2]=imageNand3;
        inand[3]=imageNand4;
        inand[4]=imageNand5;
        inand[5]=imageNand6;
        inand[6]=imageNand7;
        inand[7]=imageNand8;
        inand[8]=imageNand9;
        inand[9]=imageNand10;
    }
    public void keepImageNor()
    {
        inor[0]=imageNor1;
        inor[1]=imageNor2;
        inor[2]=imageNor3;
        inor[3]=imageNor4;
        inor[4]=imageNor5;
        inor[5]=imageNor6;
        inor[6]=imageNor7;
        inor[7]=imageNor8;
        inor[8]=imageNor9;
        inor[9]=imageNor10;
    }
    public void keepImageXor()
    {
        ixor[0]=imageXor1;
        ixor[1]=imageXor2;
        ixor[2]=imageXor3;
        ixor[3]=imageXor4;
        ixor[4]=imageXor5;
        ixor[5]=imageXor6;
        ixor[6]=imageXor7;
        ixor[7]=imageXor8;
        ixor[8]=imageXor9;
        ixor[9]=imageXor10;
    }
    public void keepImageXnor()
    {
        ixnor[0]=imageXnor1;
        ixnor[1]=imageXnor2;
        ixnor[2]=imageXnor3;
        ixnor[3]=imageXnor4;
        ixnor[4]=imageXnor5;
        ixnor[5]=imageXnor6;
        ixnor[6]=imageXnor7;
        ixnor[7]=imageXnor8;
        ixnor[8]=imageXnor9;
        ixnor[9]=imageXnor10;
    }
    @FXML
    public void ActionAnd(ActionEvent e)
    {
        if(On_k==10) k=1;
        System.out.println("And: "+k);
    }
    @FXML
    public void ActionOr(ActionEvent e)
    {
        if(On_k==10) k=2;
        System.out.println("Or: "+k);
    }
    @FXML
    public void ActionNor(ActionEvent e)
    {
        if(On_k==10) k=3;
        System.out.println("Nor: "+k);
    }
    @FXML
    public void ActionNand(ActionEvent e)
    {
        if(On_k==10) k=4;
        System.out.println("Nand: "+k);
    }
    @FXML
    public void ActionXor(ActionEvent e)
    {
        if(On_k==10) k=5;
        System.out.println("Xor: "+k);
    }
    @FXML
    public void ActionNot(ActionEvent e)
    {
        if(On_k==10) k=6;
        System.out.println("Not: "+k);
    }
    @FXML
    public void ActionXnor(ActionEvent e)
    {
        if(On_k==10) k=7;
        System.out.println("Xnor: "+k);
    }
    @FXML
    public void ActionWires(ActionEvent e)
    {
        if(On_k==10)k=8;
        System.out.println("Wires: " + k);
    }

    InputDataFix inputDataFix=new InputDataFix();
    @FXML
    public void ActionDelete(ActionEvent e)
    {
        if(On_k==10)k=9;
        System.out.println("on action delete");
    }
    @FXML
    public void ActionOn(ActionEvent event) {
        On_k=10;
        System.out.println("start: "+k);
        SetAllForOnButton setAllForOnButton=new SetAllForOnButton(this);
        setAllForOnButton.SetText();
        setAllForOnButton.setColor();
    }
    static int c1=2,c2=2,c3=2,c4=2,c5=2,c6=2;
    public void ActionInputA() {
            c1++;
            if(c1==10)c1=2;
            System.out.println("c1: "+c1%2);
            inputDataFix.checkInput(0);
            TextInputA.setText(String.valueOf(inputDataFix.arrayTest[0]));
            if (inputDataFix.arrayTest[0] == 1) inputCircleA.setFill(Color.GREENYELLOW);
            else inputCircleA.setFill(Color.DODGERBLUE);
    }

    public void ActionInputB() {
            c2++;
            if(c2==10)c2=2;
            System.out.println("c2: "+c2%2);
            inputDataFix.checkInput(1);
            TextInputB.setText(String.valueOf(inputDataFix.arrayTest[1]));
            if (inputDataFix.arrayTest[1] == 1) inputCircleB.setFill(Color.GREENYELLOW);
            else inputCircleB.setFill(Color.DODGERBLUE);
    }

    public void ActionInputC() {
        c3++;
        if(c3==10)c3=2;
        System.out.println("c3: "+c3%2);
        inputDataFix.checkInput(2);
        TextInputC.setText(String.valueOf(inputDataFix.arrayTest[2]));
        if(inputDataFix.arrayTest[2]==1)inputCircleC.setFill(Color.GREENYELLOW);
        else inputCircleC.setFill(Color.DODGERBLUE);
    }

    public void ActionInputD() {
        c4++;
        if(c4==10)c4=2;
        System.out.println("c4: "+c4%2);
        inputDataFix.checkInput(3);
        TextInputD.setText(String.valueOf(inputDataFix.arrayTest[3]));
        if(inputDataFix.arrayTest[3]==1)inputCircleD.setFill(Color.GREENYELLOW);
        else inputCircleD.setFill(Color.DODGERBLUE);
    }

    public void ActionInputE() {
        c5++;
        if(c5==10)c5=2;
        System.out.println("c5: "+c5%2);
        inputDataFix.checkInput(4);
        TextInputE.setText(String.valueOf(inputDataFix.arrayTest[4]));
        if(inputDataFix.arrayTest[4]==1)inputCircleE.setFill(Color.GREENYELLOW);
        else inputCircleE.setFill(Color.DODGERBLUE);
    }

    public void ActionInputF() {
        c6++;
        if(c6==10)c6=2;
        System.out.println("c6: "+c6%2);
        inputDataFix.checkInput(5);
        TextInputF.setText(String.valueOf(inputDataFix.arrayTest[5]));
        if(inputDataFix.arrayTest[5]==1)inputCircleF.setFill(Color.GREENYELLOW);
        else inputCircleF.setFill(Color.DODGERBLUE);
    }

    static Main main;
    private Thread t;
    public void setMainInController(Main main)
    {
        this.main=main;
    }
    public void ActionCheck() throws IOException, ClassNotFoundException {
        System.out.println("check");
        try {
            t=new Thread();
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Checking checking=new Checking();
        checking.SetMain(main);
        int A_Array[][],In_Array[],Out_Array[];
        A_Array=checking.CheckerAndGate();
        In_Array=checking.CheckerInput();
        checking.PrintArray(A_Array);
        checking.shortCheckingUpdatedA_Array(A_Array, In_Array);
        Out_Array = checking.CheckerOutput();
        checking.PrintArray(A_Array);
        //checking.shortCheckingUpdatedA_Array(A_Array, In_Array);
      //  checking.PrintArray(A_Array);
        CheckingForOutputAfterChecking checkingForOutputAfterChecking=new CheckingForOutputAfterChecking();
        checkingForOutputAfterChecking.SetMainInCheckingForOutput(main, this);
        checkingForOutputAfterChecking.FinalCheckingFirst(A_Array, In_Array, Out_Array);
    }
    public void run()
    {
        try {
            String serverAddress = "127.0.0.2";
            int serverPort = 55555;
            NetworkUtil nc = new NetworkUtil(serverAddress, serverPort);
            nc.read("v");
        } catch (Exception e)

        {
            System.out.println("Client network error" + e);
        }
    }

    public void ActionDeleteWire() {
        if(On_k==10)k=19;
        System.out.println("on action delete wire");
    }
    public void ActionReset() {
        System.out.println("***on action reset*** & size=" + main.drawingLine.dataLine.size());
        for (int i = 0; i < main.drawingLine.dataLine.size(); i++) {
            System.out.println("in loop check");
            System.out.println("in if "+i);
             anchorPane.getChildren().remove(main.drawingLine.dataLine.get(i).line1);   //new
             anchorPane.getChildren().remove(main.drawingLine.dataLine.get(i).line2);   //new
             anchorPane.getChildren().remove(main.drawingLine.dataLine.get(i).circle1);  //new
             anchorPane.getChildren().remove(main.drawingLine.dataLine.get(i).circle2);  //new
        }
            int gateNum , index ;
            for (int i = 0; i < main.drawingLine.data.size(); i++) {
                System.out.println("in if condition");
                index = main.drawingLine.data.get(i).getGateIndex();
                gateNum = main.drawingLine.data.get(i).getGateNo();
                if (gateNum == 7408) {
                    iand[index].setX(iand[0].getX());
                    iand[index].setY(iand[0].getY());
                } else if (gateNum == 7432) {
                    ior[index].setX(ior[0].getX());
                    ior[index].setY(ior[0].getY());
                } else if (gateNum == 7404) {
                    inot[index].setX(inot[0].getX());
                    inot[index].setY(inot[0].getY());
                } else if (gateNum == 7486) {
                    ixor[index].setX(ixor[0].getX());
                    ixor[index].setY(ixor[0].getY());
                } else if (gateNum == 7426) {
                    ixnor[index].setX(ixnor[0].getX());
                    ixnor[index].setY(ixnor[0].getY());
                } else if (gateNum == 7400) {
                    inand[index].setX(inand[0].getX());
                    inand[index].setY(inand[0].getY());
                } else if (gateNum == 7402) {
                    inor[index].setX(inor[0].getX());
                    inor[index].setY(inor[0].getY());
                }
            }
        main.drawingLine.SameIndexData.remove(0,main.drawingLine.SameIndexData.size());//new added
        main.drawingLine.OutputData.remove(0,main.drawingLine.OutputData.size());//new added
        main.drawingLine.dataLine.remove(0, main.drawingLine.dataLine.size());
        main.drawingLine.data.remove(0, main.drawingLine.data.size());
        SetAllforOutput setAllforOutput=new SetAllforOutput(this);
        System.out.println("index size " + main.drawingLine.SameIndexData.size());
        System.out.println("output size " + main.drawingLine.OutputData.size());
        System.out.println("gate size " + main.drawingLine.data.size());
        System.out.println("line size " + main.drawingLine.dataLine.size());
    }
    public void ActionBackToStart(ActionEvent event){
        try {
            main.showStartPage();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void ActionClose(ActionEvent event){
        //if(On_k==10) k=30;
        main.stage.close();
    }

    public void ActionAbout() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("About.fxml"));
        Parent root = loader.load();
        stage.setTitle("ABOUT ");
        stage.setScene(new Scene(root, 300, 500));
        stage.show();
    }
}
