import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmWindow {

    static boolean answer;


        public static boolean display(String title, String message){
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle(title);
            window.setMaxWidth(350);
            window.setMaxHeight(200);

            Label label = new Label(message);
            label.setFont(Font.font(20));

            Button yesButton = new Button("Yes");
            Button noButton = new Button("No");

            yesButton.setOnAction(e ->{
                answer = true;
                window.close();
            });

            noButton.setOnAction(e ->{
                answer = false;
                window.close();
            });


            VBox layout = new VBox(20);
            layout.getChildren().addAll(label, yesButton, noButton);
            layout.setAlignment(Pos.CENTER);
            Scene scene = new Scene(layout,400,300);
            window.setScene(scene);
            window.showAndWait();

            return answer;
        }
    }


