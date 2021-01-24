package enums.example2;

//Represent specific ranged predifined data
//Needed when we need specific values like exired valid cancelled
//
public enum GameLevel {
    // jai zaidziam Easy leveliu, turim 300HP, ir gaunam armora GOLDEN
    EASY(300,"Golden"),
    MEDIUM(200, "Metal"),
    HARD(100, "Wooden"),
    HARDCODE(50, "Cloth");

    private int healthPoints;
    private String armorType;

    //reikalingas konstruktorius jai norim papildomu reiksmiu
    GameLevel(int healthPoints, String armorType) {
        this.healthPoints = healthPoints;
        this.armorType = armorType;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getArmorType() {
        return armorType;
    }
}
