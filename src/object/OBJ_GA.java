package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_GA extends Entity{
    static GamePanel gp;
    public OBJ_GA() {
        super(gp);
        name = "GA";
        down1 = setup("res/props/PropsGA");
         
    }
}