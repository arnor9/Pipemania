package vinnsla;

public class Pipemania {
    private int Stig;
    private static final int F = 5;
    private final Pipa[][] pipulogn = new Pipa[F][F];

    public Pipemania() {
        Stig = 0;
    }

    public int getStig() {
        return Stig;
    }

    public void setStig(int s) {
        Stig = s;
    }

    // public BooleanExpression stigProperty() {
    //}
}
