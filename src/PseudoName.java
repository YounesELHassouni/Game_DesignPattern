
public class PseudoName extends GamerDecorator {
    protected String nomPseudo;

    public PseudoName(String nomPseudo, Gamer gamer) {
        super(gamer);
        this.nomPseudo=nomPseudo;

    }

    @Override
    public String print() {
        return this.gamer.print()+"\n-Pseudo Name :"+nomPseudo;
    }
}
