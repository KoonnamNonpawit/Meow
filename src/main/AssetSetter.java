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

        gp.obj[20] = new OBJ_W15();
        gp.obj[20].worldX = (3 * gp.tileSize) - (2*gp.scale);
        gp.obj[20].worldY = 13 * gp.tileSize;

        gp.obj[21] = new OBJ_W23();
        gp.obj[21].worldX = (3 * gp.tileSize) - (2*gp.scale);
        gp.obj[21].worldY = 14 * gp.tileSize;

        gp.obj[22] = new OBJ_Paper();
        gp.obj[22].worldX = (9 * gp.tileSize) + (8*gp.scale);
        gp.obj[22].worldY = (6 * gp.tileSize) - (14*gp.scale);
        gp.obj[22].solidArea.x = 0;
        gp.obj[22].solidArea.y = 0;
        gp.obj[22].solidArea.width = (32 * gp.scale);
        gp.obj[22].solidArea.height = (57 * gp.scale);
        gp.obj[22].solidAreaDefaultX = gp.obj[22].solidArea.x;
        gp.obj[22].solidAreaDefaultY = gp.obj[22].solidArea.y;

        gp.obj[23] = new OBJ_W15();
        gp.obj[23].worldX = (3 * gp.tileSize); 
        gp.obj[23].worldY = 18 * gp.tileSize;
        gp.obj[24] = new OBJ_W23();
        gp.obj[24].worldX = (3 * gp.tileSize);
        gp.obj[24].worldY = 19 * gp.tileSize;

        gp.obj[25] = new OBJ_W15();
        gp.obj[25].worldX = (4 * gp.tileSize)- (2*gp.scale);
        gp.obj[25].worldY = 19 * gp.tileSize;
        gp.obj[26] = new OBJ_W23();
        gp.obj[26].worldX = (4 * gp.tileSize)- (2*gp.scale); 
        gp.obj[26].worldY = 20 * gp.tileSize;

        gp.obj[27] = new OBJ_W15();
        gp.obj[27].worldX = (5 * gp.tileSize) - (2*gp.scale);
        gp.obj[27].worldY = 21 * gp.tileSize;
        gp.obj[28] = new OBJ_W23();
        gp.obj[28].worldX = (5 * gp.tileSize) - (2*gp.scale);
        gp.obj[28].worldY = 22 * gp.tileSize;

        gp.obj[29] = new OBJ_W15();
        gp.obj[29].worldX = (6 * gp.tileSize) - (2*gp.scale);
        gp.obj[29].worldY = 26 * gp.tileSize;
        gp.obj[30] = new OBJ_W23();
        gp.obj[30].worldX = (6 * gp.tileSize) - (2*gp.scale);
        gp.obj[30].worldY = 27 * gp.tileSize;

        gp.obj[31] = new OBJ_W15();
        gp.obj[31].worldX = (7 * gp.tileSize) - (4*gp.scale);
        gp.obj[31].worldY = 34 * gp.tileSize;
        gp.obj[32] = new OBJ_W23();
        gp.obj[32].worldX = (7 * gp.tileSize) - (4*gp.scale);
        gp.obj[32].worldY = 35 * gp.tileSize;

        gp.obj[33] = new OBJ_W15();
        gp.obj[33].worldX = (38 * gp.tileSize) - (2*gp.scale);
        gp.obj[33].worldY = 33 * gp.tileSize;
        gp.obj[34] = new OBJ_W23();
        gp.obj[34].worldX = (38 * gp.tileSize) - (2*gp.scale);
        gp.obj[34].worldY = 34 * gp.tileSize;

        gp.obj[35] = new OBJ_W15();
        gp.obj[35].worldX = (34 * gp.tileSize) - (2*gp.scale);
        gp.obj[35].worldY = 10 * gp.tileSize;
        gp.obj[36] = new OBJ_W23();
        gp.obj[36].worldX = (34 * gp.tileSize) - (2*gp.scale);
        gp.obj[36].worldY = 11 * gp.tileSize;

        gp.obj[37] = new OBJ_W15();
        gp.obj[37].worldX = (31 * gp.tileSize) - (2*gp.scale);
        gp.obj[37].worldY = 19 * gp.tileSize;
        gp.obj[38] = new OBJ_W23();
        gp.obj[38].worldX = (31 * gp.tileSize) - (2*gp.scale);
        gp.obj[38].worldY = 20 * gp.tileSize;

        gp.obj[39] = new OBJ_W15();
        gp.obj[39].worldX = (6 * gp.tileSize) - (2*gp.scale);
        gp.obj[39].worldY = 8 * gp.tileSize;
        gp.obj[40] = new OBJ_W23();
        gp.obj[40].worldX = (6 * gp.tileSize) - (2*gp.scale);
        gp.obj[40].worldY = 9 * gp.tileSize;

        gp.obj[41] = new OBJ_W15();
        gp.obj[41].worldX = (16 * gp.tileSize) - (2*gp.scale);
        gp.obj[41].worldY = 30 * gp.tileSize;
        gp.obj[42] = new OBJ_W23();
        gp.obj[42].worldX = (16 * gp.tileSize) - (2*gp.scale);
        gp.obj[42].worldY = 31 * gp.tileSize;

        gp.obj[43] = new OBJ_W15();
        gp.obj[43].worldX = (7 * gp.tileSize); 
        gp.obj[43].worldY = 40 * gp.tileSize;
        gp.obj[44] = new OBJ_W23();
        gp.obj[44].worldX = (7 * gp.tileSize);
        gp.obj[44].worldY = 41 * gp.tileSize;

        gp.obj[45] = new OBJ_W15();
        gp.obj[45].worldX = (8 * gp.tileSize)- (2*gp.scale);
        gp.obj[45].worldY = 41 * gp.tileSize;
        gp.obj[46] = new OBJ_W23();
        gp.obj[46].worldX = (8 * gp.tileSize)- (2*gp.scale);
        gp.obj[46].worldY = 42 * gp.tileSize;

        gp.obj[47] = new OBJ_W15();
        gp.obj[47].worldX = (18 * gp.tileSize); 
        gp.obj[47].worldY = 46 * gp.tileSize;
        gp.obj[48] = new OBJ_W23();
        gp.obj[48].worldX = (18 * gp.tileSize);
        gp.obj[48].worldY = 47 * gp.tileSize;

        gp.obj[49] = new OBJ_W15();
        gp.obj[49].worldX = (3 * gp.tileSize); 
        gp.obj[49].worldY = 29 * gp.tileSize;
        gp.obj[50] = new OBJ_W23();
        gp.obj[50].worldX = (3 * gp.tileSize);
        gp.obj[50].worldY = 30 * gp.tileSize;

        gp.obj[51] = new OBJ_W15();
        gp.obj[51].worldX = (4 * gp.tileSize)- (2*gp.scale); 
        gp.obj[51].worldY = 30 * gp.tileSize;
        gp.obj[52] = new OBJ_W23();
        gp.obj[52].worldX = (4 * gp.tileSize)- (2*gp.scale);
        gp.obj[52].worldY = 31 * gp.tileSize;

        gp.obj[53] = new OBJ_W15();
        gp.obj[53].worldX = (5 * gp.tileSize); 
        gp.obj[53].worldY = 32 * gp.tileSize;
        gp.obj[54] = new OBJ_W23();
        gp.obj[54].worldX = (5 * gp.tileSize);
        gp.obj[54].worldY = 33 * gp.tileSize;

        gp.obj[55] = new OBJ_W15();
        gp.obj[55].worldX = (6 * gp.tileSize)- (2*gp.scale); 
        gp.obj[55].worldY = 33 * gp.tileSize;
        gp.obj[56] = new OBJ_W23();
        gp.obj[56].worldX = (6 * gp.tileSize)- (2*gp.scale);
        gp.obj[56].worldY = 34 * gp.tileSize;

        // gp.obj[57] = new OBJ_W17();
        // gp.obj[57].worldX = (42 * gp.tileSize); 
        // gp.obj[57].worldY = 40 * gp.tileSize;
        // gp.obj[58] = new OBJ_W25();
        // gp.obj[58].worldX = (42 * gp.tileSize);
        // gp.obj[58].worldY = 41 * gp.tileSize;

        // gp.obj[59] = new OBJ_W17();
        // gp.obj[59].worldX = (45 * gp.tileSize); 
        // gp.obj[59].worldY = 31 * gp.tileSize;
        // gp.obj[60] = new OBJ_W25();
        // gp.obj[60].worldX = (45 * gp.tileSize);
        // gp.obj[60].worldY = 32 * gp.tileSize;

        // gp.obj[61] = new OBJ_W17();
        // gp.obj[61].worldX = (41 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[61].worldY = 41 * gp.tileSize;
        // gp.obj[62] = new OBJ_W25();
        // gp.obj[62].worldX = (41 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[62].worldY = 42 * gp.tileSize;

        // gp.obj[63] = new OBJ_W17();
        // gp.obj[63].worldX = (31 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[63].worldY = 46 * gp.tileSize;
        // gp.obj[64] = new OBJ_W25();
        // gp.obj[64].worldX = (31 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[64].worldY = 47 * gp.tileSize;

        // gp.obj[65] = new OBJ_W17();
        // gp.obj[65].worldX = (43 * gp.tileSize)+ (4*gp.scale); 
        // gp.obj[65].worldY = 33 * gp.tileSize;
        // gp.obj[66] = new OBJ_W25();
        // gp.obj[66].worldX = (43 * gp.tileSize)+ (4*gp.scale);
        // gp.obj[66].worldY = 34 * gp.tileSize;

        // gp.obj[67] = new OBJ_W17();
        // gp.obj[67].worldX = (42 * gp.tileSize)+ (6*gp.scale); 
        // gp.obj[67].worldY = 34 * gp.tileSize;
        // gp.obj[68] = new OBJ_W25();
        // gp.obj[68].worldX = (42 * gp.tileSize)+ (6*gp.scale);
        // gp.obj[68].worldY = 35 * gp.tileSize;

        // gp.obj[69] = new OBJ_W17();
        // gp.obj[69].worldX = (40 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[69].worldY = 33 * gp.tileSize;
        // gp.obj[70] = new OBJ_W25();
        // gp.obj[70].worldX = (40 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[70].worldY = 34 * gp.tileSize;

        // gp.obj[71] = new OBJ_W17();
        // gp.obj[71].worldX = (46 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[71].worldY = 12 * gp.tileSize;
        // gp.obj[72] = new OBJ_W25();
        // gp.obj[72].worldX = (46 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[72].worldY = 13 * gp.tileSize;

        // gp.obj[73] = new OBJ_W17();
        // gp.obj[73].worldX = (46 * gp.tileSize); 
        // gp.obj[73].worldY = 18 * gp.tileSize;
        // gp.obj[74] = new OBJ_W25();
        // gp.obj[74].worldX = (46 * gp.tileSize);
        // gp.obj[74].worldY = 19 * gp.tileSize;

        // gp.obj[75] = new OBJ_W17();
        // gp.obj[75].worldX = (45 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[75].worldY = 19 * gp.tileSize;
        // gp.obj[76] = new OBJ_W25();
        // gp.obj[76].worldX = (45 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[76].worldY = 20 * gp.tileSize;

        // gp.obj[77] = new OBJ_W17();
        // gp.obj[77].worldX = (35 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[77].worldY = 18 * gp.tileSize;
        // gp.obj[78] = new OBJ_W25();
        // gp.obj[78].worldX = (35 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[78].worldY = 19 * gp.tileSize;

        // gp.obj[79] = new OBJ_W17();
        // gp.obj[79].worldX = (32 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[79].worldY = 19 * gp.tileSize;
        // gp.obj[80] = new OBJ_W25();
        // gp.obj[80].worldX = (32 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[80].worldY = 20 * gp.tileSize;

        // gp.obj[81] = new OBJ_W17();
        // gp.obj[81].worldX = (26 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[81].worldY = 19 * gp.tileSize;
        // gp.obj[82] = new OBJ_W25();
        // gp.obj[82].worldX = (26 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[82].worldY = 20 * gp.tileSize;

        // gp.obj[83] = new OBJ_W17();
        // gp.obj[83].worldX = (11 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[83].worldY = 8 * gp.tileSize;
        // gp.obj[84] = new OBJ_W25();
        // gp.obj[84].worldX = (11 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[84].worldY = 9 * gp.tileSize;

        // gp.obj[85] = new OBJ_W17();
        // gp.obj[85].worldX = (12 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[85].worldY = 12 * gp.tileSize;
        // gp.obj[86] = new OBJ_W25();
        // gp.obj[86].worldX = (12 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[86].worldY = 13 * gp.tileSize;

        // gp.obj[87] = new OBJ_W17();
        // gp.obj[87].worldX = (8 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[87].worldY = 13 * gp.tileSize;
        // gp.obj[88] = new OBJ_W25();
        // gp.obj[88].worldX = (8 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[88].worldY = 14 * gp.tileSize;

        // gp.obj[89] = new OBJ_W17();
        // gp.obj[89].worldX = (44 * gp.tileSize)+ (2*gp.scale); 
        // gp.obj[89].worldY = 32 * gp.tileSize;
        // gp.obj[90] = new OBJ_W25();
        // gp.obj[90].worldX = (44 * gp.tileSize)+ (2*gp.scale);
        // gp.obj[90].worldY = 33 * gp.tileSize;
    }
}
