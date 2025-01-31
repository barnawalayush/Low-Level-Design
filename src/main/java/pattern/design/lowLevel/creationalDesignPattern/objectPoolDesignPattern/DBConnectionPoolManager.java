package pattern.design.lowLevel.creationalDesignPattern.objectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {

    private List<DBConnection> freeConnectionsInPool = new ArrayList<>();
    private List<DBConnection> connectionsCurrentlyInPool = new ArrayList<>();
    private final int INITIAL_POOL_SIZE = 3;
    private final int MAX_POOL_SIZE = 6;
    private static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;

    private DBConnectionPoolManager(){
        for(int i=0; i< INITIAL_POOL_SIZE; i++){
            freeConnectionsInPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance(){
        if(dbConnectionPoolManagerInstance == null){
            synchronized (DBConnectionPoolManager.class){
                if(dbConnectionPoolManagerInstance == null){
                    dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DBConnection getDBConnection(){
        if(freeConnectionsInPool.isEmpty() && connectionsCurrentlyInPool.size() < MAX_POOL_SIZE){
            freeConnectionsInPool.add(new DBConnection());
        }else if(freeConnectionsInPool.isEmpty() && connectionsCurrentlyInPool.size() >= MAX_POOL_SIZE){
            return null;
        }
        DBConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size()-1);
        connectionsCurrentlyInPool.add(dbConnection);
        return dbConnection;
    }

    public void releaseDBConnection(DBConnection dbConnection){
        if(dbConnection != null){
            connectionsCurrentlyInPool.remove(dbConnection);
            freeConnectionsInPool.add(dbConnection);
        }
    }
}
