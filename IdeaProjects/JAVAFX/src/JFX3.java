import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;

public class JFX3 extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Lesson 5" );

        button = new Button("Press me");
        button.setPrefSize(120,60);
        button.setOnAction(e ->
        {
            boolean result = ConfirmWindow.display("Confirm Window","Did you wash the monkeys!?!?!");
            System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);

        Scene scene = new Scene(layout,400, 300);
        window.setScene(scene);
        window.show();
    }
}
