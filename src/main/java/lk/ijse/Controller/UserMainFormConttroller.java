package lk.ijse.Controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class UserMainFormConttroller {
    public AnchorPane CommonAnchore;
    public Label datelbl;
    public Label timelbl;
    @FXML
    public void initialize() throws SQLException, ClassNotFoundException, IOException {
        Node node = (Node) FXMLLoader.load(getClass().getResource("/View/Dashboard.fxml"));
        CommonAnchore.getChildren().clear();
        CommonAnchore.getChildren().setAll(node);
        loadDateAndTime();
    }

    private void loadDateAndTime() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        datelbl.setText(format.format(date));

        Timeline time = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();
            timelbl.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        }), new KeyFrame(Duration.seconds(1)));

        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }

    public void DashboardBtnOnAction(ActionEvent actionEvent) throws IOException {
        Node node = (Node) FXMLLoader.load(getClass().getResource("/View/Dashboard.fxml"));
        CommonAnchore.getChildren().clear();
        CommonAnchore.getChildren().setAll(node);
    }


    public void UserBooksBtnOnAction(ActionEvent actionEvent) throws IOException {
        Node node = (Node) FXMLLoader.load(getClass().getResource("/View/UserBookForm.fxml"));
        CommonAnchore.getChildren().clear();
        CommonAnchore.getChildren().setAll(node);
    }

    public void UserBarrowingBtnOnAction(ActionEvent actionEvent) throws IOException {
        Node node = (Node) FXMLLoader.load(getClass().getResource("/View/UserBorrowForm.fxml"));
        CommonAnchore.getChildren().clear();
        CommonAnchore.getChildren().setAll(node);
    }
}
