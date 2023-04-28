import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button btbApagar;

    @FXML
    private Button btbNovo;

    @FXML
    private Button btnEditar;

    @FXML
    void onclickApagar(ActionEvent event) {
        System.out.println("Apagado");

    }

    @FXML
    void onclickEditar(ActionEvent event) {
        System.out.println("Editado");

    }

    @FXML
    void tbtNovoOnclick(ActionEvent event) {
        App.changeScreen("details");

    }

}
