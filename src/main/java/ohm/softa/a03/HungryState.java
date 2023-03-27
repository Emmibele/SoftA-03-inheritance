package ohm.softa.a03;

public class HungryState extends State{
    public HungryState(int duration){
        super(duration);
        logger.info("Yoan... getting hungry!");
    }
    @Override
    State successor(Cat cat) {
        if(getTime() >= getDuration()){
            return new DeathState();
        }
        return new DigestingState(cat.getDigest());
    }

    State feed(Cat cat){
		logger.info("You feed the cat...");
        return new DigestingState(cat.getDigest());
    }
}
