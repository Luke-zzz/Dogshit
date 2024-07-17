import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.text.Font;


public class TitleHello extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(500);
        primaryStage.setHeight(150);
        primaryStage.setTitle("Hello World! ");
        Label label=new Label("Hello World!");
        label.setFont(new Font(30));
        primaryStage.setScene(new Scene(label));

        primaryStage.show();
    }
}
