import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StratigieLettre extends StratigieGame {
    private static StratigieLettre instance;
    private StratigieLettre(){}
    public static synchronized StratigieLettre getInstance(){
        if(instance==null)
            instance = new StratigieLettre();
        return instance;
    }
    private static List<String> ListKeyword = new ArrayList<>();


    public void addCode(String keyword) {
        ListKeyword.add(keyword);
    }

    @Override
    public String generateCode() {
        if (ListKeyword.size() != 0) {
            int nu;
            for (int i = 0; i < 4; i++) {
                nu = (int) (Math.random() * 100);
                if ( nu < ListKeyword.size()) {
                    return ListKeyword.get(nu);
                } else
                    i--;
            }
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Saisir Le KeyWord");
        ListKeyword.add(s.nextLine());

        return ListKeyword.get(ListKeyword.size() - 1);
    }
}
