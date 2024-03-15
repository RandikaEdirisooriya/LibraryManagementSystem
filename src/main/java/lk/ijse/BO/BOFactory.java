package lk.ijse.BO;

import lk.ijse.BO.Custom.Impl.BookBOImpl;
import lk.ijse.BO.Custom.Impl.BorrowBOImpl;
import lk.ijse.BO.Custom.Impl.UserBOImpl;


public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){
    }
    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory=new BOFactory() : boFactory;
    }

    public enum BOTypes{
        BOOK,USER,BORROW
    }

    //Object creation logic for BO objects
    public SuperBO getBO(BOTypes types){
        switch (types){
            case BOOK:
                return new BookBOImpl();
            case USER:
                return new UserBOImpl();
            case BORROW:
                return new BorrowBOImpl();
            default:
                return null;
        }
    }

}
