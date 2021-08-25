package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {
    Stage stage;
    static int i1=9,i2=9,i3=9,i4=9,i5=9,i6=9,i7=9;
    static Circle C=new Circle();
    DrawingLine drawingLine=new DrawingLine();

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;
        showStartPage();
    }
    public void TablePage(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Table.fxml"));
        Parent root = loader.load();
        TableController controller = loader.getController();

        controller.setMain(this);
        Scene scene = new Scene(root, 756, 475);
        primaryStage.setTitle("TRUTH TABLE");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void showStartPage() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("StartPage.fxml"));
        Parent root = loader.load();

        StartPageController controller = loader.getController();
        controller.setMain(this);
        controller.initialize();
        stage.setTitle("         START PAGE ");
        stage.setScene(new Scene(root, 491, 272));
        stage.show();
        // for(int i=0 ; i<20 ;i++) {
        //    System.out.println("in loop");
        controller.timeset();
    }
    public void simulatorPage(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("simulatorSampleTestNEWFirstNew.fxml"));
        Parent root=loader.load();
        // Scene scene = new Scene(root, 735, 500);
        Scene scene = new Scene(root, 756, 475);
        SimulatorController controller=loader.getController();

        // InputDataFromLine inputDataFromLine=new InputDataFromLine(controller);
        controller.initAnd();
        controller.initXor();
        controller.initNot();
        controller.initNand();
        controller.initOr();
        controller.initNor();
        controller.initXnor();
        controller.setMainInController(this);
        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (controller.k == 1) {
                    //System.out.println("Mouse Clicked X: " + event.getX());
                    //System.out.println("Mouse Clicked Y: " + event.getY());
                    controller.iand[i1].setX(event.getX() - 97);
                    controller.iand[i1].setY(event.getY() - 54);
                    controller.k = 0;
                    double topx = event.getX();
                    double topy = event.getY();
                    drawingLine.UpdateData(topx, topy, topx + 13, topy - 8, topx + 44, topy + 20, 7408, i1);
                    if (i1 != 1)
                        i1--;
                    if(i1==1)i1=9;
                } else if (controller.k == 2) {
                    controller.ior[i2].setX(event.getX() - 180);
                    controller.ior[i2].setY(event.getY() - 55);
                    controller.k = 0;
                    double topx = event.getX();
                    double topy = event.getY();
                    drawingLine.UpdateData(topx, topy, topx + 13, topy - 8, topx + 44, topy + 20, 7432, i2);
                    if (i2 != 1)
                        i2--;
                    if(i2==1)i2=9;
                } else if (controller.k == 3) {
                    // System.out.println("Mouse Clicked X: " + event.getX());
                    // System.out.println("Mouse Clicked Y: " + event.getY());
                    controller.inor[i3].setX(event.getX() - 257);
                    controller.inor[i3].setY(event.getY() - 53);
                    controller.k = 0;
                    double topx = event.getX();
                    double topy = event.getY();
                    drawingLine.UpdateData(topx, topy, topx + 13, topy - 8, topx + 44, topy + 20, 7402, i3);
                    //controller.Updateoperatordata(topx + 64, topy + 5);
                    // controller.UpdateData(topx,topy,topx+68,topy+38,7402,i3);
                    if (i3 != 1)
                        i3--;
                    if(i3==1)i3=9;
                } else if (controller.k == 4) {
                    // System.out.println("Mouse Clicked X: " + event.getX());
                    // System.out.println("Mouse Clicked Y: " + event.getY());
                    controller.inand[i4].setX(event.getX() - 339);
                    controller.inand[i4].setY(event.getY() - 53);
                    controller.k = 0;
                    double topx = event.getX();
                    double topy = event.getY();
                    drawingLine.UpdateData(topx, topy, topx + 13, topy - 8, topx + 44, topy + 20, 7400, i4);
                    if (i4 != 1)
                        i4--;
                    if(i4==1)i4=9;
                } else if (controller.k == 5) {
                    // System.out.println("Mouse Clicked X: " + event.getX());
                    // System.out.println("Mouse Clicked Y: " + event.getY());
                    controller.ixor[i5].setX(event.getX() - 419);
                    controller.ixor[i5].setY(event.getY() - 53);
                    controller.k = 0;
                    double topx = event.getX();
                    double topy = event.getY();
                    drawingLine.UpdateData(topx, topy, topx + 13, topy - 8, topx + 44, topy + 20, 7486, i5);
                    if (i5 != 1)
                        i5--;
                    if(i5==1)i5=9;
                } else if (controller.k == 6) {
                    //System.out.println("Mouse Clicked X: " + event.getX());
                    // System.out.println("Mouse Clicked Y: " + event.getY());
                    controller.inot[i6].setX(event.getX() - 496);
                    controller.inot[i6].setY(event.getY() - 61);
                    controller.k = 0;
                    double topx = event.getX();
                    double topy = event.getY();
                    drawingLine.UpdateData(topx, topy, topx + 13, topy - 8, topx + 44, topy + 20, 7404, i6);
                    if (i6 != 1)
                        i6--;
                    if(i6==1)i6=9;
                } else if (controller.k == 7) {
                    // System.out.println("Mouse Clicked X: " + event.getX());
                    //System.out.println("Mouse Clicked Y: " + event.getY());
                    controller.ixnor[i7].setX(event.getX() - 576);
                    controller.ixnor[i7].setY(event.getY() - 53);
                    controller.k = 0;
                    double topx = event.getX();
                    double topy = event.getY();
                    drawingLine.UpdateData(topx, topy, topx + 13, topy - 8, topx + 44, topy + 20, 7426, i7);
                    if (i7 != 1)
                        i7--;
                    if(i7==1)i7=9;
                }
                else if (controller.k == 9) {
                    // System.out.println("Mouse Clicked X: " + event.getX());
                    // System.out.println("Mouse Clicked Y: " + event.getY());
                    int gateNum=0,index=-1;
                    for (int i = 0; i < drawingLine.data.size(); i++) {
                        double fx = drawingLine.data.get(i).getx1();
                        double fy = drawingLine.data.get(i).gety1();
                        double lx = drawingLine.data.get(i).getx2();
                        double ly = drawingLine.data.get(i).gety2();
                        // System.out.println("fx=" + fx + " fy=" + fy + " lx=" + lx + "ly=" + ly);
                        if (fx < event.getX() && lx > event.getX() && fy < event.getY() && ly > event.getY()) {
                            System.out.println("in if condition");
                            index = drawingLine.data.get(i).getGateIndex();
                            gateNum = drawingLine.data.get(i).getGateNo();
                            System.out.println("i: "+i);
                            System.out.println("index=" + index);
                            System.out.println("gate number=" + gateNum);
                            drawingLine.data.remove(i);
                        }
                    }
                    if(gateNum==7408){ controller.iand[index].setX(controller.iand[0].getX());controller.iand[index].setY(controller.iand[0].getY());  }
                    else if(gateNum==7432){ controller.ior[index].setX(controller.ior[0].getX());controller.ior[index].setY(controller.ior[0].getY());  }
                    else if(gateNum==7404){ controller.inot[index].setX(controller.inot[0].getX());controller.inot[index].setY(controller.inot[0].getY());  }
                    else if(gateNum==7486){ controller.ixor[index].setX(controller.ixor[0].getX());controller.ixor[index].setY(controller.ixor[0].getY());  }
                    else if(gateNum==7426){ controller.ixnor[index].setX(controller.ixnor[0].getX());controller.ixnor[index].setY(controller.ixnor[0].getY());  }
                    else if(gateNum==7400){ controller.inand[index].setX(controller.inand[0].getX());controller.inand[index].setY(controller.inand[0].getY());  } else if(gateNum==7402){ controller.inor[index].setX(controller.inor[0].getX());controller.inor[index].setY(controller.inor[0].getY());  }

                    controller.k = 0;
                }
                else if (controller.k == 19) {
                    // System.out.println("Mouse Clicked X: " + event.getX());
                    // System.out.println("Mouse Clicked Y: " + event.getY());
                    DeleteWireCheck deleteWireCheck = new DeleteWireCheck(event.getX(), event.getY(), drawingLine);
                    if (deleteWireCheck.getbool() == 1) {
                        System.out.println("in if");
                        controller.anchorPane.getChildren().remove(deleteWireCheck.getLine1());
                        controller.anchorPane.getChildren().remove(deleteWireCheck.getLine2());
                        controller.anchorPane.getChildren().remove(deleteWireCheck.getCircle1());
                        controller.anchorPane.getChildren().remove(deleteWireCheck.getCircle2());
                    } else if (deleteWireCheck.getbool() == 0) {
                        System.out.println("in if else");
                    }
                    controller.k = 0;
                }
                else if (controller.k == 8) {
                    System.out.println("Mouse Clicked X: " + event.getX());
                     System.out.println("Mouse Clicked Y: " + event.getY());
                    drawingLine.checktest();
                    if(drawingLine.test==0) {
                        drawingLine.x1 = event.getX();
                        drawingLine.y1 = event.getY();
                        Circle circle1=new Circle(drawingLine.x1,drawingLine.y1,2);
                        circle1.setFill(Color.BLACK);
                        controller.anchorPane.getChildren().add(circle1);
                        if((DrawingLine.y1-DrawingLine.y2)<=3 && (DrawingLine.y1-DrawingLine.y2)>-3 )
                        {
                            Line line = new Line(drawingLine.x1, drawingLine.y1,drawingLine.x2, drawingLine.y2);
                            line.setFill(Color.BLACK);
                            controller.anchorPane.getChildren().add(line);
                            drawingLine.UpdateLineData(drawingLine.x1, drawingLine.y1, drawingLine.x2, drawingLine.y2, drawingLine.x1, drawingLine.y1, line, line, circle1, C);
                        }
                        else
                        {
                            Line line1= new Line(drawingLine.x1, drawingLine.y1,drawingLine.x1, drawingLine.y2);
                            line1.setFill(Color.BLACK);
                            controller.anchorPane.getChildren().add(line1);
                            Line line2 = new Line(drawingLine.x1, drawingLine.y2,drawingLine.x2, drawingLine.y2);
                            line2.setFill(Color.BLACK);
                            controller.anchorPane.getChildren().add(line2);
                            drawingLine.UpdateLineData(drawingLine.x1, drawingLine.y1, drawingLine.x2, drawingLine.y2, drawingLine.x1, drawingLine.y2, line1, line2, circle1, C);
                        }
                        controller.k=0;
                    }
                    if(drawingLine.test==1)
                    {
                        System.out.println("test1");
                        drawingLine.x2=event.getX();
                        drawingLine.y2=event.getY();
                        Circle circle2=new Circle(drawingLine.x2,drawingLine.y2,2);
                        C=circle2;
                        circle2.setFill(Color.BLACK);
                        controller.anchorPane.getChildren().add(circle2);
                    }
                }

            }
        });

        primaryStage.setTitle("Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
