package main;

import object.*;

public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new OBJ_Angel();
        gp.obj[0].worldX = (24 * gp.tileSize) - (3*gp.scale);
        gp.obj[0].worldY = (21 * gp.tileSize) - (20*gp.scale);

        gp.obj[1] = new OBJ_A();
        gp.obj[1].worldX = (23 * gp.tileSize) + (1*gp.scale);
        gp.obj[1].worldY = 23 * gp.tileSize;

        gp.obj[2] = new OBJ_RPX3();
        gp.obj[2].worldX = 24 * gp.tileSize;
        gp.obj[2].worldY = 11 * gp.tileSize;

        gp.obj[3] = new OBJ_RPX3();
        gp.obj[3].worldX = 45 * gp.tileSize;
        gp.obj[3].worldY = 22 * gp.tileSize;

        gp.obj[4] = new OBJ_RPX3();
        gp.obj[4].worldX = 4 * gp.tileSize;
        gp.obj[4].worldY = 22 * gp.tileSize;
        
        gp.obj[5] = new OBJ_RPB();
        gp.obj[5].worldX = (24 * gp.tileSize) + (18*gp.scale);
        gp.obj[5].worldY = 42 * gp.tileSize;

        gp.obj[6] = new OBJ_SCV();
        gp.obj[6].worldX = 9 * gp.tileSize;
        gp.obj[6].worldY = 5 * gp.tileSize;

        gp.obj[7] = new OBJ_T3L();
        gp.obj[7].worldX = 6 * gp.tileSize;
        gp.obj[7].worldY = (5 * gp.tileSize) - (10*gp.scale);

        gp.obj[8] = new OBJ_T3U();
        gp.obj[8].worldX = 6 * gp.tileSize;
        gp.obj[8].worldY = (2 * gp.tileSize) + (11*gp.scale);

        gp.obj[9] = new OBJ_W8();
        gp.obj[9].worldX = 3 * gp.tileSize;
        gp.obj[9].worldY = 22 * gp.tileSize;

        gp.obj[10] = new OBJ_W8();
        gp.obj[10].worldX = 3 * gp.tileSize;
        gp.obj[10].worldY = 23 * gp.tileSize;

        gp.obj[11] = new OBJ_W8();
        gp.obj[11].worldX = 3 * gp.tileSize;
        gp.obj[11].worldY = 24 * gp.tileSize;
        
        gp.obj[12] = new OBJ_W8();
        gp.obj[12].worldX = 3 * gp.tileSize;
        gp.obj[12].worldY = 25 * gp.tileSize;

        gp.obj[13] = new OBJ_W8();
        gp.obj[13].worldX = 3 * gp.tileSize;
        gp.obj[13].worldY = 26 * gp.tileSize;

        gp.obj[14] = new OBJ_W8();
        gp.obj[14].worldX = 3 * gp.tileSize;
        gp.obj[14].worldY = 27 * gp.tileSize;

        gp.obj[15] = new OBJ_W8();
        gp.obj[15].worldX = 3 * gp.tileSize;
        gp.obj[15].worldY = 28 * gp.tileSize;

        gp.obj[16] = new OBJ_W0();
        gp.obj[16].worldX = 3 * gp.tileSize;
        gp.obj[16].worldY = 21 * gp.tileSize;

        gp.obj[17] = new OBJ_W8();
        gp.obj[17].worldX = 3 * gp.tileSize;
        gp.obj[17].worldY = 17 * gp.tileSize;

        gp.obj[18] = new OBJ_W8();
        gp.obj[18].worldX = 3 * gp.tileSize;
        gp.obj[18].worldY = 16 * gp.tileSize;

        gp.obj[19] = new OBJ_W8();
        gp.obj[19].worldX = 3 * gp.tileSize;
        gp.obj[19].worldY = 15 * gp.tileSize;

    }
}
