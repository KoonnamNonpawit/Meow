package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import main.GamePanel;

public class SaveLoad {
    
    GamePanel gp;

    public SaveLoad(GamePanel gp) {

        this.gp = gp;
    }

    public void save() {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("save.dat")));

            DataStorage ds = new DataStorage();

            // PUZZLE PROGRESS
            //ds.puzzleProgression = gp.player.puzzleProgression;

            // PLAYER INVENTORY
            for(int i = 0; i < gp.player.inventory.size(); i++) {
                ds.itemsName.add(gp.player.inventory.get(i).name);
                //ds.itemAmounts.add(gp.player.inventory.get(i).amounts);
            }

            // Write the DataStorage object
            oos.writeObject(ds);
        } catch (Exception e) {
            System.out.println("Save Exception");
        }
    }


    public void load() {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("save.dat")));

            // Read the DataStorage object
            DataStorage ds = (DataStorage)ois.readObject();

            //gp.player.puzzleProgression = ds.puzzleProgression
            
        } catch (Exception e) {
            System.out.println("Load Exception");
        }
    }

}
