public class AdvancedGamer extends Gamer {

    public AdvancedGamer(String nom, String prenom, int score) {
        super(nom, prenom, score);
    }

    @Override
    public String print() {
        return "Advanced gamer "+nom+" "+prenom+ " \n-score : "+score;
    }
}
