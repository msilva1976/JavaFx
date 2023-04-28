import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static Stage stage;
    private static Scene mainScene;
    private static Scene detailScene;
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        
        primaryStage.setTitle("Veiculos");   
        FXMLLoader fxmlmain = new FXMLLoader(getClass().getResource("view/main_screen.fxml"));
        Parent rootmain = fxmlmain.load();
        mainScene = new Scene(rootmain);     
        
        primaryStage.setScene(mainScene);
        primaryStage.show();   

        FXMLLoader fxmlDetails = new FXMLLoader(getClass().getResource("view/details_screen.fxml"));
        Parent rootDetails = fxmlDetails.load();
        detailScene = new Scene(rootDetails);  

           
    }
    public static void changeScreen(String scr) {
        switch (scr) {
            case "main":            
                stage.setScene(mainScene);
                break;
            case "details":
                stage.setScene(detailScene);
            
        }
    }
    //---------------------------
    public static interface OnChargeScreen {
        void OnScreenCharged(String newScreen, Object userData  );
        
    }
    public static void addChargeScreenListener(OnChargeScreen newListener) {
        listeners.add(newListener);

        
    }

    

}
