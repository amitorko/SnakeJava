import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Rectangle> body;
    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimension;

    private String move;

    public Snake(){
        body = new ArrayList<>();
        Rectangle temp = new Rectangle(d,d);
        temp.setLocation(w /2 * d, h/2 * d);
        body.add(temp);

        temp=new Rectangle(d,d);
        temp.setLocation((w/2 -1)*d, (h/2-1)*d);
        body.add(temp);

        temp=new Rectangle(d,d);
        temp.setLocation((w/2 -2)*d, (h/2-2)*d);
        body.add(temp);

        move="NOTHING";
    }
    public ArrayList<Rectangle> getBody(){
        return body;
    }
    public void setBody(ArrayList<Rectangle> body){
        this.body=body;
    }
    public void up(){
        move="UP";
    }
    public void down(){
        move="DOWN";
    }
    public void left(){
        move="LEFT";
    }
    public void right(){
        move="RIGHT";
    }
}

