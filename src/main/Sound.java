package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import java.io.File;

public class Sound {
    private Clip clip;
    private String[] sound = new String[10];
    FloatControl fc;
    int volumeScale = 3;
    float volume;

    public Sound() {
        sound[0] = "res/sound/best-adventure-ever-122726.wav";
        sound[1] = "res/sound/let-the-mystery-unfold-122118.wav";
        sound[2] = "res/sound/secrets-of-the-old-library-140000.wav";
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
