package Main.ConnectionConf;

public class ConnectionPostgres implements ConnectionInterface {
    private final String host;
    private final String port;
    private final String user;
    private final String password;

    public ConnectionPostgres() {
        this.host = "localhost";
        this.port = "5432";
        this.user = "admin";
        this.password = "1234";
    }

    @Override
    public void connect() {
        System.out.println("Connected to PostgresDB");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected to PostgresDB");
    }
}
