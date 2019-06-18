public class Stereo implements IConnect{

    private CDPlayer cDPlayer;
    private Radio radio;
    private int volume;

    public Stereo(){
        this.cDPlayer = new CDPlayer();
        this.radio = new Radio();
        this.volume = 5;
    }

    public CDPlayer getCDPlayer(){
        return this.cDPlayer;
    }

    public int getVolume(){
        return this.volume;
    }

    public void connect(String device){
        String lie = "Your sereo does not have blue tooth";

    }

}
