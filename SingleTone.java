//🖥️ Code Snippet: Singleton Design Pattern in Java 🚀

package Singletone.singeltone;

public class DatabaseConnection {
    static DatabaseConnection databaseConnection = null;
    private DatabaseConnection(){
        // Private constructor to prevent external instantiation
    }
    public static DatabaseConnection getInstance(){
        if(databaseConnection == null)
            synchronized (DatabaseConnection.class){ // to handel the code in multithreaded environment 
            if (databaseConnection == null) {
                databaseConnection = new DatabaseConnection();
            }
        }
        return databaseConnection;
//the code will always return the same instance of database Connection
    }
}
