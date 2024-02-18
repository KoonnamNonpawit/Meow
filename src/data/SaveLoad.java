package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import main.GamePanel;
import entity.Entity;
import object.OBJ_BT1;
import object.OBJ_BT2;
import object.OBJ_FW1;
import object.OBJ_FW2;
import object.OBJ_FW3;
import object.OBJ_Paper;

public class SaveLoad {
    
    GamePanel gp;
    Entity entity = new Entity();

    public SaveLoad(GamePanel gp) {

        this.gp = gp;
    }

    public Entity getObject(String itemName) {

        Entity obj = null;
        OBJ_Paper paper = new OBJ_Paper();
        OBJ_Paper paperWithNum = new OBJ_Paper(paper.getPaperNumber());

        switch (itemName) {
            case "Paper": obj = paperWithNum; break;
            case "FW1": obj = new OBJ_FW1(); break;
            case "FW2": obj = new OBJ_FW2(); break;
            case "FW3": obj = new OBJ_FW3(); break;
            case "BT1": obj = new OBJ_BT1(); break;
            case "BT21": obj = new OBJ_BT2(); break;
            case "BT22": obj = new OBJ_BT2(); break;
        }
        return obj;
    }

    public void save() {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("save.dat")));

            DataStorage ds = new DataStorage();

            // PUZZLE PROGRESS
            //ds.puzzleProgression = gp.player.puzzleProgression;
            ds.correct = gp.player.correct;
            ds.giveFlower = gp.player.giveFlower;
            ds.giveBrick = gp.player.giveBrick;
            ds.brickFinished = gp.player.brickFinished;
            ds.flowerFinished = gp.player.flowerFinished;
            ds.hasBrick = gp.player.hasBrick;
            ds.hasFlower = gp.player.hasFlower;
            ds.hasPaper = gp.player.hasPaper;
            ds.pz1Finished = gp.player.pz1Finished;
            ds.pz2Finished = gp.player.pz2Finished;
            ds.pz3Finished = gp.player.pz3Finished;
            ds.pz4Finished = gp.player.pz4Finished;

            // PLAYER INVENTORY
            for(int i = 0; i < gp.player.inventory.size(); i++) {
                ds.itemsName.add(gp.player.inventory.get(i).name);
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

            // PUZZLE PROGRESS
            gp.player.correct = ds.correct;
            gp.player.giveBrick = ds.giveBrick;
            gp.player.giveFlower = ds.giveFlower;
            gp.player.brickFinished = ds.brickFinished;
            gp.player.flowerFinished = ds.flowerFinished;
            gp.player.hasBrick = ds.hasBrick;
            gp.player.hasFlower = ds.hasFlower;
            gp.player.hasPaper = ds.hasPaper;
            gp.player.pz1Finished = ds.pz1Finished;
            gp.player.pz2Finished = ds.pz2Finished;
            gp.player.pz3Finished = ds.pz3Finished;
            gp.player.pz4Finished = ds.pz4Finished;
            
            // PLAYER INVENTORY
            gp.player.inventory.clear();
            for(int i = 0; i < ds.itemsName.size(); i++) {
                gp.player.inventory.add(getObject(ds.itemsName.get(i)));
            }

        } catch (Exception e) {
            System.out.println("Load Exception");
        }
    }

}
