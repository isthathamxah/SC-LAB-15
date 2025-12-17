import java.util.ArrayList;
import java.util.List;

public class Simulator
{
    private Field field;
    private List<Actor> actors;
    private PopulationGenerator generator;

    public Simulator() {
        Randomizer.reset();
        field = new Field(50, 50);
        actors = new ArrayList<>();
        generator = new PopulationGenerator();
        generator.populate(field, actors);
    }
}
