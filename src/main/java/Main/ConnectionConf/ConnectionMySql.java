package Main.ConnectionConf;

public class ConnectionMySql implements ConnectionInterface {
    private final String host;
    private final String port;
    private final String user;
    private final String password;

    public ConnectionMySql() {
        this.host = "localhost";
        this.port = "3306";
        this.user = "admin";
        this.password = "1234";
    }

    @Override
    public void connect() {
        //JDBC code for connected
        System.out.println("Connecte to MySqlDB");
    }

    @Override
    public void disconnect() {
        //JDBC code for disconnected
        System.out.println("Disconnect to MySqlDB");
    }
}
