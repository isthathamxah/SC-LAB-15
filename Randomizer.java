import java.util.Random;

public class Randomizer {
    private static final int SEED = 1111;
    private static Random sharedRandom = new Random(SEED);
    private static boolean useShared = true;

    public static Random getRandom() {
        return useShared ? sharedRandom : new Random();
    }

    public static void reset() {
        if(useShared) {
            sharedRandom = new Random(SEED);
        }
    }
}
