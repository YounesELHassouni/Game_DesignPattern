public abstract class Gamer {
    protected String nom;
    protected String prenom;
    protected int score;

    public Gamer() {
    }
    public void augmentScor(Boolean b){
        if(b) {
            this.score++;
        }
        System.out.println(nom+" "+prenom+" votre score est: "+score);
    }
    public Gamer(String nom, String prenom, int score) {
        this.nom = nom;
        this.prenom = prenom;
        this.score = score;
    }
    public abstract String print();

}
