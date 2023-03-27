package ohm.softa.a03;

public class DigestingState extends State{
    public DigestingState(int duration){
        super(duration);
        logger.info("I have nomsed the food");
    }
    @Override
    State successor(Cat cat) {
        return new PlayfulState(cat.getAwake());
    }
}
