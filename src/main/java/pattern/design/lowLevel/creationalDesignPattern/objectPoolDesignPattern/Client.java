package pattern.design.lowLevel.creationalDesignPattern.objectPoolDesignPattern;

public class Client {

    DBConnectionPoolManager manager = DBConnectionPoolManager.getInstance();

    DBConnection dbConnection1 = manager.getDBConnection();
    DBConnection dbConnection2 = manager.getDBConnection();
    DBConnection dbConnection3 = manager.getDBConnection();
    DBConnection dbConnection4 = manager.getDBConnection();
    DBConnection dbConnection5 = manager.getDBConnection();
    DBConnection dbConnection6 = manager.getDBConnection();


}
