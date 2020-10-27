import View.DictionaryView;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new DictionaryView().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(DictionaryView.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
