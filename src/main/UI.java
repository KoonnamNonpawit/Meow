package main;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;
import entity.Player;
import object.OBJ_Paper;

public class UI {
    
    GamePanel gp;
    Graphics2D g2;
    Font arial_40;
    BufferedImage paperImage;
    public String message = "";
    boolean messageOn = false;
    int messageCounter = 0;
    public boolean gameFinished = false;
    public String currentDialogue = "";
    int subState = 0;
    public int commandNum = 0;
    public int commandPCNum = 0;
    public int commandPRNum = 0;
    public int slotCol = 0;
    public int slotRow = 0;

    public Player p;
    public Entity entity = new Entity();
    public OBJ_Paper paper;

    int index;
    public int j;

    // Ending
    public int sceneNum ;
    public int scenePhase = 0;
    int counter = 0;
    float alpha = 0f;
    int y;
    String endCredit;

    BufferedImage img;

    public UI(GamePanel gp) {
        this.gp = gp;

        arial_40 = new Font("Arial", Font.PLAIN, 40);
        paper = new OBJ_Paper();
        paperImage = paper.image;
    }

    public void showMessage(String text) {

        //show message on the left of the screen
        message = text;
        messageOn = true;
        
    }

    public void draw(Graphics2D g2) {

        this.g2 = g2;

        // TITLE STATE
        if(gp.gameState == gp.titleState) {
            drawTitleScreen();  
        }

        // PLAY STATE
        if(gp.gameState == gp.playState) {
            if(messageOn == true) {
                g2.setColor(Color.white);
                g2.drawString(message, 20 * gp.scale, 20 * gp.scale);

                messageCounter++;

                if(messageCounter > 120) {
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }

        // PAUSE STATE
        if(gp.gameState == gp.pauseState) {
            drawPauseScreen();
        }

        // DIALOGUE STATE
        if(gp.gameState == gp.dialogueState) {
            drawDialogueScreen();
        }

        // OPTION STATE
        if(gp.gameState == gp.optionsState) {
            drawOptionsScreen();
        }

        // CHARACTER STATE
        if(gp.gameState == gp.characterState) {
            switch (subState) {
                case 0:
                    drawInventory();
                    if(gp.keyH.rPressed == true) {
                        subState = 1;
                        gp.keyH.rPressed = false;
                    } break;
                
                case 1:
                    drawInventory();
                    if(gp.player.inventory.get(index).name == "Paper") { //.name == "Paper"
                        drawReadPaperScreen();                     
                        drawTextPaperScreen((gp.player.inventory.get(index)).getPaperNumber());
                        if(gp.keyH.rPressed == true) {
                            subState = 0;
                            gp.keyH.rPressed = false;
                            j = 0;
                        }
                        if(gp.keyH.enterPressed == true) {
                            j++;
                        }
                    } break;
            }
        }

        // PUZZLE STATE
        if(gp.gameState == gp.puzzleState) {
            drawPuzzleScreen();
        }

        // GAME OVER STATE
        if(gp.gameState == gp.gameOverState) {
            drawGameOverScreen();
        }

        // ENDING STATE
        if(gp.gameState == gp.gameEndingState) {
            drawEnding();
        }
    }

    public void drawTitleScreen() {

        // SET BACKGROUND COLOR
        // g2.setColor(new Color(0,0,0));
        // g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        // DRAW IMAGE AS BACKGROUND
        try{
            img = ImageIO.read(new FileInputStream("res/background/Start_Page.png"));
            g2.drawImage(img, 0, 0, 16*gp.tileSize, 9*gp.tileSize, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TITLE NAME
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 96F));
        String text = "MEOW";
        int x = getXforCenteredText(text);
        int y = gp.tileSize*2;

        // SHADOW (draw same text but shift right 5px)
        g2.setColor(new Color(64,68,62,150));
        g2.drawString(text, x+5, y+5);

        // MAIN TITLE COLOR
        g2.setColor(new Color(64,68,62));
        g2.drawString(text, x, y);

        
        

        // MENU
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 48F));

        text = "NEW GAME";
        x = getXforCenteredText(text);
        y += gp.tileSize*2;
        g2.drawString(text, x, y);
        if(commandNum == 0) {
            g2.drawString(">", x-gp.tileSize, y);
        }

        text = "LOAD GAME";
        x = getXforCenteredText(text);
        y += gp.tileSize;
        g2.drawString(text, x, y);
        if(commandNum == 1) {
            g2.drawString(">", x-gp.tileSize, y);
        }

        text = "QUIT";
        x = getXforCenteredText(text);
        y += gp.tileSize;
        g2.drawString(text, x, y);
        if(commandNum == 2) {
            g2.drawString(">", x-gp.tileSize, y);
        }
    }
    
    public void drawPauseScreen() {

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 80F));
        String text = "PAUSED";
        int x = getXforCenteredText(text);
        int y = gp.screenHeight/2;

        g2.drawString(text, x, y);
    }

    public void drawDialogueScreen() {

        // WINDOW
        int x = gp.tileSize;
        int y = gp.tileSize*6;
        int width = gp.screenWidth - (x*2);
        int height = gp.tileSize*2;

        drawSubWindow(x, y, width, height);

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN,30));
        x += 32*2;
        y += 32*2;

        if(p.dialogues[p.dialoguesSet][p.dialoguesIndex] != null) {
            currentDialogue = p.dialogues[p.dialoguesSet][p.dialoguesIndex];

            if(gp.keyH.enterPressed == true) {

                if(gp.gameState == gp.dialogueState) {

                    p.dialoguesIndex++;
                    gp.keyH.enterPressed = false;
                }
            }
        }
        else {
            p.dialoguesIndex = 0;

            if(gp.gameState == gp.dialogueState) {
                gp.gameState = gp.playState;
            }
        }

        for(String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 40;
        }
    }

    public void drawDialogueScreenForPaper(int i) {
        p = new Player(gp, null);
        // WINDOW
        int x = gp.tileSize + 50;
        int y = gp.tileSize + 40;
        
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 20));
        x += 16;
        y += 8;

        if(p.dialogues[i][j] != null) {
            currentDialogue = p.dialogues[i][j];
        }
        else {
            j = 0;
        }
        

        for(String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 40;
        }
    }

    public void drawDialogueScreen_Resizable(int posi_x, int posi_y, int screen_width, int screen_height) {

        // WINDOW
        int x = posi_x;
        int y = posi_y;
        int width = screen_width;
        int height = screen_height;

        drawSubWindow(x, y, width, height);

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN,30));
        x += 32*2;
        y += 32*2;

        if(p.dialogues[p.dialoguesSet][p.dialoguesIndex] != null) {
            currentDialogue = p.dialogues[p.dialoguesSet][p.dialoguesIndex];

            if(gp.keyH.enterPressed == true) {

                if(gp.gameState == gp.dialogueState) {

                    p.dialoguesIndex++;
                    gp.keyH.enterPressed = false;
                }
            }
        }
        else {
            p.dialoguesIndex = 0;

            if(gp.gameState == gp.dialogueState) {
                gp.gameState = gp.playState;
            }
        }

        for(String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 40;
        }
    }

    public void drawReadPaperScreen() {

        BufferedImage img;
      
        try {

            img = ImageIO.read(new FileInputStream("res/object/ObjPE.png"));
            int newWidth = 53*14;
            int newHeight = 55*14;
            Image newImage = img.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);
            g2.drawImage(newImage,40, 40, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void drawTextPaperScreen(int paperNumber) {

        switch (paperNumber) {
            case 1: drawDialogueScreenForPaper(15); break;
            case 2: drawDialogueScreenForPaper(16); break;
            case 3: drawDialogueScreenForPaper(17); break;   
        }

    }

    public void drawSubWindow(int x, int y, int width, int height) {
        
        Color c = new Color(110,102,95,200);
        g2.setColor(c);
        g2.fillRoundRect(x, y, width, height, 35, 35);

        c = new Color(86,53,33);
        g2.setColor(c);
        g2.setStroke(new BasicStroke(5));
        g2.drawRoundRect(x+5, y+5, width-10, height-10, 25, 25);
    }

    public void drawOptionsScreen() {

        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(32F));

        // SUB WINDOW
        int frameX = (gp.tileSize*6)-30;
        int frameY = gp.tileSize;
        int frameWidth = gp.tileSize*6;
        int frameHeight = (gp.tileSize*8)-40;
        drawSubWindow(frameX, frameY, frameWidth, frameHeight);

        switch (subState) {
            case 0: option_top(frameX, frameY); break;
            case 1: option_fullScreenNotification(frameX, frameY); break;
            case 2: option_control(frameX, frameY); break;
            case 3: option_endGameConfirmation(frameX, frameY); break;
        }

        gp.keyH.enterPressed = false;
    }

    public void option_top(int frameX, int frameY) {

        int textX;
        int textY;

        // TITLE
        String text = "Option";
        textX = getXforCenteredText(text);
        textY = frameY + gp.tileSize;
        g2.drawString(text, textX+100, textY);

        // FULL SCREEN ON/OFF
        textX = frameX + gp.tileSize;
        textY += gp.tileSize*0.5;
        g2.drawString("Full Screen", textX, textY);
        if(commandNum == 0) {
            g2.drawString(">", textX-25, textY);
            if(gp.keyH.enterPressed == true) {
                if(gp.fullScreenOn == false) {
                    gp.fullScreenOn = true;
                }
                else if(gp.fullScreenOn == true) {
                    gp.fullScreenOn = false;
                }
                subState = 1;
            }
        }

        // MUSIC
        textY += gp.tileSize*0.5;
        g2.drawString("Music", textX, textY);
        if(commandNum == 1) {
            g2.drawString(">", textX-25, textY);
        }

        // SE
        textY += gp.tileSize*0.5;
        g2.drawString("SE", textX, textY);
        if(commandNum == 2) {
            g2.drawString(">", textX-25, textY);
        }

        // CONTROL
        textY += gp.tileSize*0.5;
        g2.drawString("Control", textX, textY);
        if(commandNum == 3) {
            g2.drawString(">", textX-25, textY);
            if(gp.keyH.enterPressed == true) {
                subState = 2;
                commandNum = 0;
            }
        }

        // QUIT
        textY += gp.tileSize*0.5;
        g2.drawString("Back to Title", textX, textY);
        if(commandNum == 4) {
            g2.drawString(">", textX-25, textY);
            if(gp.keyH.enterPressed == true) {
                subState = 3;
                commandNum = 0;
            }
        }

        // BACK
        textY += gp.tileSize*1.5;
        g2.drawString("Back", textX, textY);
        if(commandNum == 5) {
            g2.drawString(">", textX-25, textY);
            if(gp.keyH.enterPressed == true) {
                gp.gameState = gp.playState;
            }
        }

        // FULL SCREEN CHECK BOX
        textX = frameX + gp.tileSize*5;
        textY = frameY + gp.tileSize*3 - 160;
        g2.setStroke(new BasicStroke(3));
        g2.drawRect(textX - 45, textY, 24, 24);
        if(gp.fullScreenOn == true) {
            g2.fillRect(textX - 45, textY, 24, 24);
        }

        // MUSIC VOLUME
        textY += gp.tileSize*0.5;
        g2.drawRect(textX - 45, textY, 120, 24); // 120/5 = 24
        int volumeWidth = 24 * gp.music.volumeScale;
        g2.fillRect(textX - 45, textY, volumeWidth, 24);

        // SE VOLUME
        textY += gp.tileSize*0.5;
        g2.drawRect(textX - 45, textY, 120, 24);
        volumeWidth = 24 * gp.se.volumeScale;
        g2.fillRect(textX -45, textY, volumeWidth, 24);

        // save setting whenever this function were called
        gp.config.saveConfig();
    }

    public void option_fullScreenNotification(int frameX, int frameY) {

        int textX = frameX + gp.tileSize;
        int textY = frameY + gp.tileSize*3;

        currentDialogue = "The change will take \neffect after restarting \nthe game.";

        for(String line : currentDialogue.split("\n")) {
            g2.drawString(line, textX, textY);
            textY += 40;
        }

        // BACK
        textY = (int) (frameY + gp.tileSize*5);
        g2.drawString("Back", textX, textY);
        if(commandNum == 0) {
            g2.drawString(">", textX-25, textY);
            if(gp.keyH.enterPressed == true) {
                subState = 0;
            }
        }

    }

    public void option_control(int frameX, int frameY) {

        int textX;
        int textY;

        // TITLE
        String text = "Control";
        textX = getXforCenteredText(text);
        textY = frameY + gp.tileSize;
        g2.drawString(text, textX, textY);

        textX = frameX + gp.tileSize;
        textY += gp.tileSize;
        g2.drawString("Movement", textX, textY); textY += gp.tileSize;
        g2.drawString("Confirm", textX, textY); textY += gp.tileSize;
        g2.drawString("Pause", textX, textY); textY += gp.tileSize;
        g2.drawString("Options", textX, textY); textY += gp.tileSize;

        textX = frameX + gp.tileSize*6;
        textY = frameY + gp.tileSize*2;
        g2.drawString("WASD", textX-150, textY); textY += gp.tileSize;
        g2.drawString("ENTER", textX-150, textY); textY += gp.tileSize;
        g2.drawString("P", textX-150, textY); textY += gp.tileSize;
        g2.drawString("ESC", textX-150, textY); textY += gp.tileSize;

        // BACK
        textX = frameX + gp.tileSize;
        textY = frameY + gp.tileSize*9;
        g2.drawString("Back", textX, textY);
        if(commandNum == 0) {
            g2.drawString(">", textX-25, textY);
            if(gp.keyH.enterPressed == true) {
                subState = 0;
                commandNum = 3;
            }
        }
    }

    public void option_endGameConfirmation(int frameX, int frameY) {

        int textX = frameX + gp.tileSize;
        int textY = frameY + gp.tileSize*3;

        currentDialogue = "Quit the game and \nreturn to the title screen?";

        for(String line: currentDialogue.split("\n")) {
            g2.drawString(line, textX, textY);
            textY += 40;
        }

        // YES
        String text = "Yes";
        textX = getXforCenteredText(text);
        textY += gp.tileSize*3;
        g2.drawString(text, textX, textY-100);
        if(commandNum == 0) {
            g2.drawString(">", textX-25, textY-100);
            if(gp.keyH.enterPressed == true) {
                gp.stopMusic();
                gp.playMusic(1);
                subState = 0;
                gp.gameState = gp.titleState;
            }
        }

        // NO
        text = "No";
        textX = getXforCenteredText(text);
        textY += gp.tileSize;
        g2.drawString(text, textX, textY-100);
        if(commandNum == 1) {
            g2.drawString(">", textX-25, textY-100);
            if(gp.keyH.enterPressed == true) {
                subState = 0;
                commandNum = 4;
            }
        }
    }

    // Fix later after done stable item
    public void drawInventory() {

        // FRAME
        int frameX = gp.tileSize*9;
        int frameY = gp.tileSize;
        int frameWidth = gp.tileSize*6;
        int frameHeight = gp.tileSize*5;
        drawSubWindow(frameX, frameY, frameWidth, frameHeight);

        // SLOT
        final int slotXstart = frameX + 20;
        final int slotYstart = frameY + 20;
        int slotX = slotXstart;
        int slotY = slotYstart;
        int slotSize = gp.tileSize;

        // DRAW PLAYER'S ITEMS
        for(int i = 0; i < gp.player.inventory.size(); i++) {

            index = i;
            g2.drawImage(gp.player.inventory.get(i).image, slotX, slotY, null);

            slotX += slotSize;

            if(i == 4 || i == 9 || i == 14) {
                slotX = slotXstart;
                slotY += slotSize;
            }

        }

        // CURSOR
        int cursorX = slotXstart + (slotSize * slotRow);
        int cursorY = slotYstart + (slotSize * slotCol);
        int cursorWidth = gp.tileSize;
        int cursorHeight = gp.tileSize;

        // DRAW CURSOR
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(3));
        g2.drawRoundRect(cursorX, cursorY, cursorWidth, cursorHeight, 10, 10);

        // DESCRIPTION FRAME
        int dFrameX = frameX;
        int dFrameY = frameY + frameHeight;
        int dFrameWidth = frameWidth;
        int dFrameHeight = gp.tileSize*2;

        // DRAW DESCRIPTION TEXT
        int textX = dFrameX + 20;
        int textY = dFrameY + 40;
        g2.setFont(g2.getFont().deriveFont(28F));
        int itemIndex = getItemIndexOnSlot();
        if(itemIndex < gp.player.inventory.size()) {

            drawSubWindow(dFrameX, dFrameY, dFrameWidth, dFrameHeight);

            for(String line: gp.player.inventory.get(itemIndex).description.split("\n")) {
                g2.drawString(line, textX, textY);
                textY += 32;
            }
        }

    }

    public void drawPuzzleScreen() {

        switch (subState) {
            case 0: puzzle_select(); break;
        }

        gp.keyH.enterPressed = false;
    }

    public void puzzle_select() {

        p.dialoguesSet = p.start;
        drawDialogueScreen_Resizable(gp.tileSize, gp.tileSize, gp.tileSize*14, gp.tileSize*7);

        int frameX = (gp.tileSize) + (10*gp.scale);
        int frameY = (gp.tileSize*6) - (10*gp.scale);
        int frameWidth = (gp.tileSize*14) - (2*10*gp.scale);
        int frameHeight = gp.tileSize*2;
        drawSubWindow(frameX, frameY, frameWidth, frameHeight);


        g2.drawString(p.text1, frameX + (30 * gp.scale), frameY + (20 * gp.scale));
        if(gp.ui.commandPRNum == 0 && gp.ui.commandPCNum == 0) {
            g2.drawString(">", frameX + (20 * gp.scale), frameY + (20 * gp.scale));
        }

        g2.drawString(p.text2, frameX + (225 * gp.scale), frameY + (20 * gp.scale));
        if(gp.ui.commandPRNum == 0 && gp.ui.commandPCNum == 1) {
            g2.drawString(">", frameX + (215 * gp.scale), frameY + (20 * gp.scale));
        }

        g2.drawString(p.text3, frameX + (30 * gp.scale), frameY + (50 * gp.scale));
        if(gp.ui.commandPRNum == 1 && gp.ui.commandPCNum == 0) {
            g2.drawString(">", frameX + (20 * gp.scale), frameY + (50 * gp.scale));
        }

        g2.drawString(p.text4, frameX + (225 * gp.scale), frameY + (50 * gp.scale));
        if(gp.ui.commandPRNum == 1 && gp.ui.commandPCNum == 1) {
            g2.drawString(">", frameX + (215 * gp.scale), frameY + (50 * gp.scale));
        }
    }

    public void drawGameOverScreen() {

        g2.setColor(new Color(0, 0, 0, 100));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        int x;
        int y;
        String text;
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 80));

        text = "You have not passed our test.";
        // Shadow
        g2.setColor(Color.black);
        x = getXforCenteredText(text);
        y = gp.tileSize*2;
        g2.drawString(text, x, y);
        // Mains
        g2.setColor(Color.white);
        g2.drawString(text, x-5, y-5);

        text = "The path of hope will be extinguished forever.";
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 60));
        // Shadow
        g2.setColor(Color.black);
        x = getXforCenteredText(text);
        y = (gp.tileSize*2) + 70;
        g2.drawString(text, x, y);
        // Mains
        g2.setColor(Color.white);
        g2.drawString(text, x-5, y-5);

        // Start over
        g2.setFont(g2.getFont().deriveFont(50F));
        text = "Start Over Again";
        x = getXforCenteredText(text);
        y += gp.tileSize*4;
        g2.drawString(text, x, y);
        if(commandNum == 0) {
            g2.drawString(">", x-40, y);
        }

        // Back to the title screen
        text = "Quit";
        x = getXforCenteredText(text);
        y += 80;
        g2.drawString(text, x, y);
        if(commandNum == 1) {
            g2.drawString(">", x-40, y);
        }

    }

    public int getItemIndexOnSlot() {
        int itemIndex = slotRow + (slotCol*5);
        return itemIndex;
    }

    public int getXforCenteredText(String text) {

        int length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.screenWidth/2 - length/2;
        return x;
    }

    public void drawEnding() {

        scene_ending();
    }

    public void scene_ending() {
        if(scenePhase == 0) {
            gp.stopMusic();
            scenePhase++;
        }
        if(scenePhase == 1) {
            // Display dialogues
            // gp.ui.drawDialogueScreen();
            scenePhase++;
        }
        if(scenePhase == 2) {
            // Play the fanfare
            gp.playSE(16);
            scenePhase++;
        }
        if(scenePhase == 3) {
            // Wait until the sound effect ends
            if(counterReached(300) == true) {
                scenePhase++;
            }
        }
        if(scenePhase == 4) {
            // The screen get darker
            alpha += 0.005f;
            if(alpha > 1f) {
                alpha = 1f;
            }
            drawBlackBackground(alpha);

            if(alpha == 1f) {
                alpha = 0;
                scenePhase++;
            } 
        }
        if(scenePhase == 5) {

            drawBlackBackground(1f);

            alpha += 0.005f;
            if(alpha > 1f) {
                alpha = 1f;
            }

            String text = "You have passed all the trials. \nNow you have proven yourself worthy \nand qualified to be a noble creature, not a beast. \nWishing you the best of luck.";
            drawString(alpha, 38f, 200, text, 70);

            if(counterReached(780) == true) {
                gp.stopSE();
                gp.playSE(17);
                gp.playMusic(0);
                scenePhase++;
            }
        }
        if(scenePhase == 6) {

            drawBlackBackground(1f);

            drawString(1f, 120f, gp.screenHeight/2, "MEOW", 50);

            if(counterReached(480) == true) {
                scenePhase++;
            }
        }
        if(scenePhase == 7) {

            drawBlackBackground(1f);

            endCredit = "Program \nNonpawit Jantaros 66050780 \nNantikarn Kaewlodla 66050803 \nPannathorn Nobparat 66050858 \nArt \nNonpawit Jantaros 66050780 \nNantikarn Kaewlodla 66050803 \nMusic \nPannathorn Nobparat 66050858 \n\n\n\n\n\n\n\n\n\n\n\n\nSpecial Thanks \nCodecademy \nOpenGameArt.org \nPixabay \nFreeconvert \nChatGPT \nMachinetranslation \nCainos \nFreepik \nRyiSnow \nAj.Suntana Oudomying \n\n\n\n\n\nThank you for playing!";

            y = gp.tileSize*2;
            drawString(1f, 38f, y, endCredit, 60);

            if(counterReached(480) == true) {
                scenePhase++;
            }
        }
        if(scenePhase == 8) {

            drawBlackBackground(1f);

            // Scrolling the creadit
            y--;
            drawString(1f, 38f, y, endCredit, 60);

            if(counterReached(2400) == true) {
                scenePhase++;
            }
        }
        if(scenePhase == 9) {
            gp.gameState = gp.titleState;
        }
    }
    public boolean counterReached(int target) {

        boolean counterReached = false;

        counter++;
        if(counter > target) {
            counterReached = true;
            counter = 0;
        }

        return counterReached;
    }
    public void drawBlackBackground(float alpha) {

        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
        g2.setColor(Color.black);
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1f));
    }

    public void drawString(float alpha, float fontSize, int y, String text, int lineHeight) {

        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(fontSize));

        for(String line: text.split("\n")) {
            int x = getXforCenteredText(line);
            g2.drawString(line, x ,y);
            y+= lineHeight;
        }
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1f));
    }
}

