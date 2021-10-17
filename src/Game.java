import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements KeyListener {
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
    public boolean check_wall_collision(){
        if(player.getX()<0 || player.getX()>=width * dimension || player.getY()<0
                || player.getY() > height * dimension){
            return true;
        }return false;
    }
    private boolean check_food_collision() {
        if(player.getX() == food.getX() * dimension && player.getY() == food.getY() * dimension) {
            return true;
        }
        return false;
    }

    private boolean check_self_collision() {
        for(int i = 1; i < player.getBody().size(); i++) {
            if(player.getX() == player.getBody().get(i).x &&
                    player.getY() == player.getBody().get(i).y) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode =e.getKeyCode();
        if(keyCode == KeyEvent.VK_W && player.getMove() != "DOWN"){
            player.up();
        }
        else if(keyCode == KeyEvent.VK_S && player.getMove() != "UP"){
            player.down();
        }
        else if(keyCode == KeyEvent.VK_A && player.getMove() != "RIGHT"){
            player.left();
        }
        else if(keyCode == KeyEvent.VK_D && player.getMove() != "LEFT"){
            player.right();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public Snake getPlayer(){
        return player;
    }
    public void setPlayer(Snake player){
        this.player =player;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
}
