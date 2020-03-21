package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
<<<<<<< HEAD
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
=======
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
>>>>>>> ffe86ea4918f8c44a8387714aaa27165e8eb5e14
        primaryStage.show();
    }


<<<<<<< HEAD

=======
>>>>>>> ffe86ea4918f8c44a8387714aaa27165e8eb5e14
    public static void main(String[] args) {
        launch(args);
    }
}
