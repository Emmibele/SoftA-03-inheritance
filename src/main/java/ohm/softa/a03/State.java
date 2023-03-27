package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();

    private int time;
    public int getTime() {
        return time;
    }

    private final int duration;
    public int getDuration(){
        return duration;
    }

    public State(int duration){
        this.duration = duration;
        
    }

    final State tick (Cat cat){
        time ++;
        if (time >= duration)
        {
            return successor(cat);
        }
        return this;
    }

    abstract State successor(Cat cat);
}
