package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import object.OBJ_Paper;

public class UI {
    
    GamePanel gp;
    Graphics2D g2;
    Font arial_40;
    BufferedImage paperImage;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;
    public String currentDialogue = "";
    int subState = 0;

    public int commandNum = 0;


    public UI(GamePanel gp) {
        this.gp = gp;

        arial_40 = new Font("Arial", Font.PLAIN, 40);
        OBJ_Paper paper = new OBJ_Paper();
        paperImage = paper.image;
    }

    public void showMessage(String text) {

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
            // Do playState Stuff later
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
    }

    public void drawTitleScreen() {

        // SET BACKGROUND COLOR
        g2.setColor(new Color(0,0,0));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        // TITLE NAME
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 96F));
        String text = "MEOW";
        int x = getXforCenteredText(text);
        int y = gp.tileSize*3;

        // SHADOW (draw same text but shift right 5px)
        g2.setColor(Color.gray);
        g2.drawString(text, x+5, y+5);

        // MAIN TITLE COLOR
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        // DRAW IMAGE AS BACKGROUND MAYBE

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

        text = "OPTION";
        x = getXforCenteredText(text);
        y += gp.tileSize;
        g2.drawString(text, x, y);
        if(commandNum == 2) {
            g2.drawString(">", x-gp.tileSize, y);
        }

        text = "QUIT";
        x = getXforCenteredText(text);
        y += gp.tileSize;
        g2.drawString(text, x, y);
        if(commandNum == 3) {
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

        for(String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y += 40;
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
        int frameX = gp.tileSize*6;
        int frameY = gp.tileSize;
        int frameWidth = gp.tileSize*6;
        int frameHeight = gp.tileSize*8;
        drawSubWindow(frameX, frameY, frameWidth, frameHeight);

        switch (subState) {
            case 0: option_top(frameX, frameY); break;
            case 1: break;
            case 2: break;
        }
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

        // MUSIC
        textY += gp.tileSize*0.5;
        g2.drawString("Music", textX, textY);

        // SE
        textY += gp.tileSize*0.5;
        g2.drawString("SE", textX, textY);

        // CONTROL
        textY += gp.tileSize*0.5;
        g2.drawString("Control", textX, textY);

        // QUIT
        textY += gp.tileSize*0.5;
        g2.drawString("QUIT", textX, textY);

        // BACK
        textY += gp.tileSize*1.5;
        g2.drawString("Back", textX, textY);
    }

    public int getXforCenteredText(String text) {

        int length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.screenWidth/2 - length/2;
        return x;
    }
}

