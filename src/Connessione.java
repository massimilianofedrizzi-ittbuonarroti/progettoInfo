import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connessione {
    Connection connessione;

    public Connessione(){
        this.connessione = null;
    }

    public void connetti(){
        try{
            String jdbcURL = "jdbc:mysql://localhost:3306/prato_fiorito";
            String username = "root";
            String password = "";
            connessione = DriverManager.getConnection(jdbcURL, username, password);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void disconnetti(){
        try{
            connessione.close();
        }catch (SQLException ex){
            Logger.getLogger(Connessione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void registraNickname(String nickname){
        try {
            Statement stat = connessione.createStatement();
            String result = "INSERT INTO punteggi(nickname, punteggi) VALUES('"+nickname+"','"+0+"')";
        } catch (SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
    public void createList(){

    }
}
