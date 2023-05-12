import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean sotto[][]=new boolean[4][4];
        for(int i = 0; i< 2; i++){
            int j = rand.nextInt(4);
            int v = rand.nextInt(4);
            sotto[j][v] = true;
        }
        primaFinestraGUI finestra = new primaFinestraGUI(sotto);

    }
}