package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
//<<<<<<< HEAD
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
//=======
    /*public void start(Stage primaryStage) throws Exception{
<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
=======
>>>>>>> 7bb0ae5397b56cb673200188aff08b6bad605112
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));*/
//>>>>>>> ffe86ea4918f8c44a8387714aaa27165e8eb5e14
        primaryStage.show();
    }


//<<<<<<< HEAD

//=======
//>>>>>>> ffe86ea4918f8c44a8387714aaa27165e8eb5e14
    public static void main(String[] args) {
        launch(args);
    }
}
