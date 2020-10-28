package ConnectUtil;

import java.awt.*;
import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectToDB extends Component {
    public static Connection getConnect() {
        try {
            BufferedReader br = null;
            String[] signIn = new String[3];
            try {
                br = new BufferedReader(new FileReader("lib\\ConnectToDB.txt"));
                String textInALine;
                int i = 0;
                try {
                    while ((textInALine = br.readLine()) != null) {
                        String info = textInALine.substring(textInALine.indexOf(':') + 1);
                        signIn[i++] = info;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            Connection bridge = DriverManager.getConnection(signIn[0], signIn[1], signIn[2]);
            System.out.println("Connected Successfully");
            return bridge;
        } catch (SQLException throwables) {
            System.out.println("Can't connect to this schema");
            return null;
        }
    }
}
