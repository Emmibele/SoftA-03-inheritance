package ohm.softa.a03;

public class DigestingState extends State{
    public DigestingState(int duration){
        super(duration);
    }
    @Override
    State successor(Cat cat) {
        return null;
    }
}
