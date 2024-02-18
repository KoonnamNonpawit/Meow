package data;

import java.io.Serializable;
import java.util.ArrayList;

public class DataStorage implements Serializable{
    
    // PUZZLE PROGRESSION
    int hasBrick;
    int hasPaper;
    int hasFlower;
    int giveBrick;
    int giveFlower;
    int correct;
    boolean pz1Finished;
    boolean pz2Finished;
    boolean pz3Finished;
    boolean pz4Finished;
    boolean flowerFinished;
    boolean brickFinished;

    // PLAYER'S INVENTORY
    ArrayList<String> itemsName = new ArrayList<>();
}
