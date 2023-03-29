

public abstract class GamerDecorator extends Gamer {
    protected Gamer gamer ;
    public GamerDecorator(Gamer g) {
        super();
        this.gamer=g;
    }
    public abstract String print();
}
