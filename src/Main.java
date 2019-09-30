import core.game_engine.GameManager;
import core.game_engine.GameObject;
import processing.core.PApplet;
public class Main extends PApplet {
    private int WIDTH = 600, HEIGHT = 400;
    private GameManager game_manager;
    GameObject gameObject;
    public void settings(){
        size(WIDTH, HEIGHT);
    }
    public void setup(){
        background(0);
        game_manager = new GameManager(this);
        gameObject = new GameObject(this);
        gameObject.position.x = 0;
        gameObject.position.y = 100;
        game_manager.add_game_object(gameObject);
    }
    public void draw(){
        background(0);
        game_manager.update();
    }
    public static void main(String args[]) {
        //System.out.println("Welcome");
        PApplet.main("Main");
    }
}
