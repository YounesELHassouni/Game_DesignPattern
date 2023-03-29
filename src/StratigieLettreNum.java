public class StratigieLettreNum extends StratigieGame {
    private static StratigieLettreNum instance;
    private StratigieLettreNum(){}
    public static synchronized StratigieLettreNum getInstance(){
        if(instance==null)
            instance = new StratigieLettreNum();
        return instance;
    }
    @Override
    public String generateCode() {
        String key = "";
        char x;
        int nu;
        for (int i = 0; i < 4; i++) {
            nu = (int) (Math.random() * 100);
            if ( nu >= 48 && nu <= 57 || nu >= 65 && nu <= 90) {
                x = (char) nu;
                key += String.valueOf(x);
            } else
                i--;
        }
        return key;
    }
}
