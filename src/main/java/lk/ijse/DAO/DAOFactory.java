package lk.ijse.DAO;

import lk.ijse.DAO.Custom.Impl.BookDaoImpl;
import lk.ijse.DAO.Custom.Impl.BorrowDaoImpl;
import lk.ijse.DAO.Custom.Impl.ReturnDaoImpl;
import lk.ijse.DAO.Custom.Impl.UserDaoImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        BOOK,USER,BORROW,RETURN
    }

    public SuperDao getDAO(DAOTypes types){
        switch (types) {
            case BOOK:
                return new BookDaoImpl();
                case BORROW:
                return new BorrowDaoImpl();
            case USER:
                return new UserDaoImpl();
                case RETURN:
                return new ReturnDaoImpl();
            default:
                return null;
        }
    }
}
