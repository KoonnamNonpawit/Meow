package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_SBS extends Entity{
    static GamePanel gp;
    public OBJ_SBS() {
        super(gp);
        name = "SBS";
        down1 = setup("res/props/PropsSBS");
      
    }
}