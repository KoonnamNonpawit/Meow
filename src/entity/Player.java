package entity;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;
import object.OBJ_BT1;
import object.OBJ_BT2;
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
    public int giveBrick = 0;
    public int correct = 0;

    // Game Over occurs when player get a question wrong
    public boolean isGameOver = false;
    public boolean pz1Finished,pz2Finished,pz3Finished,pz4Finished,flowerFinished,brickFinished = false;

    public int correctChoice = 0;
    public String text1,text2,text3,text4 = "";

    public ArrayList<Entity> inventory = new ArrayList<>();
    public final int maxInventorySize = 20;

    OBJ_Paper paper = new OBJ_Paper();

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
            if(giveBrick == 3) {
                gp.obj[5].spriteNum = 2;
            }

            if(pz1Finished == true) {
                gp.obj[351].spriteNum = 2;
                gp.obj[1].spriteNum = 2;
            }
            if(pz2Finished == true) {
                gp.obj[3].spriteNum = 2;
                gp.obj[1].spriteNum = 3;
            }
            if(pz3Finished == true) {
                gp.obj[5].spriteNum = 3;
                gp.obj[1].spriteNum = 4;
            }
            if(pz4Finished == true) {
                gp.obj[4].spriteNum = 2;
                gp.obj[1].spriteNum = 5;
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
                    inventory.add(new OBJ_Paper(1));
                    //paper.folder.add(new OBJ_Paper(1));
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a paper!");
                    break;
                case "FW1":
                    hasFlower += 1;
                    inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a flower!");
                    break;
                case "FW2":
                    hasFlower += 1;
                    inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a flower!");
                    break;
                case "FW3":
                    hasFlower += 1;
                    inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a flower!");
                    break;
                case "BT1":
                    hasBrick += 1;
                    inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a Brick!");
                    break;
                case "BT21":
                    hasBrick += 1;
                    inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a Brick!");
                    break;
                case "BT22":
                    hasBrick += 1;
                    inventory.add(gp.obj[i]);
                    gp.obj[i] = null;
                    gp.ui.showMessage("You got a Brick!");
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
                    if(i == 3 && hasFlower < 3 && hasPaper < 2) {
                        start = 3;
                        speak(start);
                    }
                    if(i == 0) {
                        start = 4;
                        speak(start);
                    }
                    if(i == 3 && hasPaper == 2) {
                        start = 5;
                        speak(start);
                    }
                    if((i == 376 || i == 377 || i == 378) && hasFlower < 3) {
                        start = 6;
                        speak(start);
                    }
                    if(i == 376 && hasFlower == 3 && giveFlower < 3) {
                        giveFlower += 1;
                        hasFlower += 1;
                        start = 7;
                        speak(start);
                    }
                    if(i == 377 && hasFlower == 4 && giveFlower < 3) {
                        giveFlower += 1;
                        hasFlower += 1;
                        start = 7;
                        speak(start);
                    }
                    if(i == 378 && hasFlower == 5 && giveFlower < 3) {
                        giveFlower += 1;
                        hasFlower -= 1;
                        start = 7;
                        speak(start);
                    }
                    if(i == 379 && giveFlower == 3) {
                        giveFlower = 0;
                        hasPaper += 1;
                        //OBJ_Paper p2 = new OBJ_Paper(2);
                        inventory.add(new OBJ_Paper(2));
                        gp.ui.showMessage("You got a paper!");
                    }
                }
                if (pz2Finished == true && pz3Finished == false) {
                    if(i == 351 || i == 3) {
                        start = 3;
                        speak(start);
                    }
                    if(i == 0) {
                        start = 8;
                        speak(start);
                    }
                    if(i == 5 && hasBrick == 3) {
                        giveBrick = 3;
                        hasBrick = 0;
                        start = 6;
                        speak(start);
                    }
                    else if(i == 5 && giveBrick == 3 && hasPaper < 3) {
                        hasPaper+=1;
                        //OBJ_Paper p3 = new OBJ_Paper(3);
                        inventory.add(new OBJ_Paper(3));
                        gp.ui.showMessage("You got a paper!");
                    }
                    else if(i == 5 && giveBrick == 3 && hasPaper == 3) {
                        start = 9;
                        speak(start);
                    }
                }
                if (pz3Finished == true && pz4Finished == false) {
                    if(i == 351 || i == 3 || i == 5) {
                        start = 3;
                        speak(start);
                    }
                    if(i == 0) {
                        start = 10;
                        speak(start);
                    }
                    if(i == 4 && correct == 0) {
                        start = 11;
                        speak(start);
                    }
                    else if(i == 4 && correct == 1) {
                        start = 12;
                        speak(start);
                    }
                }
                if (pz3Finished == true && pz4Finished == true) {
                    if(i == 0) {
                        start = 13;
                        speak(start);
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

        dialogues[8][0] = "In the dance of time, all things must fade, Born in brilliance, yet destined to degrade. \nFor where life blooms, so too does decay, A cycle eternal in its winding way. \nFrom ashes rise new forms, unseen, Destruction's touch, a creative sheen.";
        dialogues[8][1] = "In every end, a beginning's seed, A testament to life's cyclical creed. \nThe sun sets low, yet dawn shall break, In every loss, a chance to remake. \nFor in impermanence, lies beauty's art, A perpetual rhythm, a beating heart.";
        dialogues[8][2] = "So let us embrace this ebb and flow, In the ceaseless dance, let's learn and grow. \nFor in destruction's wake, new life shall rise, An eternal cycle beneath the boundless skies.";

        dialogues[9][0] = "Select the line of Java code that has NOT ended correctly. \nint counter = 10; \ndouble num = 5.5 \nSystem.out.println(\"Meow\"); \nString str = \"Java\";";

        dialogues[10][0] = "To be a noble creature, wise and kind, Requires a blend of wisdom and mind. \nFor wisdom guides with gentle grace, While intellect sets a swift pace. \nIn the depths of thought, the mind does dwell, Exploring truths that words can tell.";
        dialogues[10][1] = "But wisdom, deeper, from experience grown, In silent whispers, its truths are shown. \nA noble animal, with eyes that see, The beauty of life's vast tapestry. \nWith wisdom's compass and mind's keen sight, Navigating paths through day and night.";
        dialogues[10][2] = "In harmony, they dance and play, Guiding the steps along life's way. \nFor to be noble is to understand, The union of heart, head, and hand. \nSo let us strive, with wisdom's might, To walk with grace and inner light.";
        dialogues[10][3] = "For in the noble animal, we find, A reflection of the noblest kind.";

        dialogues[11][0] = "What is missing from this Java program? \npublic class LanguageFacts { \n \n    // Covers the history of the Java programming language \n \n}";

        dialogues[12][0] = "In Java, what is the purpose of leaving comments in code?";

        dialogues[13][0] = "In this moment, you've proven your worth, O Noble One, with wisdom's birth. \nYour mind, a fortress, strong and true, Envelops you in its golden hue. \nWith wisdom's cloak, you tread the path, Guided by hope, through shadow's wrath.";
        dialogues[13][1] = "Each step you take, with purpose clear, Brings you closer, ever near. \nThe light that shines within your soul, Leads you to your destined goal. \nThrough trials faced and battles won, You emerge as the chosen one.";
        dialogues[13][2] = "For in your heart, the flame burns bright, Illuminating the darkest night. \nWith wisdom's touch and mind's embrace, You journey forth with steadfast grace. \nSo onward, Noble One, with pride, Your destiny awaits, untied.";
        dialogues[13][3] = "May hope's sweet song forever sing, As you soar on wisdom's wing.";

        // DIALOGUE THAT PLAYER WILL READ ON THE PAPER
        dialogues[15][0] = "This language is called Java.\r\n" + //
                        "\r\n" + //
                        "Java started by the file HelloWorld.java. \r\nJava files have a .java extension. \r\n" + //
                        "\r\n" + //
                        "Inside HelloWorld.java, we had a class:\r\n" + //
                        "\r\n" + //
                        "public class HelloWorld {\r\n" + //
                        "\r\n" + //
                        "}";
        dialogues[15][1] = "We marked the domain of this concept using curly braces: {}. Syntax inside the curly braces is part of the class.\r\n" + //
                        "\r\n" + //
                        "Each file has one primary class named after the file. Our class name: HelloWorld and our file name: HelloWorld. Every word is capitalized.\r\n" + //
                        "\r\n" + //
                        "Inside the class we had a main() method which lists our program tasks:\r\n" + //
                        "\r\n" + //
                        "public static void main(String[] args) {\r\n" + //
                        "\r\n" + //
                        "}";
        dialogues[15][2] = "We marked the domain of this concept using curly braces: {}. Syntax inside the curly braces is part of the class.\r\n" + //
                        "\r\n" + //
                        "Each file has one primary class named after the file. Our class name: HelloWorld and our file name: HelloWorld. Every word is capitalized.\r\n" + //
                        "\r\n" + //
                        "Inside the class we had a main() method which lists our program tasks:\r\n" + //
                        "\r\n" + //
                        "public static void main(String[] args) {\r\n" + //
                        "\r\n" + //
                        "}";
        dialogues[15][3] = "After \"Hello World\" is printed, the output terminal creates a new line for the next statement to be outputted. This program will print each statement on a new line like so:\r\n" + //
                        "\r\n" + //
                        "Hello World\r\n" + //
                        "Today is a great day to code!\r\n" + //
                        "\r\n" + //
                        "We also can output information using System.out.print(). Notice that we’re using print(), not println(). Unlike System.out.println(), this type of print statement outputs everything on the same line. For example:\r\n" + //
                        "\r\n" + //
                        "System.out.print(\"Hello \");\r\n" + //
                        "System.out.print(\"World\");\r\n" + //
                        "\r\n" + //
                        "The above code will have the following output:\r\n" + //
                        "\r\n" + //
                        "Hello World";
        dialogues[16][0] = "Writing code is an exciting process of instructing the computer to complete fantastic tasks.\r\n" + //
                        "\r\n" + //
                        "Code is also read by people, and we want our intentions to be clear to humans just like we want our instructions to be clear to the computer.\r\n" + //
                        "\r\n" + //
                        "Fortunately, we’re not limited to writing syntax that performs a task. We can also write comments, notes to human readers of our code. These comments are not executed, so there’s no need for valid syntax within a comment.";
        dialogues[16][1] = "When comments are short we use the single-line syntax: //.\r\n" + //
                        "\r\n" + //
                        "// calculate customer satisfaction rating\r\n" + //
                        "\r\n" + //
                        "When comments are long we use the multi-line syntax: /* and */.\r\n" + //
                        "\r\n" + //
                        "/*\r\n" + //
                        "We chose to store information across multiple databases to\r\n" + //
                        "minimize the possibility of data loss. We'll need to be careful\r\n" + //
                        "to make sure it does not go out of sync!\r\n" + //
                        "*/";
        dialogues[17][0] = "As we saw with comments, reading code is just as important as writing code.\r\n" + //
                        "\r\n" + //
                        "We should write code that is easy for other people to read. Those people can be co-workers, friends, or even yourself!\r\n" + //
                        "\r\n" + //
                        "Java does not interpret whitespace, the areas of the code without syntax, but humans use whitespace to read code without difficulty.";
        dialogues[17][1] = "Functionally, these two code samples are identical:\r\n" + //
                        "\r\n" + //
                        "System.out.println(\"Java\");System.out.println(\"Lava\");System.out.println(\"Guava\");\r\n" + //
                        "\r\n" + //
                        "System.out.println(\"Java\");\r\n" + //
                        "\r\n" + //
                        "System.out.println(\"Lava\");\r\n" + //
                        "\r\n" + //
                        "System.out.println(\"Guava\");";
        dialogues[17][2] = "They will print the same text to the screen, but which would you prefer to read? Imagine if it was hundreds of instructions! Whitespace would be essential.\r\n" + //
                        "\r\n" + //
                        "Java does interpret semicolons. Semicolons are used to mark the end of a statement, one line of code that performs a single task.\r\n" + //
                        "\r\n" + //
                        "The only statements we’ve seen so far are System.out.println(\"My message!\");.\r\n" + //
                        "\r\n" + //
                        "Thank you for the information from Codecademy.";
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
        if(start == 9) {
            gp.gameState = gp.puzzleState;
            text1 = "double num = 5.5";
            text2 = "String str = \"Java\";";
            text3 = "int counter = 10;";
            text4 = "System.out.println(\"Meow\")";
            correctChoice = 1;
        }
        if(start == 11) {
            gp.gameState = gp.puzzleState;
            text1 = "javac LanguageFacts.java";
            text2 = "The curly braces.";
            text3 = "A single-line comment.";
            text4 = "The main() method.";
            correctChoice = 4;
        }
        if(start == 12) {
            gp.gameState = gp.puzzleState;
            text1 = "They are how words are printed.";
            text2 = "They are only present in complied code.";
            text3 = "They provide human readable notes.";
            text4 = "Checks that the compiler must pass.";
            correctChoice = 3;
        }
    }   

    public void startDialogue(Entity entity, int setNum) {

        gp.gameState = gp.dialogueState;
        gp.ui.p = (Player)entity;
        dialoguesSet = setNum;
    }
}
