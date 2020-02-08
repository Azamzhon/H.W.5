public class MagicDoor {
        Hero warrior = new Hero(300, 40, "Bleeding");
        Hero magic = new Hero(250, 30, "Sleeping");
        Hero thor = new Hero(450, 70, "Stun");
        Hero tank = new Hero(800, 35, "Bang");
    public Hero [] getHeroes(){
        return new Hero[]{warrior, magic, thor, tank};
    }

}
