package DesignPatten.Command;

/**
 * Created by liu on 17/2/24.
 */
public class StopCommand implements Command{
    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    public void execute() {
        myAudio.stop();
    }
}
