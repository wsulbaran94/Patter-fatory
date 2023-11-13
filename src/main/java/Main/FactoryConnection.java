package Main;

import Main.ConnectionConf.ConnectionEmpty;
import Main.ConnectionConf.ConnectionInterface;
import Main.ConnectionConf.ConnectionMySql;
import Main.ConnectionConf.ConnectionPostgres;

public class FactoryConnection {

    public ConnectionInterface getConnection (String driver) {
        if(driver.equalsIgnoreCase("MYSQL")) {
            return new ConnectionMySql();
        }

        if(driver.equalsIgnoreCase("POSTGRES")) {
            return new ConnectionPostgres();
        }

        return new ConnectionEmpty();
    }
}
