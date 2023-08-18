public class AudioChild extends AudioTVParent {

    public AudioChild() { }
    
    public AudioChild(boolean power, int volumn) {
//    	this.power = power;
//    	this.volumn = volumn;
    }
    
    public void tune() {
    	String sOnOff = power ?  "ha ha ha..." : "turn it on";
        System.out.println(sOnOff);
    }
}