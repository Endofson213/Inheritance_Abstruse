package mcm.edu.ph.inheritance_abstruse;

public class Hero extends GameUnit {
    private int gbaseHP,gbaseMP;
    private double gheroSTR, gheroAGI,gheroINT, heroSTR, heroAGI, heroINT, level, heroToughness, heroEvasion, heroLuck;
    private int id;

    public Hero(){
    }

    public Hero(int baseHP, int baseMP,
                double heroSTR, double heroAGI,
                double heroINT,int gbaseHP, int gbaseMP, double gheroSTR,double gheroAGI
            ,double gheroINT,double level) {

        setBaseHP(baseHP);
        setBaseMP(baseMP);
        setBaseArmor(0);
        this.gbaseHP = gbaseHP;
        this.gbaseMP = gbaseMP;
        this.gheroSTR = gheroSTR;
        this.gheroAGI = gheroAGI;
        this.gheroINT = gheroINT;
        this.heroSTR = heroSTR;
        this.heroAGI = heroAGI;
        this.heroINT = heroINT;
        this.level   = level;

    }
    //borrowed getters
    public int getGbaseHP() { return gbaseHP; }
    public int getGbaseMP() { return gbaseMP; }
    public double getheroSTR() { return heroSTR; }
    public double getheroAGI() { return gheroAGI; }
    public double getheroINT() { return gheroINT; }

    //borrowed setters
    public void setGbaseHP(int gbaseHP) { this.gbaseHP = gbaseHP; }
    public void setGbaseMP(int gbaseMP) { this.gbaseMP = gbaseMP; }
    public void setGheroSTR(double gheroSTR) { this.gheroSTR = gheroSTR; }
    public void setGheroAGI(double gheroAGI) { this.gheroAGI = gheroAGI; }
    public void setGheroINT(double gheroINT) { this.gheroINT = gheroINT; }

    //formula
    public double strr(){return heroSTR * (level); }
    public double agii(){return heroAGI * (level); }
    public double intt(){return heroINT * (level); }
    public double hpp(){return getGbaseHP() * (level); }
    public double mpp(){return getGbaseMP() * (level); }

    //getters
    public double getHeroSTR() { return heroSTR; }
    public double getHeroAGI() { return heroAGI; }
    public double getHeroINT() { return heroINT; }
    public double getLevel() { return level; }

    //setters
    public void setHeroSTR(double heroSTR) { this.heroSTR = heroSTR; }
    public void setHeroAGI(double heroAGI) { this.heroAGI = heroAGI; }
    public void setHeroINT(double heroINT) { this.heroINT = heroINT; }
    public void setLevel(double level) { this.level = level; }
}