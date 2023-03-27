package ohm.softa.a03;

public class PlayfulState extends State{
    public PlayfulState(int duration){
        super(duration - 10);
        logger.info("Getting in a playful mood!");
    }
    @Override
    State successor(Cat cat) {
        return new SleepingState(cat.getSleep());
    }
}
