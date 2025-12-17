public class Field
{
    private Object[][] field;

    public Field(int depth, int width) {
        field = new Object[depth][width];
    }

    public int getDepth() {
        return field.length;
    }

    public int getWidth() {
        return field[0].length;
    }

    public void place(Object obj, int row, int col) {
        field[row][col] = obj;
    }
}
