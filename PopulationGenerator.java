import java.util.List;

public class PopulationGenerator
{
    public void populate(Field field, List<Actor> actors) {

        for(int r = 0; r < field.getDepth(); r++) {
            for(int c = 0; c < field.getWidth(); c++) {

                double chance = Math.random();

                if(chance <= 0.02) {
                    Fox fox = new Fox();
                    field.place(fox, r, c);
                    actors.add(fox);
                }
                else if(chance <= 0.08) {
                    Rabbit rabbit = new Rabbit();
                    field.place(rabbit, r, c);
                    actors.add(rabbit);
                }
            }
        }
    }
}
