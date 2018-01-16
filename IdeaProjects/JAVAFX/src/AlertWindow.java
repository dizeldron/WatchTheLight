import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertWindow {
    public static void display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMaxWidth(350);
        window.setMaxHeight(200);

        Label label = new Label(message);
        label.setFont(Font.font(20));

        Button closeButton = new Button(" CloseButton ");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }
}
