package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StartPageController implements Runnable {
    public Main main;
    Thread t;
    @FXML
    public ImageView GIFimage;
    @FXML
    public void initialize(){
        Image imggif=new Image(Main.class.getResourceAsStream("GIF4.gif"));
        GIFimage.setImage(imggif);
    }
    @FXML
    public void ActionSimulator(ActionEvent event){
        try {
            main.simulatorPage(main.stage);
        } catch(Exception e) {
            //System.out.println (e);
            e.printStackTrace();
        }
    }
    public void ActionTable(ActionEvent event){

    }
    public void setMain(Main c)
    {
        this.main=c ;
    }
    public void timeset(){
        Thread t=new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        try{
            //  for(int i=0; i<20;i++) {
            System.out.println("in sleep");
            Thread.sleep(3000);
            //main.simulatorPage(main.stage);
            // }
        }catch (InterruptedException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
