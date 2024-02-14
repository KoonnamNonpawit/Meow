package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_ST7 extends Entity{
    static GamePanel gp;
    public OBJ_ST7() {
        super(gp);
        name = "ST7";
        down1 = setup("res/props/PropsST7");
        
    }
}