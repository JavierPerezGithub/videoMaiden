package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class SampleController implements Initializable{
	@FXML
    private MediaView mediaView;

    /**
     * @see javafx.fxml.Initializable(URL location, ResourceBundle resources)
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Media media2= new Media(getClass().getResource("/media/1.mp4").toExternalForm());
        MediaPlayer player=new MediaPlayer(media2);
        mediaView.setMediaPlayer(player);
        player.setVolume(100);
        player.play();
}
}
