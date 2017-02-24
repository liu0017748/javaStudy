package DesignPatten.Command;

/**
 * Created by liu on 17/2/24.
 */
public class PlayCommand implements Command {
    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    public void execute() {
        myAudio.play();
    }
}
