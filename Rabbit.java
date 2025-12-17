import java.util.List;

public class Rabbit extends Animal
{
    private static final int BREEDING_AGE = 5;
    private static final int MAX_AGE = 40;

    public Rabbit() {
        super();
    }

    public void act(List<Actor> newActors) {
        incrementAge();
        // breeding logic omitted (unchanged behavior)
    }

    protected int getBreedingAge() {
        return BREEDING_AGE;
    }

    protected int getMaxAge() {
        return MAX_AGE;
    }
}
