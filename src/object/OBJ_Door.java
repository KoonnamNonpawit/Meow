package object;


import entity.Entity;
import main.GamePanel;

public class OBJ_Door extends Entity{
    static GamePanel gp;
    public OBJ_Door() {
        super(gp);
        name = "Door";
        down1 = setup("res/props/PropsWG");
      
        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 37*3;
        solidArea.height = 50*3;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        collision = true;
    }
}
