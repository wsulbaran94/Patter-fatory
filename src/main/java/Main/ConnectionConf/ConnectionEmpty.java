package Main.ConnectionConf;

public class ConnectionEmpty implements ConnectionInterface{
    @Override
    public void connect() {
        System.out.println("Driver not provide");
    }

    @Override
    public void disconnect() {
        System.out.println("Driver not provide");

    }
}
