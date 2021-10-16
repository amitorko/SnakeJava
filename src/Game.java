import javax.swing.*;

public class Game {
    private Snake player;
    private Food food;
    private JFrame window;
    public static final int width = 30;
    public static final int height = 30;
    public static final int dimension = 20;
    private Graphics graphics;

    public Game(){
        window= new JFrame();
        window.setTitle("Snake 1000");
        window.setSize(width*dimension, height*dimension);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
