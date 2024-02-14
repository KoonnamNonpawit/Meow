package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;
import object.OBJ_Paper;


public class Player extends Entity{
    
    GamePanel gp;
    KeyHandler keyH;

    // Indicate where we draw player on the screen (camera).
    public final int screenX;
    public final int screenY;
    public int hasPaper = 0;
    public int hasFlower = 0;
    public int hasBrick = 0;
    public int giveFlower = 0;

    // Game Over occurs when player get a question wrong
    public boolean isGameOver = false;
    public boolean pz1Finished,pz2Finished,pz3Finished,pz4Finished,flowerFinished,brickFinished = false;

    public int correctChoice = 0;
    public String text1,text2,text3,text4 = "";

    public ArrayList<Entity> inventory = new ArrayList<>();
    public final int maxInventorySize = 20;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;

        // doesn't change throughout the game (how big camera is).
        // locate at the middle of the screen.
        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);

        solidArea = new Rectangle();
        solidArea.x = 42;
        solidArea.y = 99;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 63;
        solidArea.height = 45;

        setDefaultValues();
        getPlayerImage();
        setItems();

        setDialogue();
    }
    public void setDefaultValues() {

        worldX = (gp.tileSize * 23) + (24*gp.scale);
        worldY = (gp.tileSize * 23) - (5*gp.scale);
        speed = 10;
        direction = "down";
    }

    public void setItems() {

        inventory.clear();
    }

    public void getPlayerImage() {

        name = "player";

        try {

            up1 = ImageIO.read(new FileInputStream("res/player/PlayerU1.png"));
            up2 = ImageIO.read(new FileInputStream("res/player/PlayerU2.png"));
            up3 = ImageIO.read(new FileInputStream("res/player/PlayerU3.png"));
            up4 = ImageIO.read(new FileInputStream("res/player/PlayerU4.png"));
            up5 = ImageIO.read(new FileInputStream("res/player/PlayerU5.png"));
            up6 = ImageIO.read(new FileInputStream("res/player/PlayerU6.png"));
            down1 = ImageIO.read(new FileInputStream("res/player/PlayerD1.png"));
            down2 = ImageIO.read(new FileInputStream("res/player/PlayerD2.png"));
            down3 = ImageIO.read(new FileInputStream("res/player/PlayerD3.png"));
            down4 = ImageIO.read(new FileInputStream("res/player/PlayerD4.png"));
            down5 = ImageIO.read(new FileInputStream("res/player/PlayerD5.png"));
            down6 = ImageIO.read(new FileInputStream("res/player/PlayerD6.png"));
            left1 = ImageIO.read(new FileInputStream("res/player/PlayerL1.png"));
            left2 = ImageIO.read(new FileInputStream("res/player/PlayerL2.png"));
            left3 = ImageIO.read(new FileInputStream("res/player/PlayerL3.png"));
            left4 = ImageIO.read(new FileInputStream("res/player/PlayerL4.png"));
            left5 = ImageIO.read(new FileInputStream("res/player/PlayerL5.png"));
            left6 = ImageIO.read(new FileInputStream("res/player/PlayerL6.png"));
            right1 = ImageIO.read(new FileInputStream("res/player/PlayerR1.png"));
            right2 = ImageIO.read(new FileInputStream("res/player/PlayerR2.png"));
            right3 = ImageIO.read(new FileInputStream("res/player/PlayerR3.png"));
            right4 = ImageIO.read(new FileInputStream("res/player/PlayerR4.png"));
            right5 = ImageIO.read(new FileInputStream("res/player/PlayerR5.png"));
            right6 = ImageIO.read(new FileInputStream("res/player/PlayerR6.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void update() {

        if(keyH.upPressed == true || keyH.downPressed == true || 
           keyH.leftPressed == true || keyH.rightPressed == true) {
            if(keyH.upPressed == true) {
                direction = "up";
            }
            else if(keyH.downPressed == true) {
                direction = "down";
            }
            else if(keyH.leftPressed == true) {
                direction = "left";
            }
            else if(keyH.rightPressed == true) {
                direction = "right";
            }

            // CHECK TILE COLLISION
            collisionOn = false;
            gp.cChecker.checkTile(this);

            // CHECK OBJECT COLLISION
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);

            if(objIndex == 0 || objIndex == 351 || objIndex == 3 || objIndex == 4 || objIndex == 5 || objIndex == 376 || objIndex == 377 || objIndex == 378 || objIndex == 379) {
                interactOBJ(objIndex);
            }

            if(giveFlower == 3) {
                gp.obj[379].spriteNum = 2;
            }

            if(pz1Finished == true) {
                gp.obj[351].spriteNum = 2;
                gp.obj[1].spriteNum = 2;
            }
            if(pz2Finished == true) {
                gp.obj[3].spriteNum = 2;
                gp.obj[1].spriteNum = 3;
            }

            // IF COLLISION IS FALSE, PLAYER CAN MOVE
            if (collisionOn == false) {
                
                switch (direction) {
                case "up": worldY -= speed; break;
                case "down": worldY += speed; break;
                case "left": worldX -= speed; break;
                case "right": worldX += speed; break;
                }
            }
        }
        spriteCounter++;
        if(spriteCounter > 9) {
            if(spriteNum == 1) {
                spriteNum = 2;
            }
            else if(spriteNum == 2) {
                spriteNum = 3;
            }
            else if(spriteNum == 3) {
                spriteNum = 4;
            }
            else if(spriteNum == 4) {
                spriteNum = 5;
            }
            else if(spriteNum == 5) {
                spriteNum = 6;
            }
            else if(spriteNum == 6) {
                spriteNum = 1;
            }
            spriteCounter = 0;

        }

        // check game over
        if(isGameOver == true) {
            gp.gameState = gp.gameOverState;
        }
    }
    public void pickUpObject(int i) {

        if(i != 999) {

            String objectName = gp.obj[i].name;

            switch (objectName) {
                case "Paper":
                    hasPaper += 1;
                    inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.entityList.remove(i);
                    gp.ui.showMessage("You got a paper!");
                    break;
                case "FW1":
                    hasFlower += 1;
                    // inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.entityList.remove(i);
                    gp.ui.showMessage("You got a flower!");
                    break;
                case "FW2":
                    hasFlower += 1;
                    // inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.entityList.remove(i);
                    gp.ui.showMessage("You got a flower!");
                    break;
                case "FW3":
                    hasFlower += 1;
                    // inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.entityList.remove(i);
                    gp.ui.showMessage("You got a flower!");
                    break;
            }
        }
    }
    public void interactOBJ(int i) {

        if(i != 999) {
            if(gp.keyH.enterPressed == true) {
                if(pz1Finished == false) {
                    if(i == 0) {
                        start = 0;
                        speak(start);
                    }
                    if(i == 351 && hasPaper == 0) {
                        start = 1;
                        speak(start);
                    }  
                    if(i == 351 && hasPaper == 1) {
                        start = 2;
                        speak(start);
                    }
                }
                if(pz1Finished == true && pz2Finished == false) {
                    if(i == 351) {
                        start = 3;
                        speak(start);
                    }
                    if(i == 3 && hasFlower != 3) {
                        start = 3;
                        speak(start);
                    }
                    if(i == 0 && hasFlower != 3) {
                        start = 4;
                        speak(start);
                    }
                    if(i == 3 && hasFlower == 3 && hasPaper == 2) {
                        start = 5;
                        speak(start);
                    }
                    if(i == 376 || i == 377 || i == 378 && hasFlower != 3) {
                        start = 6;
                        speak(start);
                    }
                    if(i == 376 || i == 377 || i == 378 && giveFlower != 3) {
                        giveFlower += 1;
                        start = 7;
                        speak(start);
                    }
                    if(i == 379 && giveFlower == 3) {
                        hasPaper += 1;
                        // inventory.add(gp.obj[i]);
                        gp.ui.showMessage("You got a paper!");
                    }
                }
            }
            
        }
        gp.keyH.enterPressed = false;
    }

    // public void draw(Graphics2D g2) {

    //     int playerTileSize = 48 * gp.scale;

    //     BufferedImage image = null;

    //     int screenX = worldX - gp.player.worldX + gp.player.screenX;
    //     int screenY = worldY - gp.player.worldY + gp.player.screenY;

    //     if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
    //        worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
    //        worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
    //        worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
    //         switch (direction) {
    //             case "up": 
    //                 if(spriteNum == 1) {
    //                     image = up1;
    //                 }
    //                 if(spriteNum == 2) {
    //                     image = up2;
    //                 }
    //                 if(spriteNum == 3) {
    //                     image = up3;
    //                 }
    //                 if(spriteNum == 4) {
    //                     image = up4;
    //                 }
    //                 if(spriteNum == 5) {
    //                     image = up5;
    //                 }
    //                 if(spriteNum == 6) {
    //                     image = up6;
    //                 }
    //                 break;
    //             case "down":
    //                 if(spriteNum == 1) {
    //                     image = down1;
    //                 }
    //                 if(spriteNum == 2) {
    //                     image = down2;
    //                 }
    //                 if(spriteNum == 3) {
    //                     image = down3;
    //                 }
    //                 if(spriteNum == 4) {
    //                     image = down4;
    //                 }
    //                 if(spriteNum == 5) {
    //                     image = down5;
    //                 }
    //                 if(spriteNum == 6) {
    //                     image = down6;
    //                 }
    //                 break; 
    //             case "left":
    //                 if(spriteNum == 1) {
    //                     image = left1;
    //                 }
    //                 if(spriteNum == 2) {
    //                     image = left2;
    //                 }
    //                 if(spriteNum == 3) {
    //                     image = left3;
    //                 }
    //                 if(spriteNum == 4) {
    //                     image = left4;
    //                 }
    //                 if(spriteNum == 5) {
    //                     image = left5;
    //                 }
    //                 if(spriteNum == 6) {
    //                     image = left6;
    //                 }
    //                 break;
    //             case "right":
    //                 if(spriteNum == 1) {
    //                     image = right1;
    //                 }
    //                 if(spriteNum == 2) {
    //                     image = right2;
    //                 }
    //                 if(spriteNum == 3) {
    //                     image = right3;
    //                 }
    //                 if(spriteNum == 4) {
    //                     image = right4;
    //                 }
    //                 if(spriteNum == 5) {
    //                     image = right5;
    //                 }
    //                 if(spriteNum == 6) {
    //                     image = right6;
    //                 }
    //                 break;
    //         }
    //         g2.drawImage(image, screenX, screenY, playerTileSize, playerTileSize, null);
    //     }
    // }

    public void setDialogue() {

        dialogues[0][0] = "In the dawn's embrace, the path unfurls, As whispers of hope across the world. \nNorth, where dreams in birth arise, In innocence, beneath clear skies. \nEast, where aspirations find their name, In the golden glow of the morning flame.";
        dialogues[0][1] = "Designation marks the way we tread, With purpose guiding each step ahead. \nSouth, where courage meets the soul's command, In the fervent grasp of steadfast hand. \nAdherence binds us, heart to heart, Through trials endured, we play our part.";
        dialogues[0][2] = "And West, where shadows stretch and bend, In twilight's embrace, where journeys end. \nYet in the dusk, a new beginning's glow, Hope's gentle whisper, softly aglow. \nThus, as the four directions shine, A symphony of life, a grand design.";
        dialogues[0][3] = "In birth, designation, adherence, and end, Hope's eternal dance, forever penned.";

        dialogues[1][0] = "Meow : What language is this?";

        dialogues[2][0] = "Which line of the included Java program is being used to print text to the console? \npublic static void main(String[] args) { \n    String message1 = \"Meow\"; \n    String message2 = \"CS\"; \n    System.out.println(message2); \n}";
        
        dialogues[3][0] = "Pilgrims tread with lanterns bright, Guiding lost lambs through darkest night. \nTheir journey's purpose, noble and grand, To lead the way with outstretched hand. \nThrough rugged paths and valleys low, They walk with faith, their spirits aglow.";
        dialogues[3][1] = "Each step a beacon, each word a hymn, In search of solace, through shadows dim. \nTheir hearts ablaze with compassion's fire, They offer hope, lifting souls higher. \nNo lamb too lost, no path too steep, In their embrace, all find solace deep.";
        dialogues[3][2] = "So let the pilgrims' light shine bright, Dispelling darkness, igniting sight. \n For in their journey, a sacred dance, Bringing light and hope, with every chance.";
        
        dialogues[4][0] = "Eternal peace, a gentle breeze, Amidst the fields where flowers tease. \nThe fallen rest in sacred ground, Where grace and solace can be found. \nIn the Lord's garden, they find repose, Amidst the petals, where love flows.";
        dialogues[4][1] = "Their souls take flight on wings of grace, In the embrace of heaven's embrace. \nNo more pain, no more sorrow's sting, In the eternal bloom, they softly sing. \nAmongst the blossoms, their spirits soar, In the tranquil garden forevermore.";
        dialogues[4][2] = "So let us pause and gently yield, To the peace that blossoms in this field. \nFor in the Lord's embrace, they find release, Eternal rest among His flowers, in peace.";
        
        dialogues[5][0] = "Fill in the blank in order to create a single line comment in java. \npublic class Main { \n    public static void main(String[] args) { \n        ____ I am main method \n        System.out.println(\"Meow\"); \n    } \n}";

        dialogues[6][0] = "...";

        dialogues[7][0] = "Thank you...";
    }

    public void speak(int start) {

        
        startDialogue(this,start);
        if(start == 2) {
            gp.gameState = gp.puzzleState;
            text1 = "public static void main(String[] args) {";
            text2 = "String message2 = \"CS\";";
            text3 = "String message1 = \"Meow\";";
            text4 = "System.out.println(message2);";
            correctChoice = 4;
        }
        if(start == 5) {
            gp.gameState = gp.puzzleState;
            text1 = "/";
            text2 = "//";
            text3 = "*/";
            text4 = "/*";
            correctChoice = 2;
        }
    }   

    public void startDialogue(Entity entity, int setNum) {

        gp.gameState = gp.dialogueState;
        gp.ui.p = (Player)entity;
        dialoguesSet = setNum;
    }
}
