import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Music {
    
    
    private String name;
    private Clip sound;
 
    public Music(String filename) {
        name = filename;
        Clip sound = loadClip(filename);
    }
    
    public Clip loadClip( String filename ) {
        Clip sample = null;
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream( getClass().getResource( filename ) );
            sample = AudioSystem.getClip();
            sample.open( audioIn );
        } catch( Exception e ) {
            e.printStackTrace();
        }
        return in;
    }
    
    public String getName() {
        return name;
    }
    
    public Clip getSound() {
        return sound;
    }
}
