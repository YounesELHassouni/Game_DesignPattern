
public class Avatar extends GamerDecorator{
    protected  String avatar;

    public Avatar(String avatar, Gamer gamer) {
        super(gamer);
        this.avatar=avatar;

    }


    @Override
    public String print() {
        return this.gamer.print()+"\n-avatar :"+avatar;
    }
}
