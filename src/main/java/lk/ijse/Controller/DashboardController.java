package lk.ijse.Controller;

import javafx.scene.control.Label;
import lk.ijse.BO.BOFactory;
import lk.ijse.BO.Custom.BookBO;

import java.io.IOException;
import java.sql.SQLException;

public class DashboardController {
    public Label BookCount;
    public Label UserCount;
    public Label NameLabel;
    String name;
    public void initialize() throws SQLException, ClassNotFoundException, IOException {
        name=UserLoginController.name;
        NameLabel.setText(name);
        setCount();}
    BookBO bookBO= (BookBO) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.BOOK);
    private void setCount() {
       BookCount.setText(String.valueOf(bookBO.getBookCount()));
    }

}
