package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    GamePanel gp;
    public boolean upPressed, downPressed, leftPressed,
                    rightPressed,enterPressed;

    // DEBUG
    boolean showDebugText = false;

    public KeyHandler(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code = e.getKeyCode();

        if(gp.gameState == gp.titleState) {
            titleState(code);
        }
        else if(gp.gameState == gp.playState) {
            playState(code);
        }
        else if(gp.gameState == gp.pauseState) {
            pauseState(code);
        }
        else if(gp.gameState == gp.optionsState) {
            optionsState(code);
        }
        else if(gp.gameState == gp.dialogueState) {
            dialogueState(code);
        }
    }

    // PLAY STATE
    public void playState(int code) {
            
        if (code == KeyEvent.VK_W) {
            upPressed = true;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = true;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = true;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = true;
        }
        if (code == KeyEvent.VK_P) {
            gp.gameState = gp.pauseState;
        }
        if (code == KeyEvent.VK_ENTER) {
            enterPressed = true;
        }
        if (code == KeyEvent.VK_ESCAPE) {
            gp.gameState = gp.optionsState;
        }
        
        // DEBUG
        if(code == KeyEvent.VK_F3) {
            if(showDebugText == false) {
                showDebugText = true;
            }
            else if(showDebugText == true) {
                showDebugText = false;
            }
        }
        if(code == KeyEvent.VK_F5) {
            gp.tileM.loadMap("res/maps/maps.txt");
        }
    }

    public void titleState(int code) {
        if (code == KeyEvent.VK_W) {
            gp.ui.commandNum--;
            if(gp.ui.commandNum < 0) {
            gp.ui.commandNum = 3;
            }
        }
        if (code == KeyEvent.VK_S) {
            gp.ui.commandNum++;
            if(gp.ui.commandNum > 3) {
                gp.ui.commandNum = 0;
            }
        }
        if (code == KeyEvent.VK_ENTER) {
            if(gp.ui.commandNum == 0) {
                gp.gameState = gp.playState;
                gp.stopMusic();
                gp.playMusic(0);
            }
            if(gp.ui.commandNum == 1) {
                // LOAD GAME add later
            }
            if(gp.ui.commandNum == 2) {
                // OPTION add later
            }
            if(gp.ui.commandNum == 3) {
                System.exit(0);
            }
        }        
    }

    public void pauseState(int code) {
        if(gp.gameState == gp.pauseState) {
            if(code == KeyEvent.VK_P) {
                gp.gameState = gp.playState;
            }
        }
    }

    public void dialogueState(int code) {
        if(gp.gameState == gp.dialogueState) {
            if(code == KeyEvent.VK_ENTER) {
                gp.gameState = gp.playState;
            }
        }
    } 
        
    public void optionsState(int code) {
        if(code == KeyEvent.VK_ESCAPE) {
            gp.gameState = gp. playState;
        }
        if(code == KeyEvent.VK_ENTER) {
            enterPressed = true;
        }

        int maxCommandNum = 0;
        switch (gp.ui.subState) {
            case 0: maxCommandNum = 5; break;
            case 3: maxCommandNum = 1; break;
        }
        if(code == KeyEvent.VK_W) {
            gp.ui.commandNum--;
            if(gp.ui.commandNum < 0) {
                gp.ui.commandNum = maxCommandNum;
            }
        }
        if(code == KeyEvent.VK_S) {
            gp.ui.commandNum++;
            if(gp.ui.commandNum > maxCommandNum) {
                gp.ui.commandNum = 0;
            }
        }
        if(code == KeyEvent.VK_A) {
            if(gp.ui.subState == 0) {
                if(gp.ui.commandNum == 1 && gp.music.volumeScale > 0) {
                    gp.music.volumeScale--;
                    gp.music.checkVolume();
                }
                if(gp.ui.commandNum == 2 && gp.se.volumeScale > 0) {
                    gp.se.volumeScale--;
                }
            }
        }
        if(code == KeyEvent.VK_D) {
            if(gp.ui.subState == 0) {
                if(gp.ui.commandNum == 1 && gp.music.volumeScale < 5) {
                    gp.music.volumeScale++;
                    gp.music.checkVolume();
                }
                if(gp.ui.commandNum == 2 && gp.se.volumeScale  < 5) {
                    gp.se.volumeScale++;
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = false;
        }
    }
    
}
