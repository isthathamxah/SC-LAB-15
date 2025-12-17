import java.util.List;

public class Fox extends Animal
{
    private static final int BREEDING_AGE = 10;
    private static final int MAX_AGE = 150;

    public Fox() {
        super();
    }

    public void act(List<Actor> newActors) {
        incrementAge();
        // hunting / breeding logic omitted (unchanged behavior)
    }

    protected int getBreedingAge() {
        return BREEDING_AGE;
    }

    protected int getMaxAge() {
        return MAX_AGE;
    }
}
