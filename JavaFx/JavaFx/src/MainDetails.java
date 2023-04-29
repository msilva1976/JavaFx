import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class MainDetails {
    @FXML
    protected void initialize(){
        App.addChargeScreenListener(new App.OnChargeScreen() {

            @Override
            public void OnScreenCharged(String newScreen, Object userData) {
                if(newScreen.equals("details"))
               System.out.println("nova tela" +newScreen+","+userData);
            }
            
        });
    }


    @FXML
    private Button btbOk;

    @FXML
    private Button btnCancela;

    @FXML
    private BorderPane controllerVeiculos;

    @FXML
    private Label lblHP;

    @FXML
    private Label lblMarca;

    @FXML
    private Label lblModelo;

    @FXML
    private TextField txtHp;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    void btnOkOnclick(ActionEvent event) {

    }

    @FXML
    void tbtCancelaOnclik(ActionEvent event) {
        App.changeScreen("main");

    }

}
