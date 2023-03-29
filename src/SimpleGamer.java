public class SimpleGamer extends Gamer {

    public SimpleGamer(String nom, String prenom, int score) {
        super(nom, prenom, score);
    }

    @Override
    public String print() {
        return "Simple gamer "+nom+" "+prenom+ " \n-score : "+score;
    }
}
