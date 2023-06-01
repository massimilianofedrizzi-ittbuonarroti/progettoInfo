import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connessione {
    Connection connessione;

    public Connessione() {
        this.connessione = null;
    }

    public void connetti() {
        try {
            String jdbcURL = "jdbc:mysql://localhost:3306/pratofiorito";
            String username = "root";
            String password = "";
            connessione = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void disconnetti() {
        try {
            connessione.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connessione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registraNickname(String nickName, int punteggio){
        try {
            Statement stat = connessione.createStatement();
            String query = "INSERT INTO punteggi(Nickname, Punteggio) VALUES ('" + nickName + "','"+ punteggio+"')";
            stat.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void inserisciPunteggio(String nickname, int punteggio){
        try {
            Statement stat = connessione.createStatement();
            String query = "UPDATE `punteggi` SET `punteggio`='"+punteggio+"' WHERE nickname ='"+nickname+"'";
            stat.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<String> cercaNickname() {
        ResultSet result = null;
        ArrayList<String> a = new ArrayList<>();
        String nickname;
        try {
            Statement stat = connessione.createStatement();
            result= stat.executeQuery("SELECT * FROM `punteggi` ORDER BY punteggio DESC");
            while(result.next()){
                nickname = result.getString("nickname");
                a.add(nickname);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return a;
    }

    public ArrayList<String> cercaPunteggi(){
        ResultSet result = null;
        ArrayList<String> a = new ArrayList<>();
        String punteggi;
        try {
            Statement stat = connessione.createStatement();
            result= stat.executeQuery("SELECT * FROM `punteggi` ORDER BY punteggio DESC ");
            while(result.next()){
                punteggi = result.getString("punteggio");
                a.add(punteggi);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return a;
    }
}