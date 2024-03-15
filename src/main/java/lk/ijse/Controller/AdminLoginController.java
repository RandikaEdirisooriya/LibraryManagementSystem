package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginController {
    public void loginBtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(getClass().getResource("/View/main.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setTitle("Main");
        stage.setFullScreen(true);
        stage.centerOnScreen();
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }
}
