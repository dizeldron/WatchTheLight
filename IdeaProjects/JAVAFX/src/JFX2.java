import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


    public class JFX2 extends Application{
     Stage window;
     Scene scene1, scene2;


        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            window = primaryStage;
            Label label1 = new Label("You're in the first window!");
            Button button1 = new Button("Portal to the second window");
            button1.setOnAction(e-> window.setScene(scene2));
            VBox layout1 = new VBox(22);
            layout1.getChildren().addAll(label1, button1);
            scene1 = new Scene(layout1,400,300);

            Label label2 = new Label("You're in the second window!");
            Button button2 = new Button("Portal to the first window");
            button2.setOnAction(e-> window.setScene(scene1));
            HBox layout2 = new HBox(20);
            layout2.getChildren().addAll(label2, button2);
            scene2 = new Scene(layout2,400,300);

            window.setScene(scene1);
            window.setTitle("JavaFX");
            window.show();

        }
    }
