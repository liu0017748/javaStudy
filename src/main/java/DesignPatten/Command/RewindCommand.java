package DesignPatten.Command;

/**
 * Created by liu on 17/2/24.
 */
public class RewindCommand implements Command{
    private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    public void execute() {
        myAudio.rewind();
    }
}
