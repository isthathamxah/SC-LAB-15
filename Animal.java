public abstract class Animal implements Actor
{
    protected int age;
    protected boolean alive;

    public Animal() {
        age = 0;
        alive = true;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        age = value;
    }

    public boolean canBreed() {
        return age >= getBreedingAge();
    }

    protected void incrementAge() {
        age++;
        if(age > getMaxAge()) {
            alive = false;
        }
    }

    protected int getRandomAgeIncrement() {
        return Randomizer.getRandom().nextInt(5);
    }

    protected abstract int getBreedingAge();
    protected abstract int getMaxAge();
}
