package ohm.softa.a03;

public class DeathState extends State{
    public DeathState(int duration){
        super(duration);
    }
    @Override
    State successor(Cat cat) {
        return null;
    }
}
