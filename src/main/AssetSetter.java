package main;

import object.*;

import entity.*;

public class AssetSetter {

    GamePanel gp;
    Entity entity;
    Player p;
    KeyHandler keyH;
    

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        // p = new Player(gp, keyH);

        gp.obj[0] = new OBJ_Angel();
        gp.obj[0].worldX = (24 * gp.tileSize) - (3 * gp.scale);
        gp.obj[0].worldY = (21 * gp.tileSize) - (20 * gp.scale);

        gp.obj[1] = new OBJ_A();
        gp.obj[1].worldX = (23 * gp.tileSize) + (1 * gp.scale);
        gp.obj[1].worldY = 23 * gp.tileSize;

        gp.obj[2] = new OBJ_W1();
        gp.obj[2].worldX = (24 * gp.tileSize);
        gp.obj[2].worldY = 10 * gp.tileSize;

        gp.obj[3] = new OBJ_RPX3();
        gp.obj[3].worldX = 45 * gp.tileSize;
        gp.obj[3].worldY = 23 * gp.tileSize;

        gp.obj[4] = new OBJ_RPX3();
        gp.obj[4].worldX = 4 * gp.tileSize;
        gp.obj[4].worldY = 22 * gp.tileSize;

        gp.obj[5] = new OBJ_RPB();
        gp.obj[5].worldX = (24 * gp.tileSize) + (18 * gp.scale);
        gp.obj[5].worldY = 42 * gp.tileSize;

        gp.obj[6] = new OBJ_SCV();
        gp.obj[6].worldX = 9 * gp.tileSize;
        gp.obj[6].worldY = 5 * gp.tileSize;

        gp.obj[7] = new OBJ_T3L();
        gp.obj[7].worldX = 6 * gp.tileSize;
        gp.obj[7].worldY = (5 * gp.tileSize) - (10 * gp.scale);

        gp.obj[8] = new OBJ_T3U();
        gp.obj[8].worldX = 6 * gp.tileSize;
        gp.obj[8].worldY = (2 * gp.tileSize) + (11 * gp.scale);

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
        gp.obj[20].worldX = (3 * gp.tileSize) - (2 * gp.scale);
        gp.obj[20].worldY = 13 * gp.tileSize;

        gp.obj[21] = new OBJ_W23();
        gp.obj[21].worldX = (3 * gp.tileSize) - (2 * gp.scale);
        gp.obj[21].worldY = 14 * gp.tileSize;

        gp.obj[22] = new OBJ_Paper();
        gp.obj[22].worldX = (9 * gp.tileSize) + (8 * gp.scale);
        gp.obj[22].worldY = (6 * gp.tileSize) - (14 * gp.scale);
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
        gp.obj[25].worldX = (4 * gp.tileSize) - (2 * gp.scale);
        gp.obj[25].worldY = 19 * gp.tileSize;
        gp.obj[26] = new OBJ_W23();
        gp.obj[26].worldX = (4 * gp.tileSize) - (2 * gp.scale);
        gp.obj[26].worldY = 20 * gp.tileSize;

        gp.obj[27] = new OBJ_W15();
        gp.obj[27].worldX = (5 * gp.tileSize) - (2 * gp.scale);
        gp.obj[27].worldY = 21 * gp.tileSize;
        gp.obj[28] = new OBJ_W23();
        gp.obj[28].worldX = (5 * gp.tileSize) - (2 * gp.scale);
        gp.obj[28].worldY = 22 * gp.tileSize;

        gp.obj[29] = new OBJ_W15();
        gp.obj[29].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[29].worldY = 26 * gp.tileSize;
        gp.obj[30] = new OBJ_W23();
        gp.obj[30].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[30].worldY = 27 * gp.tileSize;

        gp.obj[31] = new OBJ_W15();
        gp.obj[31].worldX = (7 * gp.tileSize) - (4 * gp.scale);
        gp.obj[31].worldY = 34 * gp.tileSize;
        gp.obj[32] = new OBJ_W23();
        gp.obj[32].worldX = (7 * gp.tileSize) - (4 * gp.scale);
        gp.obj[32].worldY = 35 * gp.tileSize;

        gp.obj[33] = new OBJ_W15();
        gp.obj[33].worldX = (38 * gp.tileSize) - (2 * gp.scale);
        gp.obj[33].worldY = 33 * gp.tileSize;
        gp.obj[34] = new OBJ_W23();
        gp.obj[34].worldX = (38 * gp.tileSize) - (2 * gp.scale);
        gp.obj[34].worldY = 34 * gp.tileSize;

        gp.obj[35] = new OBJ_W15();
        gp.obj[35].worldX = (34 * gp.tileSize) - (2 * gp.scale);
        gp.obj[35].worldY = 10 * gp.tileSize;
        gp.obj[36] = new OBJ_W23();
        gp.obj[36].worldX = (34 * gp.tileSize) - (2 * gp.scale);
        gp.obj[36].worldY = 11 * gp.tileSize;

        gp.obj[37] = new OBJ_W15();
        gp.obj[37].worldX = (31 * gp.tileSize) - (2 * gp.scale);
        gp.obj[37].worldY = 19 * gp.tileSize;
        gp.obj[38] = new OBJ_W23();
        gp.obj[38].worldX = (31 * gp.tileSize) - (2 * gp.scale);
        gp.obj[38].worldY = 20 * gp.tileSize;

        gp.obj[39] = new OBJ_W15();
        gp.obj[39].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[39].worldY = 8 * gp.tileSize;
        gp.obj[40] = new OBJ_W23();
        gp.obj[40].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[40].worldY = 9 * gp.tileSize;

        gp.obj[41] = new OBJ_W15();
        gp.obj[41].worldX = (16 * gp.tileSize) - (2 * gp.scale);
        gp.obj[41].worldY = 30 * gp.tileSize;
        gp.obj[42] = new OBJ_W23();
        gp.obj[42].worldX = (16 * gp.tileSize) - (2 * gp.scale);
        gp.obj[42].worldY = 31 * gp.tileSize;

        gp.obj[43] = new OBJ_W15();
        gp.obj[43].worldX = (7 * gp.tileSize);
        gp.obj[43].worldY = 40 * gp.tileSize;
        gp.obj[44] = new OBJ_W23();
        gp.obj[44].worldX = (7 * gp.tileSize);
        gp.obj[44].worldY = 41 * gp.tileSize;

        gp.obj[45] = new OBJ_W15();
        gp.obj[45].worldX = (8 * gp.tileSize) - (2 * gp.scale);
        gp.obj[45].worldY = 41 * gp.tileSize;
        gp.obj[46] = new OBJ_W23();
        gp.obj[46].worldX = (8 * gp.tileSize) - (2 * gp.scale);
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
        gp.obj[51].worldX = (4 * gp.tileSize) - (2 * gp.scale);
        gp.obj[51].worldY = 30 * gp.tileSize;
        gp.obj[52] = new OBJ_W23();
        gp.obj[52].worldX = (4 * gp.tileSize) - (2 * gp.scale);
        gp.obj[52].worldY = 31 * gp.tileSize;

        gp.obj[53] = new OBJ_W15();
        gp.obj[53].worldX = (5 * gp.tileSize) - (2 * gp.scale);
        gp.obj[53].worldY = 32 * gp.tileSize;
        gp.obj[54] = new OBJ_W23();
        gp.obj[54].worldX = (5 * gp.tileSize) - (2 * gp.scale);
        gp.obj[54].worldY = 33 * gp.tileSize;

        gp.obj[55] = new OBJ_W15();
        gp.obj[55].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[55].worldY = 33 * gp.tileSize;
        gp.obj[56] = new OBJ_W23();
        gp.obj[56].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[56].worldY = 34 * gp.tileSize;

        gp.obj[57] = new OBJ_W17();
        gp.obj[57].worldX = (42 * gp.tileSize);
        gp.obj[57].worldY = 40 * gp.tileSize;
        gp.obj[58] = new OBJ_W25();
        gp.obj[58].worldX = (42 * gp.tileSize);
        gp.obj[58].worldY = 41 * gp.tileSize;

        gp.obj[59] = new OBJ_W17();
        gp.obj[59].worldX = (45 * gp.tileSize);
        gp.obj[59].worldY = 31 * gp.tileSize;
        gp.obj[60] = new OBJ_W25();
        gp.obj[60].worldX = (45 * gp.tileSize);
        gp.obj[60].worldY = 32 * gp.tileSize;

        gp.obj[61] = new OBJ_W17();
        gp.obj[61].worldX = (41 * gp.tileSize) + (2 * gp.scale);
        gp.obj[61].worldY = 41 * gp.tileSize;
        gp.obj[62] = new OBJ_W25();
        gp.obj[62].worldX = (41 * gp.tileSize) + (2 * gp.scale);
        gp.obj[62].worldY = 42 * gp.tileSize;

        gp.obj[63] = new OBJ_W17();
        gp.obj[63].worldX = (31 * gp.tileSize) + (2 * gp.scale);
        gp.obj[63].worldY = 46 * gp.tileSize;
        gp.obj[64] = new OBJ_W25();
        gp.obj[64].worldX = (31 * gp.tileSize) + (2 * gp.scale);
        gp.obj[64].worldY = 47 * gp.tileSize;

        gp.obj[65] = new OBJ_W17();
        gp.obj[65].worldX = (43 * gp.tileSize) + (4 * gp.scale);
        gp.obj[65].worldY = 33 * gp.tileSize;
        gp.obj[66] = new OBJ_W25();
        gp.obj[66].worldX = (43 * gp.tileSize) + (4 * gp.scale);
        gp.obj[66].worldY = 34 * gp.tileSize;

        gp.obj[67] = new OBJ_W17();
        gp.obj[67].worldX = (42 * gp.tileSize) + (6 * gp.scale);
        gp.obj[67].worldY = 34 * gp.tileSize;
        gp.obj[68] = new OBJ_W25();
        gp.obj[68].worldX = (42 * gp.tileSize) + (6 * gp.scale);
        gp.obj[68].worldY = 35 * gp.tileSize;

        gp.obj[69] = new OBJ_W17();
        gp.obj[69].worldX = (40 * gp.tileSize) + (2 * gp.scale);
        gp.obj[69].worldY = 33 * gp.tileSize;
        gp.obj[70] = new OBJ_W25();
        gp.obj[70].worldX = (40 * gp.tileSize) + (2 * gp.scale);
        gp.obj[70].worldY = 34 * gp.tileSize;

        gp.obj[71] = new OBJ_W17();
        gp.obj[71].worldX = (46 * gp.tileSize) + (2 * gp.scale);
        gp.obj[71].worldY = 12 * gp.tileSize;
        gp.obj[72] = new OBJ_W25();
        gp.obj[72].worldX = (46 * gp.tileSize) + (2 * gp.scale);
        gp.obj[72].worldY = 13 * gp.tileSize;

        gp.obj[73] = new OBJ_W17();
        gp.obj[73].worldX = (46 * gp.tileSize);
        gp.obj[73].worldY = 18 * gp.tileSize;
        gp.obj[74] = new OBJ_W25();
        gp.obj[74].worldX = (46 * gp.tileSize);
        gp.obj[74].worldY = 19 * gp.tileSize;

        gp.obj[75] = new OBJ_W17();
        gp.obj[75].worldX = (45 * gp.tileSize) + (2 * gp.scale);
        gp.obj[75].worldY = 19 * gp.tileSize;
        gp.obj[76] = new OBJ_W25();
        gp.obj[76].worldX = (45 * gp.tileSize) + (2 * gp.scale);
        gp.obj[76].worldY = 20 * gp.tileSize;

        gp.obj[77] = new OBJ_W17();
        gp.obj[77].worldX = (35 * gp.tileSize) + (2 * gp.scale);
        gp.obj[77].worldY = 18 * gp.tileSize;
        gp.obj[78] = new OBJ_W25();
        gp.obj[78].worldX = (35 * gp.tileSize) + (2 * gp.scale);
        gp.obj[78].worldY = 19 * gp.tileSize;

        gp.obj[79] = new OBJ_W17();
        gp.obj[79].worldX = (32 * gp.tileSize) + (2 * gp.scale);
        gp.obj[79].worldY = 19 * gp.tileSize;
        gp.obj[80] = new OBJ_W25();
        gp.obj[80].worldX = (32 * gp.tileSize) + (2 * gp.scale);
        gp.obj[80].worldY = 20 * gp.tileSize;

        gp.obj[81] = new OBJ_W17();
        gp.obj[81].worldX = (26 * gp.tileSize) + (2 * gp.scale);
        gp.obj[81].worldY = 19 * gp.tileSize;
        gp.obj[82] = new OBJ_W25();
        gp.obj[82].worldX = (26 * gp.tileSize) + (2 * gp.scale);
        gp.obj[82].worldY = 20 * gp.tileSize;

        gp.obj[83] = new OBJ_W17();
        gp.obj[83].worldX = (11 * gp.tileSize) + (2 * gp.scale);
        gp.obj[83].worldY = 8 * gp.tileSize;
        gp.obj[84] = new OBJ_W25();
        gp.obj[84].worldX = (11 * gp.tileSize) + (2 * gp.scale);
        gp.obj[84].worldY = 9 * gp.tileSize;

        gp.obj[85] = new OBJ_W17();
        gp.obj[85].worldX = (12 * gp.tileSize) + (2 * gp.scale);
        gp.obj[85].worldY = 12 * gp.tileSize;
        gp.obj[86] = new OBJ_W25();
        gp.obj[86].worldX = (12 * gp.tileSize) + (2 * gp.scale);
        gp.obj[86].worldY = 13 * gp.tileSize;

        gp.obj[87] = new OBJ_W17();
        gp.obj[87].worldX = (8 * gp.tileSize) + (2 * gp.scale);
        gp.obj[87].worldY = 13 * gp.tileSize;
        gp.obj[88] = new OBJ_W25();
        gp.obj[88].worldX = (8 * gp.tileSize) + (2 * gp.scale);
        gp.obj[88].worldY = 14 * gp.tileSize;

        gp.obj[89] = new OBJ_W17();
        gp.obj[89].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[89].worldY = 32 * gp.tileSize;
        gp.obj[90] = new OBJ_W25();
        gp.obj[90].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[90].worldY = 33 * gp.tileSize;

        gp.obj[91] = new OBJ_W8();
        gp.obj[91].worldX = (3 * gp.tileSize) - (2 * gp.scale);
        gp.obj[91].worldY = (10 * gp.tileSize);

        gp.obj[92] = new OBJ_W8();
        gp.obj[92].worldX = 3 * gp.tileSize - (2 * gp.scale);
        gp.obj[92].worldY = 11 * gp.tileSize;

        gp.obj[93] = new OBJ_W8();
        gp.obj[93].worldX = 3 * gp.tileSize - (2 * gp.scale);
        gp.obj[93].worldY = 12 * gp.tileSize;

        gp.obj[94] = new OBJ_W8();
        gp.obj[94].worldX = 4 * gp.tileSize - (2 * gp.scale);
        gp.obj[94].worldY = 8 * gp.tileSize;

        gp.obj[95] = new OBJ_LM();
        gp.obj[95].worldX = 4 * gp.tileSize;
        gp.obj[95].worldY = 13 * gp.tileSize;

        gp.obj[96] = new OBJ_BLM();
        gp.obj[96].worldX = 7 * gp.tileSize;
        gp.obj[96].worldY = 8 * gp.tileSize;

        gp.obj[97] = new OBJ_LM();
        gp.obj[97].worldX = 40 * gp.tileSize;
        gp.obj[97].worldY = 10 * gp.tileSize;

        gp.obj[98] = new OBJ_BLM();
        gp.obj[98].worldX = 30 * gp.tileSize;
        gp.obj[98].worldY = 34 * gp.tileSize;

        gp.obj[99] = new OBJ_BML();
        gp.obj[99].worldX = 4 * gp.tileSize - (2 * gp.scale);
        gp.obj[99].worldY = 13 * gp.tileSize;

        gp.obj[100] = new OBJ_BLR();
        gp.obj[100].worldX = 5 * gp.tileSize + (12 * gp.scale);
        gp.obj[100].worldY = 13 * gp.tileSize;

        gp.obj[101] = new OBJ_BML();
        gp.obj[101].worldX = 7 * gp.tileSize - (2 * gp.scale);
        gp.obj[101].worldY = 8 * gp.tileSize;

        gp.obj[102] = new OBJ_BLR();
        gp.obj[102].worldX = 8 * gp.tileSize + (12 * gp.scale);
        gp.obj[102].worldY = 8 * gp.tileSize;

        gp.obj[103] = new OBJ_BML();
        gp.obj[103].worldX = 40 * gp.tileSize - (2 * gp.scale);
        gp.obj[103].worldY = 10 * gp.tileSize;

        gp.obj[104] = new OBJ_BLR();
        gp.obj[104].worldX = 41 * gp.tileSize + (12 * gp.scale);
        gp.obj[104].worldY = 10 * gp.tileSize;

        gp.obj[105] = new OBJ_BML();
        gp.obj[105].worldX = 30 * gp.tileSize - (2 * gp.scale);
        gp.obj[105].worldY = 34 * gp.tileSize;

        gp.obj[106] = new OBJ_BLR();
        gp.obj[106].worldX = 31 * gp.tileSize + (12 * gp.scale);
        gp.obj[106].worldY = 34 * gp.tileSize;

        gp.obj[107] = new OBJ_BLM();
        gp.obj[107].worldX = 36 * gp.tileSize + (8 * gp.scale);
        gp.obj[107].worldY = 23 * gp.tileSize - (7 * gp.scale);

        gp.obj[108] = new OBJ_W17();
        gp.obj[108].worldX = 27 * gp.tileSize;
        gp.obj[108].worldY = 17 * gp.tileSize ;

        gp.obj[109] = new OBJ_W25();
        gp.obj[109].worldX = 27 * gp.tileSize;
        gp.obj[109].worldY = 18 * gp.tileSize;

        gp.obj[110] = new OBJ_W15();
        gp.obj[110].worldX = 30 * gp.tileSize;
        gp.obj[110].worldY = 17 * gp.tileSize;

        gp.obj[111] = new OBJ_W23();
        gp.obj[111].worldX = 30 * gp.tileSize;
        gp.obj[111].worldY = 18 * gp.tileSize;

        gp.obj[112] = new OBJ_W8();
        gp.obj[112].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[112].worldY = 25 * gp.tileSize;

        gp.obj[113] = new OBJ_W8();
        gp.obj[113].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[113].worldY = 24 * gp.tileSize;

        gp.obj[114] = new OBJ_W8();
        gp.obj[114].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[114].worldY = 23 * gp.tileSize;

        gp.obj[115] = new OBJ_W8();
        gp.obj[115].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[115].worldY = 22 * gp.tileSize;

        gp.obj[116] = new OBJ_W7();
        gp.obj[116].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[116].worldY = 21 * gp.tileSize;

        gp.obj[117] = new OBJ_W8();
        gp.obj[117].worldX = 5 * gp.tileSize - (2 * gp.scale);
        gp.obj[117].worldY = 20 * gp.tileSize;

        gp.obj[118] = new OBJ_W19();
        gp.obj[118].worldX = 5 * gp.tileSize;
        gp.obj[118].worldY = 19 * gp.tileSize;

        gp.obj[119] = new OBJ_W7();
        gp.obj[119].worldX = 4 * gp.tileSize - (2 * gp.scale);
        gp.obj[119].worldY = 18 * gp.tileSize;

        gp.obj[120] = new OBJ_W15();
        gp.obj[120].worldX = (20 * gp.tileSize) - (2 * gp.scale);
        gp.obj[120].worldY = 47 * gp.tileSize;
        gp.obj[121] = new OBJ_W23();
        gp.obj[121].worldX = (20 * gp.tileSize) - (2 * gp.scale);
        gp.obj[121].worldY = 48 * gp.tileSize;

        gp.obj[122] = new OBJ_W7();
        gp.obj[122].worldX = 20 * gp.tileSize - (2 * gp.scale);
        gp.obj[122].worldY = 46 * gp.tileSize;

        gp.obj[123] = new OBJ_W8();
        gp.obj[123].worldX = 18 * gp.tileSize;
        gp.obj[123].worldY = 45 * gp.tileSize;

        gp.obj[124] = new OBJ_W8();
        gp.obj[124].worldX = 18 * gp.tileSize;
        gp.obj[124].worldY = 44 * gp.tileSize;

        gp.obj[125] = new OBJ_W8();
        gp.obj[125].worldX = 18 * gp.tileSize;
        gp.obj[125].worldY = 43 * gp.tileSize;

        gp.obj[126] = new OBJ_W8();
        gp.obj[126].worldX = 18 * gp.tileSize;
        gp.obj[126].worldY = 42 * gp.tileSize;

        gp.obj[127] = new OBJ_W7();
        gp.obj[127].worldX = 18 * gp.tileSize;
        gp.obj[127].worldY = 41 * gp.tileSize;

        gp.obj[128] = new OBJ_W7();
        gp.obj[128].worldX = 8 * gp.tileSize - (2 * gp.scale);
        gp.obj[128].worldY = 40 * gp.tileSize;

        gp.obj[129] = new OBJ_W8();
        gp.obj[129].worldX = 7 * gp.tileSize;
        gp.obj[129].worldY = 39 * gp.tileSize;

        gp.obj[130] = new OBJ_W8();
        gp.obj[130].worldX = 7 * gp.tileSize;
        gp.obj[130].worldY = 37 * gp.tileSize;

        gp.obj[131] = new OBJ_W8();
        gp.obj[131].worldX = 7 * gp.tileSize;
        gp.obj[131].worldY = 36 * gp.tileSize;

        gp.obj[132] = new OBJ_W7();
        gp.obj[132].worldX = 7 * gp.tileSize - (3 * gp.scale);
        gp.obj[132].worldY = 33 * gp.tileSize;

        gp.obj[133] = new OBJ_W7();
        gp.obj[133].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[133].worldY = 32 * gp.tileSize;

        gp.obj[134] = new OBJ_W8();
        gp.obj[134].worldX = 5 * gp.tileSize - (2 * gp.scale);
        gp.obj[134].worldY = 31 * gp.tileSize;

        gp.obj[135] = new OBJ_W7();
        gp.obj[135].worldX = 5 * gp.tileSize - (2 * gp.scale);
        gp.obj[135].worldY = 30 * gp.tileSize;

        gp.obj[136] = new OBJ_W7();
        gp.obj[136].worldX = 4 * gp.tileSize - (2 * gp.scale);
        gp.obj[136].worldY = 29 * gp.tileSize;

        gp.obj[137] = new OBJ_W8();
        gp.obj[137].worldX = 7 * gp.tileSize;
        gp.obj[137].worldY = 38 * gp.tileSize;

        gp.obj[138] = new OBJ_W8();
        gp.obj[138].worldX = 16 * gp.tileSize - (2 * gp.scale);
        gp.obj[138].worldY = 29 * gp.tileSize;

        gp.obj[139] = new OBJ_W8();
        gp.obj[139].worldX = 16 * gp.tileSize - (2 * gp.scale);
        gp.obj[139].worldY = 28 * gp.tileSize;

        gp.obj[140] = new OBJ_W7();
        gp.obj[140].worldX = 16 * gp.tileSize - (2 * gp.scale);
        gp.obj[140].worldY = 26 * gp.tileSize;

        gp.obj[141] = new OBJ_W8();
        gp.obj[141].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[141].worldY = 7 * gp.tileSize;

        gp.obj[142] = new OBJ_W8();
        gp.obj[142].worldX = 6 * gp.tileSize - (2 * gp.scale);
        gp.obj[142].worldY = 6 * gp.tileSize;

        gp.obj[143] = new OBJ_W8();
        gp.obj[143].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[143].worldY = 30 * gp.tileSize;

        gp.obj[144] = new OBJ_W8();
        gp.obj[144].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[144].worldY = 31 * gp.tileSize;

        gp.obj[145] = new OBJ_W8();
        gp.obj[145].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[145].worldY = 32 * gp.tileSize;

        gp.obj[146] = new OBJ_W7();
        gp.obj[146].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[146].worldY = 23 * gp.tileSize;

        gp.obj[147] = new OBJ_W8();
        gp.obj[147].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[147].worldY = 24 * gp.tileSize;

        gp.obj[148] = new OBJ_W8();
        gp.obj[148].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[148].worldY = 25 * gp.tileSize;

        gp.obj[149] = new OBJ_W8();
        gp.obj[149].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[149].worldY = 26 * gp.tileSize;

        gp.obj[150] = new OBJ_W8();
        gp.obj[150].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[150].worldY = 27 * gp.tileSize;

        gp.obj[151] = new OBJ_W8();
        gp.obj[151].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[151].worldY = 28 * gp.tileSize;

        gp.obj[152] = new OBJ_W8();
        gp.obj[152].worldX = 38 * gp.tileSize - (2 * gp.scale);
        gp.obj[152].worldY = 29 * gp.tileSize;

        gp.obj[153] = new OBJ_BLL();
        gp.obj[153].worldX = 36 * gp.tileSize;
        gp.obj[153].worldY = 23 * gp.tileSize;

        gp.obj[154] = new OBJ_W8();
        gp.obj[154].worldX = 36 * gp.tileSize;
        gp.obj[154].worldY = 22 * gp.tileSize;

        gp.obj[155] = new OBJ_W8();
        gp.obj[155].worldX = 36 * gp.tileSize;
        gp.obj[155].worldY = 21 * gp.tileSize;

        gp.obj[156] = new OBJ_W8();
        gp.obj[156].worldX = 36 * gp.tileSize;
        gp.obj[156].worldY = 20 * gp.tileSize;

        gp.obj[157] = new OBJ_W8();
        gp.obj[157].worldX = 36 * gp.tileSize;
        gp.obj[157].worldY = 19 * gp.tileSize;

        gp.obj[158] = new OBJ_W7();
        gp.obj[158].worldX = 36 * gp.tileSize;
        gp.obj[158].worldY = 18 * gp.tileSize;

        gp.obj[159] = new OBJ_BLR();
        gp.obj[159].worldX = 37 * gp.tileSize + (22 * gp.scale);
        gp.obj[159].worldY = 23 * gp.tileSize;

        gp.obj[160] = new OBJ_W8();
        gp.obj[160].worldX = 31 * gp.tileSize - (2 * gp.scale);
        gp.obj[160].worldY = 18 * gp.tileSize;

        gp.obj[161] = new OBJ_W7();
        gp.obj[161].worldX = 42 * gp.tileSize - (2 * gp.scale);
        gp.obj[161].worldY = 10 * gp.tileSize;

        gp.obj[162] = new OBJ_W7();
        gp.obj[162].worldX = 43 * gp.tileSize - (2 * gp.scale);
        gp.obj[162].worldY = 11 * gp.tileSize;

        gp.obj[163] = new OBJ_W8();
        gp.obj[163].worldX = 16 * gp.tileSize - (2 * gp.scale);
        gp.obj[163].worldY = 27 * gp.tileSize;

        gp.obj[164] = new OBJ_W0();
        gp.obj[164].worldX = 3 * gp.tileSize - (2 * gp.scale);
        gp.obj[164].worldY = 9 * gp.tileSize;

        gp.obj[165] = new OBJ_W22();
        gp.obj[165].worldX = 4 * gp.tileSize - (2 * gp.scale);
        gp.obj[165].worldY = 9 * gp.tileSize;

        gp.obj[166] = new OBJ_W0();
        gp.obj[166].worldX = 4 * gp.tileSize - (2 * gp.scale);
        gp.obj[166].worldY = 7 * gp.tileSize;

        gp.obj[167] = new OBJ_W22();
        gp.obj[167].worldX = 5 * gp.tileSize - (2 * gp.scale);
        gp.obj[167].worldY = 7 * gp.tileSize;

        gp.obj[168] = new OBJ_W0();
        gp.obj[168].worldX = 5 * gp.tileSize - (2 * gp.scale);
        gp.obj[168].worldY = 6 * gp.tileSize;

        gp.obj[169] = new OBJ_W3();
        gp.obj[169].worldX = 18 * gp.tileSize;
        gp.obj[169].worldY = 19 * gp.tileSize;

        gp.obj[170] = new OBJ_W9();
        gp.obj[170].worldX = 18 * gp.tileSize;
        gp.obj[170].worldY = 20 * gp.tileSize;

        gp.obj[171] = new OBJ_W9();
        gp.obj[171].worldX = 18 * gp.tileSize;
        gp.obj[171].worldY = 21 * gp.tileSize;

        gp.obj[172] = new OBJ_W9();
        gp.obj[172].worldX = 18 * gp.tileSize;
        gp.obj[172].worldY = 22 * gp.tileSize;

        gp.obj[173] = new OBJ_W9();
        gp.obj[173].worldX = 18 * gp.tileSize;
        gp.obj[173].worldY = 23 * gp.tileSize;

        gp.obj[174] = new OBJ_W9();
        gp.obj[174].worldX = 18 * gp.tileSize;
        gp.obj[174].worldY = 24 * gp.tileSize;

        gp.obj[175] = new OBJ_W9();
        gp.obj[175].worldX = 18 * gp.tileSize;
        gp.obj[175].worldY = 25 * gp.tileSize;

        gp.obj[176] = new OBJ_W9();
        gp.obj[176].worldX = 18 * gp.tileSize;
        gp.obj[176].worldY = 26 * gp.tileSize;

        gp.obj[177] = new OBJ_W9();
        gp.obj[177].worldX = 18 * gp.tileSize;
        gp.obj[177].worldY = 27 * gp.tileSize;

        gp.obj[178] = new OBJ_W3();
        gp.obj[178].worldX = 26 * gp.tileSize + (2 * gp.scale);
        gp.obj[178].worldY = 17 * gp.tileSize;

        gp.obj[179] = new OBJ_W9();
        gp.obj[179].worldX = 26 * gp.tileSize + (2 * gp.scale);
        gp.obj[179].worldY = 18 * gp.tileSize;

        gp.obj[180] = new OBJ_W7();
        gp.obj[180].worldX = 31 * gp.tileSize - (2 * gp.scale);
        gp.obj[180].worldY = 17 * gp.tileSize;

        gp.obj[181] = new OBJ_W3();
        gp.obj[181].worldX = 32 * gp.tileSize + (2 * gp.scale);
        gp.obj[181].worldY = 18 * gp.tileSize;

        gp.obj[182] = new OBJ_W9();
        gp.obj[182].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[182].worldY = 30 * gp.tileSize;

        gp.obj[183] = new OBJ_W9();
        gp.obj[183].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[183].worldY = 31 * gp.tileSize;

        gp.obj[184] = new OBJ_W9();
        gp.obj[184].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[184].worldY = 32 * gp.tileSize;

        gp.obj[185] = new OBJ_W3();
        gp.obj[185].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[185].worldY = 29 * gp.tileSize;

        gp.obj[186] = new OBJ_W3();
        gp.obj[186].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[186].worldY = 19 * gp.tileSize;

        gp.obj[187] = new OBJ_W9();
        gp.obj[187].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[187].worldY = 20 * gp.tileSize;

        gp.obj[188] = new OBJ_W9();
        gp.obj[188].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[188].worldY = 21 * gp.tileSize;

        gp.obj[189] = new OBJ_W1();
        gp.obj[189].worldX = 41 * gp.tileSize;
        gp.obj[189].worldY = 22 * gp.tileSize;

        gp.obj[190] = new OBJ_W18();
        gp.obj[190].worldX = 40 * gp.tileSize + (2 * gp.scale);
        gp.obj[190].worldY = 22 * gp.tileSize;

        gp.obj[191] = new OBJ_W1();
        gp.obj[191].worldX = 42 * gp.tileSize;
        gp.obj[191].worldY = 22 * gp.tileSize;

        gp.obj[192] = new OBJ_W1();
        gp.obj[192].worldX = 43 * gp.tileSize;
        gp.obj[192].worldY = 22 * gp.tileSize;

        gp.obj[193] = new OBJ_W1();
        gp.obj[193].worldX = 44 * gp.tileSize;
        gp.obj[193].worldY = 22 * gp.tileSize;

        gp.obj[194] = new OBJ_W1();
        gp.obj[194].worldX = 45 * gp.tileSize;
        gp.obj[194].worldY = 22 * gp.tileSize;

        gp.obj[195] = new OBJ_W2();
        gp.obj[195].worldX = 46 * gp.tileSize;
        gp.obj[195].worldY = 22 * gp.tileSize;

        gp.obj[196] = new OBJ_W3();
        gp.obj[196].worldX = 8 * gp.tileSize + (2 * gp.scale);
        gp.obj[196].worldY = 12 * gp.tileSize;

        gp.obj[197] = new OBJ_W9();
        gp.obj[197].worldX = 12 * gp.tileSize + (2 * gp.scale);
        gp.obj[197].worldY = 11 * gp.tileSize;

        gp.obj[198] = new OBJ_W9();
        gp.obj[198].worldX = 12 * gp.tileSize + (2 * gp.scale);
        gp.obj[198].worldY = 10 * gp.tileSize;

        gp.obj[199] = new OBJ_W9();
        gp.obj[199].worldX = 12 * gp.tileSize + (2 * gp.scale);
        gp.obj[199].worldY = 9 * gp.tileSize;

        gp.obj[200] = new OBJ_W9();
        gp.obj[200].worldX = 12 * gp.tileSize + (2 * gp.scale);
        gp.obj[200].worldY = 8 * gp.tileSize;

        gp.obj[201] = new OBJ_W9();
        gp.obj[201].worldX = 12 * gp.tileSize + (2 * gp.scale);
        gp.obj[201].worldY = 7 * gp.tileSize;

        gp.obj[202] = new OBJ_W2();
        gp.obj[202].worldX = 12 * gp.tileSize + (2 * gp.scale);
        gp.obj[202].worldY = 6 * gp.tileSize;

        gp.obj[203] = new OBJ_W9();
        gp.obj[203].worldX = 11 * gp.tileSize + (2 * gp.scale);
        gp.obj[203].worldY = 7 * gp.tileSize;

        gp.obj[204] = new OBJ_W9();
        gp.obj[204].worldX = 11 * gp.tileSize + (2 * gp.scale);
        gp.obj[204].worldY = 6 * gp.tileSize;

        gp.obj[205] = new OBJ_W2();
        gp.obj[205].worldX = 11 * gp.tileSize + (2 * gp.scale);
        gp.obj[205].worldY = 5 * gp.tileSize;

        gp.obj[206] = new OBJ_W2();
        gp.obj[206].worldX = 10 * gp.tileSize;
        gp.obj[206].worldY = 4 * gp.tileSize;

        gp.obj[207] = new OBJ_W2();
        gp.obj[207].worldX = 9 * gp.tileSize;
        gp.obj[207].worldY = 3 * gp.tileSize;

        gp.obj[208] = new OBJ_W19();
        gp.obj[208].worldX = 27 * gp.tileSize;
        gp.obj[208].worldY = 14 * gp.tileSize;

        gp.obj[209] = new OBJ_W2();
        gp.obj[209].worldX = 26 * gp.tileSize;
        gp.obj[209].worldY = 13 * gp.tileSize;

        gp.obj[210] = new OBJ_W17();
        gp.obj[210].worldX = 20 * gp.tileSize;
        gp.obj[210].worldY = 30 * gp.tileSize;

        gp.obj[211] = new OBJ_W25();
        gp.obj[211].worldX = 20 * gp.tileSize;
        gp.obj[211].worldY = 31 * gp.tileSize;

        gp.obj[212] = new OBJ_W19();
        gp.obj[212].worldX = 30 * gp.tileSize;
        gp.obj[212].worldY = 14 * gp.tileSize;

        gp.obj[213] = new OBJ_W0();
        gp.obj[213].worldX = 31 * gp.tileSize;
        gp.obj[213].worldY = 13 * gp.tileSize;

        gp.obj[214] = new OBJ_W19();
        gp.obj[214].worldX = 25 * gp.tileSize;
        gp.obj[214].worldY = 13 * gp.tileSize;

        gp.obj[215] = new OBJ_W19();
        gp.obj[215].worldX = 24 * gp.tileSize;
        gp.obj[215].worldY = 13 * gp.tileSize;

        gp.obj[216] = new OBJ_W19();
        gp.obj[216].worldX = 23 * gp.tileSize;
        gp.obj[216].worldY = 13 * gp.tileSize;

        gp.obj[217] = new OBJ_W19();
        gp.obj[217].worldX = 22 * gp.tileSize;
        gp.obj[217].worldY = 13 * gp.tileSize;

        gp.obj[218] = new OBJ_W19();
        gp.obj[218].worldX = 21 * gp.tileSize;
        gp.obj[218].worldY = 13 * gp.tileSize;

        gp.obj[219] = new OBJ_W19();
        gp.obj[219].worldX = 20 * gp.tileSize;
        gp.obj[219].worldY = 13 * gp.tileSize;

        gp.obj[220] = new OBJ_W19();
        gp.obj[220].worldX = 19 * gp.tileSize;
        gp.obj[220].worldY = 13 * gp.tileSize;

        gp.obj[221] = new OBJ_W19();
        gp.obj[221].worldX = 18 * gp.tileSize;
        gp.obj[221].worldY = 13 * gp.tileSize;

        gp.obj[222] = new OBJ_W18();
        gp.obj[222].worldX = 26 * gp.tileSize;
        gp.obj[222].worldY = 14 * gp.tileSize;

        gp.obj[223] = new OBJ_W0();
        gp.obj[223].worldX = 17 * gp.tileSize;
        gp.obj[223].worldY = 13 * gp.tileSize;

        gp.obj[224] = new OBJ_W8();
        gp.obj[224].worldX = 17 * gp.tileSize;
        gp.obj[224].worldY = 14 * gp.tileSize;

        gp.obj[225] = new OBJ_W8();
        gp.obj[225].worldX = 17 * gp.tileSize;
        gp.obj[225].worldY = 15 * gp.tileSize;

        gp.obj[226] = new OBJ_W8();
        gp.obj[226].worldX = 17 * gp.tileSize;
        gp.obj[226].worldY = 16 * gp.tileSize;

        gp.obj[227] = new OBJ_W8();
        gp.obj[227].worldX = 17 * gp.tileSize;
        gp.obj[227].worldY = 17 * gp.tileSize;

        gp.obj[228] = new OBJ_W8();
        gp.obj[228].worldX = 17 * gp.tileSize;
        gp.obj[228].worldY = 18 * gp.tileSize;

        gp.obj[229] = new OBJ_W22();
        gp.obj[229].worldX = 17 * gp.tileSize;
        gp.obj[229].worldY = 19 * gp.tileSize;

        gp.obj[230] = new OBJ_W19();
        gp.obj[230].worldX = 16 * gp.tileSize;
        gp.obj[230].worldY = 19 * gp.tileSize;

        gp.obj[231] = new OBJ_W19();
        gp.obj[231].worldX = 15 * gp.tileSize;
        gp.obj[231].worldY = 19 * gp.tileSize;

        gp.obj[232] = new OBJ_W19();
        gp.obj[232].worldX = 14 * gp.tileSize;
        gp.obj[232].worldY = 19 * gp.tileSize;

        gp.obj[233] = new OBJ_W19();
        gp.obj[233].worldX = 13 * gp.tileSize;
        gp.obj[233].worldY = 19 * gp.tileSize;

        gp.obj[234] = new OBJ_W19();
        gp.obj[234].worldX = 12 * gp.tileSize;
        gp.obj[234].worldY = 19 * gp.tileSize;

        gp.obj[235] = new OBJ_W19();
        gp.obj[235].worldX = 11 * gp.tileSize;
        gp.obj[235].worldY = 19 * gp.tileSize;

        gp.obj[236] = new OBJ_W19();
        gp.obj[236].worldX = 10 * gp.tileSize;
        gp.obj[236].worldY = 19 * gp.tileSize;

        gp.obj[237] = new OBJ_W19();
        gp.obj[237].worldX = 9 * gp.tileSize;
        gp.obj[237].worldY = 19 * gp.tileSize;

        gp.obj[238] = new OBJ_W19();
        gp.obj[238].worldX = 8 * gp.tileSize;
        gp.obj[238].worldY = 19 * gp.tileSize;

        gp.obj[239] = new OBJ_W19();
        gp.obj[239].worldX = 7 * gp.tileSize;
        gp.obj[239].worldY = 19 * gp.tileSize;

        gp.obj[240] = new OBJ_W19();
        gp.obj[240].worldX = 6 * gp.tileSize;
        gp.obj[240].worldY = 19 * gp.tileSize;

        gp.obj[241] = new OBJ_W18();
        gp.obj[241].worldX = 18 * gp.tileSize;
        gp.obj[241].worldY = 28 * gp.tileSize;

        gp.obj[242] = new OBJ_W0();
        gp.obj[242].worldX = 5 * gp.tileSize - (2 * gp.scale);
        gp.obj[242].worldY = 19 * gp.tileSize;

        gp.obj[243] = new OBJ_W19();
        gp.obj[243].worldX = 19 * gp.tileSize;
        gp.obj[243].worldY = 28 * gp.tileSize;

        gp.obj[244] = new OBJ_W19();
        gp.obj[244].worldX = 20 * gp.tileSize;
        gp.obj[244].worldY = 28 * gp.tileSize;

        gp.obj[245] = new OBJ_W15();
        gp.obj[245].worldX = 23 * gp.tileSize;
        gp.obj[245].worldY = 30 * gp.tileSize;

        gp.obj[246] = new OBJ_W23();
        gp.obj[246].worldX = 23 * gp.tileSize;
        gp.obj[246].worldY = 31 * gp.tileSize;

        gp.obj[247] = new OBJ_W19();
        gp.obj[247].worldX = 23 * gp.tileSize;
        gp.obj[247].worldY = 28 * gp.tileSize;

        gp.obj[248] = new OBJ_W19();
        gp.obj[248].worldX = 24 * gp.tileSize;
        gp.obj[248].worldY = 28 * gp.tileSize;

        gp.obj[249] = new OBJ_W19();
        gp.obj[249].worldX = 24 * gp.tileSize;
        gp.obj[249].worldY = 28 * gp.tileSize;

        gp.obj[250] = new OBJ_W19();
        gp.obj[250].worldX = 25 * gp.tileSize;
        gp.obj[250].worldY = 28 * gp.tileSize;

        gp.obj[251] = new OBJ_W19();
        gp.obj[251].worldX = 26 * gp.tileSize;
        gp.obj[251].worldY = 28 * gp.tileSize;

        gp.obj[252] = new OBJ_W19();
        gp.obj[252].worldX = 27 * gp.tileSize;
        gp.obj[252].worldY = 28 * gp.tileSize;

        gp.obj[253] = new OBJ_W19();
        gp.obj[253].worldX = 28 * gp.tileSize;
        gp.obj[253].worldY = 28 * gp.tileSize;

        gp.obj[254] = new OBJ_W19();
        gp.obj[254].worldX = 29 * gp.tileSize;
        gp.obj[254].worldY = 28 * gp.tileSize;

        gp.obj[255] = new OBJ_W19();
        gp.obj[255].worldX = 30 * gp.tileSize;
        gp.obj[255].worldY = 28 * gp.tileSize;

        gp.obj[256] = new OBJ_W19();
        gp.obj[256].worldX = 31 * gp.tileSize;
        gp.obj[256].worldY = 28 * gp.tileSize;

        gp.obj[257] = new OBJ_W19();
        gp.obj[257].worldX = 32 * gp.tileSize;
        gp.obj[257].worldY = 28 * gp.tileSize;

        gp.obj[258] = new OBJ_W19();
        gp.obj[258].worldX = 33 * gp.tileSize;
        gp.obj[258].worldY = 28 * gp.tileSize;

        gp.obj[259] = new OBJ_W19();
        gp.obj[259].worldX = 34 * gp.tileSize;
        gp.obj[259].worldY = 28 * gp.tileSize;

        gp.obj[260] = new OBJ_W19();
        gp.obj[260].worldX = 35 * gp.tileSize;
        gp.obj[260].worldY = 28 * gp.tileSize;

        gp.obj[261] = new OBJ_W19();
        gp.obj[261].worldX = 36 * gp.tileSize;
        gp.obj[261].worldY = 28 * gp.tileSize;

        gp.obj[262] = new OBJ_W19();
        gp.obj[262].worldX = 37 * gp.tileSize - (2 * gp.scale);
        gp.obj[262].worldY = 28 * gp.tileSize;

        gp.obj[263] = new OBJ_W22();
        gp.obj[263].worldX = 31 * gp.tileSize;
        gp.obj[263].worldY = 14 * gp.tileSize;

        gp.obj[264] = new OBJ_W2();
        gp.obj[264].worldX = 32 * gp.tileSize;
        gp.obj[264].worldY = 13 * gp.tileSize;

        gp.obj[265] = new OBJ_W9();
        gp.obj[265].worldX = 32 * gp.tileSize;
        gp.obj[265].worldY = 14 * gp.tileSize;

        gp.obj[266] = new OBJ_W18();
        gp.obj[266].worldX = 32 * gp.tileSize;
        gp.obj[266].worldY = 15 * gp.tileSize;

        gp.obj[267] = new OBJ_W19();
        gp.obj[267].worldX = 33 * gp.tileSize;
        gp.obj[267].worldY = 15 * gp.tileSize;

        gp.obj[268] = new OBJ_W19();
        gp.obj[268].worldX = 34 * gp.tileSize;
        gp.obj[268].worldY = 15 * gp.tileSize;

        gp.obj[269] = new OBJ_W19();
        gp.obj[269].worldX = 35 * gp.tileSize;
        gp.obj[269].worldY = 15 * gp.tileSize;

        gp.obj[270] = new OBJ_W19();
        gp.obj[270].worldX = 36 * gp.tileSize;
        gp.obj[270].worldY = 15 * gp.tileSize;

        gp.obj[271] = new OBJ_W19();
        gp.obj[271].worldX = 37 * gp.tileSize;
        gp.obj[271].worldY = 15 * gp.tileSize;

        gp.obj[272] = new OBJ_W19();
        gp.obj[272].worldX = 38 * gp.tileSize;
        gp.obj[272].worldY = 15 * gp.tileSize;

        gp.obj[273] = new OBJ_W19();
        gp.obj[273].worldX = 39 * gp.tileSize;
        gp.obj[273].worldY = 15 * gp.tileSize;

        gp.obj[274] = new OBJ_W19();
        gp.obj[274].worldX = 40 * gp.tileSize;
        gp.obj[274].worldY = 15 * gp.tileSize;

        gp.obj[275] = new OBJ_W19();
        gp.obj[275].worldX = 41 * gp.tileSize;
        gp.obj[275].worldY = 15 * gp.tileSize;

        gp.obj[276] = new OBJ_W2();
        gp.obj[276].worldX = 42 * gp.tileSize;
        gp.obj[276].worldY = 15 * gp.tileSize;

        gp.obj[277] = new OBJ_W9();
        gp.obj[277].worldX = 42 * gp.tileSize;
        gp.obj[277].worldY = 16 * gp.tileSize;

        gp.obj[278] = new OBJ_W9();
        gp.obj[278].worldX = 42 * gp.tileSize;
        gp.obj[278].worldY = 17 * gp.tileSize;

        gp.obj[279] = new OBJ_W9();
        gp.obj[279].worldX = 42 * gp.tileSize;
        gp.obj[279].worldY = 18 * gp.tileSize;

        gp.obj[280] = new OBJ_W17();
        gp.obj[280].worldX = (42 * gp.tileSize);
        gp.obj[280].worldY = 19 * gp.tileSize;
        gp.obj[281] = new OBJ_W25();
        gp.obj[281].worldX = (42 * gp.tileSize);
        gp.obj[281].worldY = 20 * gp.tileSize;

        gp.obj[282] = new OBJ_W2();
        gp.obj[282].worldX = (46 * gp.tileSize);
        gp.obj[282].worldY = 21 * gp.tileSize;

        gp.obj[283] = new OBJ_W1();
        gp.obj[283].worldX = (45 * gp.tileSize);
        gp.obj[283].worldY = 21 * gp.tileSize;

        gp.obj[284] = new OBJ_W18();
        gp.obj[284].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[284].worldY = 21 * gp.tileSize;

        gp.obj[285] = new OBJ_W9();
        gp.obj[285].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[285].worldY = 20 * gp.tileSize;

        gp.obj[286] = new OBJ_W3();
        gp.obj[286].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[286].worldY = 19 * gp.tileSize;

        gp.obj[287] = new OBJ_W3();
        gp.obj[287].worldX = (45 * gp.tileSize) + (2 * gp.scale);
        gp.obj[287].worldY = 18 * gp.tileSize;

        gp.obj[288] = new OBJ_W9();
        gp.obj[288].worldX = (46 * gp.tileSize);
        gp.obj[288].worldY = 17 * gp.tileSize;

        gp.obj[289] = new OBJ_W9();
        gp.obj[289].worldX = (46 * gp.tileSize);
        gp.obj[289].worldY = 16 * gp.tileSize;

        gp.obj[290] = new OBJ_W9();
        gp.obj[290].worldX = (46 * gp.tileSize);
        gp.obj[290].worldY = 15 * gp.tileSize;

        gp.obj[291] = new OBJ_W9();
        gp.obj[291].worldX = (46 * gp.tileSize);
        gp.obj[291].worldY = 14 * gp.tileSize;

        gp.obj[292] = new OBJ_W9();
        gp.obj[292].worldX = (46 * gp.tileSize);
        gp.obj[292].worldY = 23 * gp.tileSize;

        gp.obj[293] = new OBJ_W9();
        gp.obj[293].worldX = (46 * gp.tileSize);
        gp.obj[293].worldY = 24 * gp.tileSize;

        gp.obj[294] = new OBJ_W9();
        gp.obj[294].worldX = (46 * gp.tileSize);
        gp.obj[294].worldY = 25 * gp.tileSize;

        gp.obj[295] = new OBJ_W9();
        gp.obj[295].worldX = (46 * gp.tileSize);
        gp.obj[295].worldY = 26 * gp.tileSize;

        gp.obj[296] = new OBJ_W9();
        gp.obj[296].worldX = (46 * gp.tileSize);
        gp.obj[296].worldY = 27 * gp.tileSize;

        gp.obj[297] = new OBJ_W9();
        gp.obj[297].worldX = (46 * gp.tileSize);
        gp.obj[297].worldY = 28 * gp.tileSize;

        gp.obj[298] = new OBJ_W3();
        gp.obj[298].worldX = (42 * gp.tileSize) + (6 * gp.scale);
        gp.obj[298].worldY = 33 * gp.tileSize;

        gp.obj[299] = new OBJ_W3();
        gp.obj[299].worldX = (43 * gp.tileSize) + (3 * gp.scale);
        gp.obj[299].worldY = 32 * gp.tileSize;

        gp.obj[300] = new OBJ_W3();
        gp.obj[300].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[300].worldY = 31 * gp.tileSize;

        gp.obj[301] = new OBJ_W9();
        gp.obj[301].worldX = (42 * gp.tileSize);
        gp.obj[301].worldY = 36 * gp.tileSize;

        gp.obj[302] = new OBJ_W9();
        gp.obj[302].worldX = (42 * gp.tileSize);
        gp.obj[302].worldY = 37 * gp.tileSize;

        gp.obj[303] = new OBJ_W9();
        gp.obj[303].worldX = (42 * gp.tileSize);
        gp.obj[303].worldY = 38 * gp.tileSize;

        gp.obj[304] = new OBJ_W9();
        gp.obj[304].worldX = (42 * gp.tileSize);
        gp.obj[304].worldY = 39 * gp.tileSize;

        gp.obj[305] = new OBJ_W3();
        gp.obj[305].worldX = (31 * gp.tileSize) + (2 * gp.scale);
        gp.obj[305].worldY = 41 * gp.tileSize;

        gp.obj[306] = new OBJ_W9();
        gp.obj[306].worldX = (31 * gp.tileSize) + (2 * gp.scale);
        gp.obj[306].worldY = 42 * gp.tileSize;

        gp.obj[307] = new OBJ_W9();
        gp.obj[307].worldX = (31 * gp.tileSize) + (2 * gp.scale);
        gp.obj[307].worldY = 43 * gp.tileSize;

        gp.obj[308] = new OBJ_W9();
        gp.obj[308].worldX = (31 * gp.tileSize) + (2 * gp.scale);
        gp.obj[308].worldY = 44 * gp.tileSize;

        gp.obj[309] = new OBJ_W9();
        gp.obj[309].worldX = (31 * gp.tileSize) + (2 * gp.scale);
        gp.obj[309].worldY = 45 * gp.tileSize;

        gp.obj[310] = new OBJ_W3();
        gp.obj[310].worldX = (29 * gp.tileSize) + (2 * gp.scale);
        gp.obj[310].worldY = 46 * gp.tileSize;

        gp.obj[311] = new OBJ_W3();
        gp.obj[311].worldX = (41 * gp.tileSize) + (2 * gp.scale);
        gp.obj[311].worldY = 40 * gp.tileSize;

        gp.obj[312] = new OBJ_W9();
        gp.obj[312].worldX = (46 * gp.tileSize) + (2 * gp.scale);
        gp.obj[312].worldY = 11 * gp.tileSize;

        gp.obj[313] = new OBJ_W9();
        gp.obj[313].worldX = (46 * gp.tileSize) + (2 * gp.scale);
        gp.obj[313].worldY = 10 * gp.tileSize;

        gp.obj[314] = new OBJ_W9();
        gp.obj[314].worldX = (45 * gp.tileSize) + (2 * gp.scale);
        gp.obj[314].worldY = 8 * gp.tileSize;

        gp.obj[315] = new OBJ_W9();
        gp.obj[315].worldX = (43 * gp.tileSize) + (2 * gp.scale);
        gp.obj[315].worldY = 5 * gp.tileSize;

        gp.obj[316] = new OBJ_W2();
        gp.obj[316].worldX = (46 * gp.tileSize) + (2 * gp.scale);
        gp.obj[316].worldY = 9 * gp.tileSize;

        gp.obj[317] = new OBJ_W2();
        gp.obj[317].worldX = (45 * gp.tileSize) + (2 * gp.scale);
        gp.obj[317].worldY = 7 * gp.tileSize;

        gp.obj[318] = new OBJ_W2();
        gp.obj[318].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[318].worldY = 6 * gp.tileSize;

        gp.obj[319] = new OBJ_W2();
        gp.obj[319].worldX = (43 * gp.tileSize) + (2 * gp.scale);
        gp.obj[319].worldY = 4 * gp.tileSize;

        gp.obj[320] = new OBJ_W2();
        gp.obj[320].worldX = (42 * gp.tileSize) + (2 * gp.scale);
        gp.obj[320].worldY = 3 * gp.tileSize;

        gp.obj[321] = new OBJ_W0();
        gp.obj[321].worldX = (41 * gp.tileSize);
        gp.obj[321].worldY = 2 * gp.tileSize;

        gp.obj[322] = new OBJ_W18();
        gp.obj[322].worldX = (45 * gp.tileSize) + (2 * gp.scale);
        gp.obj[322].worldY = 9 * gp.tileSize;

        gp.obj[323] = new OBJ_W18();
        gp.obj[323].worldX = (44 * gp.tileSize) + (2 * gp.scale);
        gp.obj[323].worldY = 7 * gp.tileSize;

        gp.obj[324] = new OBJ_W18();
        gp.obj[324].worldX = (43 * gp.tileSize) + (2 * gp.scale);
        gp.obj[324].worldY = 6 * gp.tileSize;

        gp.obj[325] = new OBJ_W18();
        gp.obj[325].worldX = (42 * gp.tileSize) + (2 * gp.scale);
        gp.obj[325].worldY = 4 * gp.tileSize;

        gp.obj[326] = new OBJ_W18();
        gp.obj[326].worldX = (41 * gp.tileSize) + (2 * gp.scale);
        gp.obj[326].worldY = 3 * gp.tileSize;

        gp.obj[327] = new OBJ_W2();
        gp.obj[327].worldX = (41 * gp.tileSize) + (2 * gp.scale);
        gp.obj[327].worldY = 2 * gp.tileSize;

        gp.obj[328] = new OBJ_W22();
        gp.obj[328].worldX = (41 * gp.tileSize) - (2 * gp.scale);
        gp.obj[328].worldY = 3 * gp.tileSize;

        gp.obj[329] = new OBJ_W0();
        gp.obj[329].worldX = (40 * gp.tileSize) - (2 * gp.scale);
        gp.obj[329].worldY = 3 * gp.tileSize;

        gp.obj[330] = new OBJ_W22();
        gp.obj[330].worldX = (40 * gp.tileSize) - (2 * gp.scale);
        gp.obj[330].worldY = 4 * gp.tileSize;

        gp.obj[331] = new OBJ_W0();
        gp.obj[331].worldX = (39 * gp.tileSize) - (2 * gp.scale);
        gp.obj[331].worldY = 4 * gp.tileSize;

        gp.obj[332] = new OBJ_W22();
        gp.obj[332].worldX = (39 * gp.tileSize) - (2 * gp.scale);
        gp.obj[332].worldY = 5 * gp.tileSize;

        gp.obj[333] = new OBJ_W22();
        gp.obj[333].worldX = (38 * gp.tileSize) - (2 * gp.scale);
        gp.obj[333].worldY = 6 * gp.tileSize;

        gp.obj[334] = new OBJ_W22();
        gp.obj[334].worldX = (37 * gp.tileSize) - (2 * gp.scale);
        gp.obj[334].worldY = 7 * gp.tileSize;

        gp.obj[335] = new OBJ_W22();
        gp.obj[335].worldX = (36 * gp.tileSize) - (2 * gp.scale);
        gp.obj[335].worldY = 8 * gp.tileSize;

        gp.obj[336] = new OBJ_W22();
        gp.obj[336].worldX = (35 * gp.tileSize) - (2 * gp.scale);
        gp.obj[336].worldY = 9 * gp.tileSize;

        gp.obj[337] = new OBJ_W0();
        gp.obj[337].worldX = (38 * gp.tileSize) - (2 * gp.scale);
        gp.obj[337].worldY = 5 * gp.tileSize;

        gp.obj[338] = new OBJ_W0();
        gp.obj[338].worldX = (37 * gp.tileSize) - (2 * gp.scale);
        gp.obj[338].worldY = 6 * gp.tileSize;

        gp.obj[339] = new OBJ_W0();
        gp.obj[339].worldX = (36 * gp.tileSize) - (2 * gp.scale);
        gp.obj[339].worldY = 7 * gp.tileSize;

        gp.obj[340] = new OBJ_W0();
        gp.obj[340].worldX = (35 * gp.tileSize) - (2 * gp.scale);
        gp.obj[340].worldY = 8 * gp.tileSize;

        gp.obj[341] = new OBJ_W0();
        gp.obj[341].worldX = (34 * gp.tileSize) - (2 * gp.scale);
        gp.obj[341].worldY = 9 * gp.tileSize;

        gp.obj[342] = new OBJ_W1();
        gp.obj[342].worldX = (33 * gp.tileSize) - (2 * gp.scale);
        gp.obj[342].worldY = 10 * gp.tileSize;

        gp.obj[343] = new OBJ_W1();
        gp.obj[343].worldX = (32 * gp.tileSize);
        gp.obj[343].worldY = 10 * gp.tileSize;

        gp.obj[344] = new OBJ_W1();
        gp.obj[344].worldX = (31 * gp.tileSize);
        gp.obj[344].worldY = 10 * gp.tileSize;

        gp.obj[345] = new OBJ_W1();
        gp.obj[345].worldX = (30 * gp.tileSize);
        gp.obj[345].worldY = 10 * gp.tileSize;

        gp.obj[346] = new OBJ_W1();
        gp.obj[346].worldX = (29 * gp.tileSize);
        gp.obj[346].worldY = 10 * gp.tileSize;

        gp.obj[347] = new OBJ_W1();
        gp.obj[347].worldX = (28 * gp.tileSize);
        gp.obj[347].worldY = 10 * gp.tileSize;

        gp.obj[348] = new OBJ_W1();
        gp.obj[348].worldX = (27 * gp.tileSize);
        gp.obj[348].worldY = 10 * gp.tileSize;

        gp.obj[349] = new OBJ_W1();
        gp.obj[349].worldX = (26 * gp.tileSize);
        gp.obj[349].worldY = 10 * gp.tileSize;

        gp.obj[350] = new OBJ_W1();
        gp.obj[350].worldX = (25 * gp.tileSize);
        gp.obj[350].worldY = 10 * gp.tileSize;

        gp.obj[351] = new OBJ_RPX3();
        gp.obj[351].worldX = 24 * gp.tileSize + (3 * gp.scale);
        gp.obj[351].worldY = 9 * gp.tileSize;

        gp.obj[352] = new OBJ_W1();
        gp.obj[352].worldX = (23 * gp.tileSize);
        gp.obj[352].worldY = 10 * gp.tileSize;

        gp.obj[353] = new OBJ_W1();
        gp.obj[353].worldX = (22 * gp.tileSize);
        gp.obj[353].worldY = 10 * gp.tileSize;

        gp.obj[354] = new OBJ_W1();
        gp.obj[354].worldX = (21 * gp.tileSize);
        gp.obj[354].worldY = 10 * gp.tileSize;

        gp.obj[355] = new OBJ_W1();
        gp.obj[355].worldX = (20 * gp.tileSize);
        gp.obj[355].worldY = 10 * gp.tileSize;

        gp.obj[356] = new OBJ_W1();
        gp.obj[356].worldX = (19 * gp.tileSize);
        gp.obj[356].worldY = 10 * gp.tileSize;

        gp.obj[357] = new OBJ_W1();
        gp.obj[357].worldX = (18 * gp.tileSize);
        gp.obj[357].worldY = 10 * gp.tileSize;

        gp.obj[358] = new OBJ_W1();
        gp.obj[358].worldX = (17 * gp.tileSize);
        gp.obj[358].worldY = 10 * gp.tileSize;

        gp.obj[359] = new OBJ_W1();
        gp.obj[359].worldX = (16 * gp.tileSize);
        gp.obj[359].worldY = 10 * gp.tileSize;

        gp.obj[360] = new OBJ_W18();
        gp.obj[360].worldX = (15 * gp.tileSize);
        gp.obj[360].worldY = 10 * gp.tileSize;

        gp.obj[361] = new OBJ_W18();
        gp.obj[361].worldX = (14 * gp.tileSize);
        gp.obj[361].worldY = 9 * gp.tileSize;

        gp.obj[362] = new OBJ_W18();
        gp.obj[362].worldX = (13 * gp.tileSize);
        gp.obj[362].worldY = 8 * gp.tileSize;

        gp.obj[363] = new OBJ_W2();
        gp.obj[363].worldX = (15 * gp.tileSize);
        gp.obj[363].worldY = 9 * gp.tileSize;

        gp.obj[364] = new OBJ_W2();
        gp.obj[364].worldX = (14 * gp.tileSize);
        gp.obj[364].worldY = 8 * gp.tileSize;

        gp.obj[365] = new OBJ_W2();
        gp.obj[365].worldX = (13 * gp.tileSize);
        gp.obj[365].worldY = 7 * gp.tileSize;

        gp.obj[366] = new OBJ_W15();
        gp.obj[366].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[366].worldY = 22 * gp.tileSize;
        gp.obj[367] = new OBJ_W23();
        gp.obj[367].worldX = (6 * gp.tileSize) - (2 * gp.scale);
        gp.obj[367].worldY = 23 * gp.tileSize;

        gp.obj[368] = new OBJ_W17();
        gp.obj[368].worldX = (12 * gp.tileSize);
        gp.obj[368].worldY = 22 * gp.tileSize;
        gp.obj[369] = new OBJ_W25();
        gp.obj[369].worldX = (12 * gp.tileSize);
        gp.obj[369].worldY = 23 * gp.tileSize;

        gp.obj[370] = new OBJ_W9();
        gp.obj[370].worldX = (12 * gp.tileSize);
        gp.obj[370].worldY = 20 * gp.tileSize;

        gp.obj[371] = new OBJ_W9();
        gp.obj[371].worldX = (12 * gp.tileSize);
        gp.obj[371].worldY = 21 * gp.tileSize;

        gp.obj[372] = new OBJ_W2();
        gp.obj[372].worldX = (12 * gp.tileSize);
        gp.obj[372].worldY = 19 * gp.tileSize;

        gp.obj[373] = new OBJ_LM();
        gp.obj[373].worldX = 7 * gp.tileSize;
        gp.obj[373].worldY = 22 * gp.tileSize;

        gp.obj[374] = new OBJ_BML();
        gp.obj[374].worldX = 7 * gp.tileSize - (2 * gp.scale);
        gp.obj[374].worldY = 22 * gp.tileSize;

        gp.obj[375] = new OBJ_BLR();
        gp.obj[375].worldX = 8 * gp.tileSize + (12 * gp.scale);
        gp.obj[375].worldY = 22 * gp.tileSize;

        gp.obj[376] = new OBJ_GA();
        gp.obj[376].worldX = 39 * gp.tileSize;
        gp.obj[376].worldY = 6 * gp.tileSize;

        gp.obj[377] = new OBJ_GB();
        gp.obj[377].worldX = 41 * gp.tileSize;
        gp.obj[377].worldY = 6 * gp.tileSize;

        gp.obj[378] = new OBJ_GC();
        gp.obj[378].worldX = 43 * gp.tileSize;
        gp.obj[378].worldY = 6 * gp.tileSize + (13 * gp.scale);

        gp.obj[379] = new OBJ_Chest();
        gp.obj[379].worldX = 41 * gp.tileSize;
        gp.obj[379].worldY = 3 * gp.tileSize;

        gp.obj[380] = new OBJ_W();
        gp.obj[380].worldX = 10 * gp.tileSize;
        gp.obj[380].worldY = 20 * gp.tileSize;

        gp.obj[381] = new OBJ_SL();
        gp.obj[381].worldX = 36 * gp.tileSize ;
        gp.obj[381].worldY = 29 * gp.tileSize - (7 * gp.scale);

        gp.obj[382] = new OBJ_PB();
        gp.obj[382].worldX = 32 * gp.tileSize - (9 * gp.scale);
        gp.obj[382].worldY = 13 * gp.tileSize - (21 * gp.scale);

        gp.obj[383] = new OBJ_FW2();
        gp.obj[383].worldX = 41 * gp.tileSize;
        gp.obj[383].worldY = 21 * gp.tileSize;

        gp.obj[384] = new OBJ_FW1();
        gp.obj[384].worldX = 22 * gp.tileSize;
        gp.obj[384].worldY = 45 * gp.tileSize;

        gp.obj[385] = new OBJ_FW3();
        gp.obj[385].worldX = 10 * gp.tileSize;
        gp.obj[385].worldY = 20 * gp.tileSize;

        // gp.obj[386] = new OBJ_FW2();
        // gp.obj[386].worldX = 12 * gp.tileSize;
        // gp.obj[386].worldY = 11 * gp.tileSize;

        // gp.obj[387] = new OBJ_PoC();
        // gp.obj[387].worldX = 41 * gp.tileSize;
        // gp.obj[387].worldY = 21 * gp.tileSize;

        gp.obj[388] = new OBJ_BT2();
        gp.obj[388].worldX = 11 * gp.tileSize - (4 * gp.scale);
        gp.obj[388].worldY = 19 * gp.tileSize + (18 * gp.scale);

        gp.obj[389] = new OBJ_BT2();
        gp.obj[389].worldX = 35 * gp.tileSize + (5 * gp.scale);
        gp.obj[389].worldY = 29 * gp.tileSize + (10 * gp.scale);

        gp.obj[390] = new OBJ_BT1();
        gp.obj[390].worldX = 31 * gp.tileSize + (8 * gp.scale);
        gp.obj[390].worldY = 14 * gp.tileSize + (6 * gp.scale);

        gp.obj[391] = new OBJ_W15();
        gp.obj[391].worldX = (43 * gp.tileSize) - (2 * gp.scale);
        gp.obj[391].worldY = 12 * gp.tileSize;
        gp.obj[392] = new OBJ_W23();
        gp.obj[392].worldX = (43 * gp.tileSize) - (2 * gp.scale);
        gp.obj[392].worldY = 13 * gp.tileSize;

        gp.obj[393] = new OBJ_W15();
        gp.obj[393].worldX = (42 * gp.tileSize) - (2 * gp.scale);
        gp.obj[393].worldY = 11 * gp.tileSize;
        gp.obj[394] = new OBJ_W23();
        gp.obj[394].worldX = (42 * gp.tileSize) - (2 * gp.scale);
        gp.obj[394].worldY = 12 * gp.tileSize;

        gp.obj[395] = new OBJ_W17();
        gp.obj[395].worldX = (29 * gp.tileSize) + (2 * gp.scale);
        gp.obj[395].worldY = 47 * gp.tileSize;
        gp.obj[396] = new OBJ_W25();
        gp.obj[396].worldX = (29 * gp.tileSize) + (2 * gp.scale);
        gp.obj[396].worldY = 48 * gp.tileSize;

        gp.obj[397] = new OBJ_W17();
        gp.obj[397].worldX = (46 * gp.tileSize);
        gp.obj[397].worldY = 29 * gp.tileSize;
        gp.obj[398] = new OBJ_W25();
        gp.obj[398].worldX = (46 * gp.tileSize);
        gp.obj[398].worldY = 30 * gp.tileSize;

        gp.obj[399] = new OBJ_W2();
        gp.obj[399].worldX = (27 * gp.tileSize);
        gp.obj[399].worldY = 14 * gp.tileSize;

        gp.obj[400] = new OBJ_W9();
        gp.obj[400].worldX = (27 * gp.tileSize);
        gp.obj[400].worldY = 16 * gp.tileSize;

        gp.obj[401] = new OBJ_W9();
        gp.obj[401].worldX = (27 * gp.tileSize);
        gp.obj[401].worldY = 15 * gp.tileSize;

        gp.obj[402] = new OBJ_W0();
        gp.obj[402].worldX = (30 * gp.tileSize);
        gp.obj[402].worldY = 14 * gp.tileSize;

        gp.obj[403] = new OBJ_W8();
        gp.obj[403].worldX = (30 * gp.tileSize);
        gp.obj[403].worldY = 16 * gp.tileSize;

        gp.obj[404] = new OBJ_W8();
        gp.obj[404].worldX = (30 * gp.tileSize);
        gp.obj[404].worldY = 15 * gp.tileSize;

        gp.obj[405] = new OBJ_W2();
        gp.obj[405].worldX = (20 * gp.tileSize);
        gp.obj[405].worldY = 28 * gp.tileSize;

        gp.obj[406] = new OBJ_W9();
        gp.obj[406].worldX = (20 * gp.tileSize);
        gp.obj[406].worldY = 29 * gp.tileSize;

        gp.obj[407] = new OBJ_W0();
        gp.obj[407].worldX = (23 * gp.tileSize);
        gp.obj[407].worldY = 28 * gp.tileSize;

        gp.obj[408] = new OBJ_W8();
        gp.obj[408].worldX = (23 * gp.tileSize);
        gp.obj[408].worldY = 29 * gp.tileSize;

        gp.obj[409] = new OBJ_LM();
        gp.obj[409].worldX = 30 * gp.tileSize;
        gp.obj[409].worldY = 30 * gp.tileSize;

        gp.obj[410] = new OBJ_BLM();
        gp.obj[410].worldX = 20 * gp.tileSize;
        gp.obj[410].worldY = 19 * gp.tileSize;

        gp.obj[411] = new OBJ_BML();
        gp.obj[411].worldX = 30 * gp.tileSize - (2 * gp.scale);
        gp.obj[411].worldY = 30 * gp.tileSize;

        gp.obj[412] = new OBJ_BLR();
        gp.obj[412].worldX = 31 * gp.tileSize + (12 * gp.scale);
        gp.obj[412].worldY = 30 * gp.tileSize;

        gp.obj[413] = new OBJ_BML();
        gp.obj[413].worldX = 20 * gp.tileSize - (2 * gp.scale);
        gp.obj[413].worldY = 19 * gp.tileSize;

        gp.obj[414] = new OBJ_BLR();
        gp.obj[414].worldX = 21 * gp.tileSize + (12 * gp.scale);
        gp.obj[414].worldY = 19 * gp.tileSize;
    }
}
