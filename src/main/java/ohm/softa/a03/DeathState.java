package ohm.softa.a03;

public class DeathState extends State{
    public DeathState(){
        super(0);
        logger.info("I've starved for a too long time...good bye...");
    }
    @Override
    State successor(Cat cat) {
        return this;
    }
}
