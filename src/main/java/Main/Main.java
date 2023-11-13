package Main;

import Main.ConnectionConf.ConnectionInterface;

public class Main {
    public static void main (String [] args) {
        // Instances the factory and call the connection, put the driver for the configuration to db
        FactoryConnection connF = new FactoryConnection();
        ConnectionInterface conn = connF.getConnection("MYSQL");

        conn.connect();
        conn.disconnect();
    }
}
