package tile;

import main.GamePanel;

public class TileManager {

    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[10]; // create 10 kind of tile, Could be change later.

        getTileImage();
    }

    // Create a new kind of tile here (inside try...catch) by 
    //tile[1] = new Tile();
    //tile[1].image = imageIO.read(getClass().getResourceAsStream("image directory")) 
    public void getTileImage() {

        try{

        tile[0] = new Tile();
        tile[0].image = imageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {

        g2.drawImage(tile[0].image, 0, 0, gp.titleSize, gp.tileSize, null);
    }

}