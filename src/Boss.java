import java.util.Random;

public class Boss {
    private int bossHealth = 1000;
    private int bossDamage = 100;
    private int bossDefence = 20;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(int bossDefence) {
        this.bossDefence = bossDefence;
    }

    public  void changeBossDefence() {
        Random r = new Random();
        int bossDefence = r.nextInt(5) + 2;
        setBossDefence(bossDefence);
    }
}

