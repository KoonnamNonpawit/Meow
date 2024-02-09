package tile;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public Tile bg;
    public int mapTileNum[][];

    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[175]; // create 10 kinds of tile, Could be change later.
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("res/maps/maps.txt"); // change file Path here.
    }

    // Create a new kind of tile here (inside try...catch) by
    // tile[1] = new Tile();
    // tile[1].image = ImageIO.read(new FileInputStream("Image directory"));
    public void getTileImage() {

        try {

            bg = new Tile();
            bg.BG = ImageIO.read(new FileInputStream("res/background/BG.png"));

            tile[0] = new Tile();
            tile[0].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG0.png"));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG1.png"));

            tile[3] = new Tile();
            tile[3].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG10.png"));

            tile[4] = new Tile();
            tile[4].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG8.png"));

            tile[5] = new Tile();
            tile[5].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG12.png"));

            tile[6] = new Tile();
            tile[6].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG13.png"));

            tile[7] = new Tile();
            tile[7].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG14.png"));

            tile[8] = new Tile();
            tile[8].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG15.png"));

            tile[9] = new Tile();
            tile[9].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG2.png"));

            tile[10] = new Tile();
            tile[10].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG3.png"));

            tile[11] = new Tile();
            tile[11].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG34.png"));

            tile[12] = new Tile();
            tile[12].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG35.png"));

            tile[13] = new Tile();
            tile[13].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG36.png"));

            tile[14] = new Tile();
            tile[14].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG37.png"));

            tile[15] = new Tile();
            tile[15].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG38.png"));

            tile[16] = new Tile();
            tile[16].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG39.png"));

            tile[17] = new Tile();
            tile[17].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG4.png"));

            tile[18] = new Tile();
            tile[18].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG42.png"));

            tile[19] = new Tile();
            tile[19].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG43.png"));

            tile[20] = new Tile();
            tile[20].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG44.png"));

            tile[21] = new Tile();
            tile[21].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG45.png"));

            tile[22] = new Tile();
            tile[22].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG46.png"));

            tile[23] = new Tile();
            tile[23].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG47.png"));

            tile[24] = new Tile();
            tile[24].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG5.png"));

            tile[25] = new Tile();
            tile[25].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG50.png"));

            tile[26] = new Tile();
            tile[26].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG51.png"));

            tile[27] = new Tile();
            tile[27].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG52.png"));

            tile[28] = new Tile();
            tile[28].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG53.png"));

            tile[29] = new Tile();
            tile[29].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG54.png"));

            tile[30] = new Tile();
            tile[30].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG55.png"));

            tile[31] = new Tile();
            tile[31].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG58.png"));

            tile[32] = new Tile();
            tile[32].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG59.png"));

            tile[33] = new Tile();
            tile[33].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG6.png"));

            tile[34] = new Tile();
            tile[34].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG60.png"));

            tile[35] = new Tile();
            tile[35].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG61.png"));

            tile[38] = new Tile();
            tile[38].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG7.png"));

            tile[39] = new Tile();
            tile[39].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG8.png"));

            tile[40] = new Tile();
            tile[40].image = ImageIO.read(new FileInputStream("res/tiles/TilesetG9.png"));

            tile[41] = new Tile();
            tile[41].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF0.png"));

            tile[42] = new Tile();
            tile[42].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF1.png"));

            tile[43] = new Tile();
            tile[43].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF10.png"));

            tile[44] = new Tile();
            tile[44].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF11.png"));

            tile[45] = new Tile();
            tile[45].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF12.png"));

            tile[46] = new Tile();
            tile[46].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF13.png"));

            tile[47] = new Tile();
            tile[47].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF14.png"));

            tile[48] = new Tile();
            tile[48].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF15.png"));

            tile[49] = new Tile();
            tile[49].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF2.png"));

            tile[50] = new Tile();
            tile[50].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF3.png"));

            tile[51] = new Tile();
            tile[51].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF4.png"));

            tile[52] = new Tile();
            tile[52].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF5.png"));

            tile[53] = new Tile();
            tile[53].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF6.png"));

            tile[54] = new Tile();
            tile[54].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF7.png"));

            tile[55] = new Tile();
            tile[55].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF8.png"));

            tile[56] = new Tile();
            tile[56].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGF9.png"));

            tile[57] = new Tile();
            tile[57].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP0.png"));

            tile[58] = new Tile();
            tile[58].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP1.png"));

            tile[59] = new Tile();
            tile[59].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP2.png"));

            tile[60] = new Tile();
            tile[60].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP3.png"));

            tile[61] = new Tile();
            tile[61].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP4.png"));

            tile[62] = new Tile();
            tile[62].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP5.png"));

            tile[63] = new Tile();
            tile[63].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP6.png"));

            tile[64] = new Tile();
            tile[64].image = ImageIO.read(new FileInputStream("res/tiles/TilesetGP7.png"));

            tile[66] = new Tile();
            tile[66].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG9.png"));

            tile[67] = new Tile();
            tile[67].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG10.png"));

            tile[68] = new Tile();
            tile[68].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[69] = new Tile();
            tile[69].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[70] = new Tile();
            tile[70].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[71] = new Tile();
            tile[71].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[72] = new Tile();
            tile[72].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[73] = new Tile();
            tile[73].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG16.png"));

            tile[74] = new Tile();
            tile[74].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG17.png"));

            tile[75] = new Tile();
            tile[75].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG18.png"));

            tile[96] = new Tile();
            tile[96].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG37.png"));

            tile[97] = new Tile();
            tile[97].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG38.png"));

            tile[104] = new Tile();
            tile[104].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG44.png"));

            tile[113] = new Tile();
            tile[113].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[114] = new Tile();
            tile[114].image = ImageIO.read(new FileInputStream("res/tiles/TilesetSG9.png"));

            tile[118] = new Tile();
            tile[118].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW11.png"));

            tile[119] = new Tile();
            tile[119].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW12.png"));

            tile[120] = new Tile();
            tile[120].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW13.png"));

            tile[122] = new Tile();
            tile[122].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW15.png"));

            tile[123] = new Tile();
            tile[123].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW16.png"));

            tile[124] = new Tile();
            tile[124].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW17.png"));

            tile[131] = new Tile();
            tile[131].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW23.png"));

            tile[132] = new Tile();
            tile[132].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW24.png"));

            tile[133] = new Tile();
            tile[133].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW25.png"));

            tile[136] = new Tile();
            tile[136].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW28.png"));

            tile[137] = new Tile();
            tile[137].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW29.png"));

            tile[139] = new Tile();
            tile[139].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW30.png"));

            tile[140] = new Tile();
            tile[140].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW31.png"));

            tile[141] = new Tile();
            tile[141].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW32.png"));

            tile[142] = new Tile();
            tile[142].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW33.png"));

            tile[143] = new Tile();
            tile[143].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW34.png"));

            tile[144] = new Tile();
            tile[144].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW35.png"));

            tile[145] = new Tile();
            tile[145].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW36.png"));

            tile[146] = new Tile();
            tile[146].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW37.png"));

            tile[147] = new Tile();
            tile[147].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW38.png"));

            tile[148] = new Tile();
            tile[148].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW39.png"));

            tile[149] = new Tile();
            tile[149].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW4.png"));

            tile[150] = new Tile();
            tile[150].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW40.png"));

            tile[151] = new Tile();
            tile[151].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW41.png"));

            tile[152] = new Tile();
            tile[152].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW42.png"));

            tile[153] = new Tile();
            tile[153].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW43.png"));

            tile[160] = new Tile();
            tile[160].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW5.png"));

            tile[161] = new Tile();
            tile[161].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[162] = new Tile();
            tile[162].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[163] = new Tile();
            tile[163].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[164] = new Tile();
            tile[164].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[165] = new Tile();
            tile[165].image = ImageIO.read(new FileInputStream("res/tiles/Tileset00.png"));

            tile[166] = new Tile();
            tile[166].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW55.png"));

            tile[167] = new Tile();
            tile[167].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW56.png"));

            tile[168] = new Tile();
            tile[168].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW57.png"));

            tile[169] = new Tile();
            tile[169].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW58.png"));

            tile[170] = new Tile();
            tile[170].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW59.png"));

            tile[171] = new Tile();
            tile[171].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW6.png"));

            tile[172] = new Tile();
            tile[172].image = ImageIO.read(new FileInputStream("res/tiles/TilesetW60.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // scan text file line by line and split them
    // into single number which we will use later.
    // the param filePath allows us to upload more map into the game in the future.
    public void loadMap(String filePath) {
        try {

            // Import text file(map)
            InputStream is = new FileInputStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

                // Read text file line by line
                String line = br.readLine();

                while (col < gp.maxWorldCol) {

                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }
                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                    worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                    worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                    worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

                g2.setColor(new Color(24,24,24));
                g2.fillRect(screenX, screenY, gp.screenWidth, gp.screenHeight);
                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

            worldCol++;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }

        }
    }

}