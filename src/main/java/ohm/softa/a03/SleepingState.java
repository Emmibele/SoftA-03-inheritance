package ohm.softa.a03;

public class SleepingState extends State{
    public SleepingState(int duration){
        super(duration);
        logger.info("Yoan... getting tired!");
    }

    @Override
    State successor(Cat cat) {
        return new HungryState(cat.getAwake());
    }
}
