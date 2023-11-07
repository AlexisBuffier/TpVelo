package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class VeloVilleController {
	
	
	private ImageView veloVille;
	private Text textIntro, textClassique, textCustom, textPerso, textPrix;
	private Text textColorisBrillant, textColorisMat, textColoris2;
	private ColorPicker couleurClassique;
	private TextField fieldPerso, fieldPrix;
	
	@FXML
    private RadioButton btnOui, btnNon;

	@FXML
    private ToggleGroup OuiNon;
    
    private Button btnRed, btnBlue, btnGreen, btnYellow, btnBlack, btnPink;
    

    public void initialize()
    {
    	//fieldPrix.setText(Velo.getPrix().toString());
    }
    
    @FXML
    public void onClickRed(ActionEvent event) throws IOException {
        File file = new File("velo-ville-rouge.jpg");
        Image veloRouge = new Image(file.toURI().toString());
        veloVille.setImage(veloRouge);
    }
	
	
}