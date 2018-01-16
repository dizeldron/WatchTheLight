import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JFX4_7 extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Lesson 7 - Program exit" );

        window.setOnCloseRequest(e->
        {
            e.consume();
            closeProgram();
        });

        button = new Button("Close");
        button.setPrefSize(120,60);

        button.setOnAction(e-> closeProgram());
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout,400, 300);
        window.setScene(scene);
        window.show();
    }
    private void closeProgram(){
        Boolean answer = ConfirmWindow.display("Warning!!!", "Do you really want to exit?");
        if(answer) {
            window.close();
            System.out.println("The Galaxy is saved!");
        }
    }
}
