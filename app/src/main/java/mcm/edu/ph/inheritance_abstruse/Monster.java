package mcm.edu.ph.inheritance_abstruse;

public class Monster extends GameUnit {
    private int monsterParry, monsterEvasion;
    private int gbaseHPP;
    private int gmonsterParry, gmonsterEvasion;
    private double level;

    public Monster (){

    }
    public Monster(int baseHP, int monsterParry, int monsterEvasion,
                   double level, int gbaseHPP, int gmonsterParry, int gmonsterEvasion) {

        setBaseHP(baseHP);
        setBaseArmor(0);
        this.gbaseHPP = gbaseHPP;
        this.gmonsterParry = gmonsterParry;
        this.gmonsterEvasion = gmonsterEvasion;
        this.level = level;
        this.monsterParry = monsterParry;
        this.monsterEvasion = monsterEvasion;
    }
    //borrowed getters
    public int getGbaseHPP() { return gbaseHPP; }
    public int getMonsterParry() { return monsterParry; }
    public int getMonsterEvasion() { return monsterParry; }

    //borrowed setters
    public void setGbaseHPP(int gbaseHPP) { this.gbaseHPP = gbaseHPP; }
    public void setMonsterEvasion(int monsterEvasion) { this.monsterEvasion = monsterEvasion; }
    public void setMonsterParry(int monsterParry) { this.monsterParry = monsterParry; }
    public void setLevel(double level) { this.level = level; }
    public double getLevel() { return level; }

    //formula
    public double hpm(){return getGbaseHPP() * (level); }
    public double evasion(){return monsterEvasion * (level);}
    public double parry(){return monsterParry * (level);}

    //borrowed setters
    public void setGbaseHP(int gbaseHP) {this.gbaseHPP = gbaseHP; }
    public void setGmonsterParry(int gmonsterParry) {this.gmonsterParry = gmonsterParry; }
    public void setGmonsterEvasion(int gmonsterEvasion) {this.gmonsterEvasion = gmonsterEvasion; }
}

