public abstract class Game {
    protected StratigieGame sGame;
    protected String Keyword;
    public void setStratigie(StratigieGame sgame){
        this.sGame = sgame;
        Keyword = sGame.generateCode();
    }
    public abstract Gamer createGamer(String nom, String prenom, int score);
    public abstract Boolean Play();

}
