package lk.ijse.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLoginController {
    public AnchorPane UserAnchore;
    public JFXTextField NameTxt;
    static String name;

    public void UserLoginOnAction(ActionEvent actionEvent) throws IOException {
        name = NameTxt.getText();
        Parent rootNode = FXMLLoader.load(getClass().getResource("/View/UserMainForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setTitle("Main");
        stage.setFullScreen(true);
        stage.centerOnScreen();
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
        NameTxt.clear();
    }

    public void RegisterBtnOnAction(ActionEvent actionEvent) throws IOException {
        Node node = (Node) FXMLLoader.load(getClass().getResource("/View/RegisterForm.fxml"));
        UserAnchore.getChildren().clear();
        UserAnchore.getChildren().setAll(node);
    }
}
