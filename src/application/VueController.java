package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VueController {
	
	@FXML
	public ImageView veloVille;
	@FXML
	public ImageView veloCourse;
	
	
	public void onClickVeloVille(MouseEvent e) throws IOException
	{
		Velo veloVille = new Velo("CANYON", "velo-ville.jpg", 300);
		
		Parent vueVeloVille = FXMLLoader.load(getClass().getResource("vueVeloVille.fxml"));
		Scene sceneVeloVille = new Scene(vueVeloVille);
		sceneVeloVille.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		stage.setScene(sceneVeloVille);
		stage.show();
	}
	
	public void onClickVeloCourse(MouseEvent e) throws IOException
	{
		Velo veloCourse = new Velo("CANYON", "velo-course.jpg", 300);
		
		Parent vueVeloCourse = FXMLLoader.load(getClass().getResource("vueVeloCourse.fxml"));
		Scene sceneVeloCourse = new Scene(vueVeloCourse);
		sceneVeloCourse.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		stage.setScene(sceneVeloCourse);
		stage.show();
	}
	
	
}
