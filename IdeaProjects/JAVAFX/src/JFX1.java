import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class JFX1 extends Application{
        Button button;

        public static void main(String[] args) {
            launch(args);
        }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First FX lesson");
        button = new Button("I'm a button, press me!!!");
        button.setOnAction(e-> {System.out.println("I'm done with leambda!!!!");
            System.out.println("no, it's me!!!");});
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    }

