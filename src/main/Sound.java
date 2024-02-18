package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import java.io.File;

public class Sound {
    private Clip clip;
    private String[] sound = new String[20];
    FloatControl fc;
    int volumeScale = 3;
    float volume;

    public Sound() {
        sound[0] = "res/sound/best-adventure-ever-122726.wav"; // playState
        sound[1] = "res/sound/let-the-mystery-unfold-122118.wav"; // title
        sound[2] = "res/sound/secrets-of-the-old-library-140000.wav"; // puzzle
        sound[3] = "res/sound/oh-disappointed-89251.wav"; // get the puzzle wrong
        sound[4] = "res/sound/success_bell-6776.wav"; // puzzle success
        sound[5] = "res/sound/success-fanfare-trumpets-6185.wav"; // last puzzle done
        sound[6] = "res/sound/switch-button-106349.wav"; // selected
        sound[7] = "res/sound/pause-89443.wav"; // pause
        sound[8] = "res/sound/unpause-106278.wav"; // unpause
        sound[9] = "res/sound/shooting-sound-fx-159024.wav"; // scroll
        sound[10] = "res/sound/inventory-open-94932.wav"; // inventory open
        sound[11] = "res/sound/inventory-close-94504.wav"; // inventory close
        sound[12] = "res/sound/unfold-a-map-46452.wav"; // paper open
        sound[13] = "res/sound/pageturn-102978.wav"; // next page
        sound[14] = "res/sound/paper-crinkle-80916.wav"; // paper close
        sound[15] = "res/sound/negative_beeps-6008.wav"; // gameover
    }

    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File(sound[i]));
            clip = AudioSystem.getClip();
            clip.open(ais);
            fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            checkVolume();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        if (clip != null) {
            clip.start();
        } else {
            System.err.println("Clip is not initialized. Call setFile() before calling play().");
        }
    }

    public void loop() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } else {
            System.err.println("Clip is not initialized. Call setFile() before calling loop().");
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
        } else {
            System.err.println("Clip is not initialized. Call setFile() before calling stop().");
        }
    }

    public void checkVolume() {

        switch (volumeScale) {
            case 0: volume = -80f; break;
            case 1: volume = -20f; break;
            case 2: volume = -12f; break;
            case 3: volume = -5f; break;
            case 4: volume = 1f; break;
            case 5: volume = 6f; break;
        }
        fc.setValue(volume);
    }
}
