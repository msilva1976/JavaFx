import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Veiculo;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    private static Stage stage;
    private static Scene mainScene;
    private static Scene detailScene;
    
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Veiculo v = new Veiculo(60, "fusion", "Ford");
        System.out.println(v);
        System.exit(0);


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
    public static void changeScreen(String scr, Object userData) {
        switch (scr) {
            case "main":            
                stage.setScene(mainScene);
                notifyAllListeners("main", userData);
                break;
            case "details":
                stage.setScene(detailScene);
                notifyAllListeners("details", userData);
        }
    }
    public static void changeScreen(String scr){
        changeScreen(scr,null);
    }
    //---------------------------

    private static ArrayList<OnChargeScreen>listeners = new ArrayList<>();

    public static interface OnChargeScreen {
        void OnScreenCharged(String newScreen, Object userData  );
        
    }
    public static void addChargeScreenListener(OnChargeScreen newListener) {
       listeners.add(newListener);

        
    }
    private static void notifyAllListeners(String newScreen, Object userdata){
        for (OnChargeScreen l: listeners) 
            l.OnScreenCharged(newScreen, userdata);
        
    }

    

}
