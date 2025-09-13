
/**
 * Create tunes, answers Question 46 onwards (except Question 51 and 52)
 *
 * @author Cristina Arnoldo
 * @version 1.0
 */
public class TuneCreator
{
    private MidiPlayer player;

    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        player = new MidiPlayer();
    }

    /**
     * Create and play a tune
     */
    public void createAndPlay()
    {
        SimpleTune tune = new SimpleTune();
        
        tune.addNote("C4", 4);
        tune.addNote("D4", 4);
        tune.addNote("E4", 4);
        tune.addNote("F4", 4);
        tune.addNote("G4", 4);
        tune.addNote("A4", 4);
        tune.addNote("B4", 4);
        tune.addNote("C5", 8);
        
        tune.setInstrument(10);
        player.playTune(tune);
    }
}