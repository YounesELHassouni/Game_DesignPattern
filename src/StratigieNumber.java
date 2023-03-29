public class StratigieNumber extends StratigieGame {
    private static StratigieNumber instance;
    private StratigieNumber(){}
    public static synchronized StratigieNumber getInstance(){
        if(instance==null)
            instance = new StratigieNumber();
        return instance;
    }

    @Override
    public String generateCode() {
        int i;
        StringBuilder numbre = new StringBuilder();
        for (int j = 0; j < 4; j++) {
            i = (int) (Math.random() * 10);
            numbre.append(i);
        }
        return numbre.toString();
    }
}
