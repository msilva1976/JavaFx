

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


 

public class LoginControler {

    @FXML
    private Button btnEnter;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUser;

    @FXML
    void onclickEnter(ActionEvent event) {
        String usuario = txtUser.getText();
        String senha = txtPassword.getText();
        if (usuario.equals("Msilva") && senha.equals("411314")) {
            System.out.println("guaranteed access");
        } else {
            System.out.println("access denied");            
        }


    }

}

    

