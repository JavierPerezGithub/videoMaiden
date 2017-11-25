package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * The main class
 * @author Javier Pérez
 * @version 1-2017
 * @since 24-11-2017
 * @see SampleController
 */
	
	public class Main extends Application {

    /** The stage. */
    Stage stage;

    /**
     * @param primaryStage the primary stage
     * @throws Exception the exception
     * @see Override start
     */
    
    @Override
    public void start(Stage primaryStage) throws Exception{
      this.stage=primaryStage;
      stage.initStyle(StageStyle.UNDECORATED);
      mainWindow();
    }

    /**
     * Main window.
     */
    public void mainWindow(){

        FXMLLoader loader=new FXMLLoader(Main.class.getResource("sample.fxml"));
        try {
            AnchorPane pane=loader.load();

            Scene scene=new Scene(pane);
            scene.getStylesheets().addAll(Main.class.getResource("application.css").toExternalForm());
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
