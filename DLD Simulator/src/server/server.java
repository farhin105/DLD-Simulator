package server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("server.fxml"));
        Parent root = loader.load();

        // Loading the controller
      //  TableViewController controller = loader.getController();
        //controller.initializeColumns();

        //Parent root = FXMLLoader.load(getClass().getResource("TableView.fxml"));
        primaryStage.setTitle("   Server  ");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }


    public static void main(String[] arg) {

        CircuitLogicServer employee =new CircuitLogicServer() ;

        try {

            ServerSocket socketConnection = new ServerSocket(11111);
            while(true){
            System.out.println("Server Waiting for DLD connection fron Client....");

            Socket pipe = socketConnection.accept();

            ObjectInputStream serverInputStream = new
                    ObjectInputStream(pipe.getInputStream());

            ObjectOutputStream serverOutputStream = new
                    ObjectOutputStream(pipe.getOutputStream());

           // employee = (CircuitLogicServer )serverInputStream.readObject();
            serverOutputStream.writeObject(employee);}

           // serverInputStream.close();
           // serverOutputStream.close();


        }  catch(Exception e) {System.out.println("server: "+e);
        }
    }

}
