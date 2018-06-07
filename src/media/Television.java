package media;

public class Television {

    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn = true;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = true;

    }

    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;

    }

    public void printMainAttributes() {

        System.out.println("Trenutna jacina je:" +getVolume());
        System.out.println("Trrenutna stanica je:" +getCurrentProgram());
        System.out.println("Radio je ukljucen:");

    }
    
    
    public void showData () {
        System.out.println("Trenutna jacina je:" +getVolume());
        System.out.println("Trrenutna program je:" +getCurrentProgram());
        System.out.println("Radio je ukljucen:");

        
        
        
    }
}
