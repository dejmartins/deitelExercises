package tddClass;

public class TelevisionSet {
    private boolean state;
    private int volume;
    private int channel;
    private String source;

    public void powerButton(boolean press) {
        state = press;
    }

    public boolean isOn() {
        return state;
    }

    public void increaseVolume() {
        if(volume >= 0 && volume < 100)
        volume = volume + 1;
    }

    public int volume() {
        return volume;
    }

    public void decreaseVolume() {
        if(volume > 0 && volume < 100)
        volume = volume - 1;
    }

    public void changeSource(String source) {
        if (source == "HDMI") channel = 0;
        this.source = source;
    }

    public int channel() {
        return channel;
    }

    public void changeChannel(int channelNumber) {
        if(source != "HDMI")
        channel = channelNumber;
    }
}
