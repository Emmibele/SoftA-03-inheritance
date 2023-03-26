package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();

    private int time;
    public int getTime() {
        return time;
    }

    private int finalDuration; //but what's it doing
    public int getDuration(){
        return finalDuration;
    }

    public State(int duration){
        finalDuration = duration;
    }
    final State tick (Cat cat){
        return null;
    }
    abstract State successor(Cat cat);
}
