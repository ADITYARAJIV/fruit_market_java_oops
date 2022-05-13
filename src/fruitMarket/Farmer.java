package fruitMarket;

public class Farmer {

    private int appleCount;
    private int orangeCount;
    private int grapeCount;
    private int watermelonCount;
    private String name;
    public Farmer(String name, int appleCount, int orangeCount, int grapeCount, int watermelonCount){
        this.name = name;
        this.appleCount = appleCount;
        this.orangeCount = orangeCount;
        this.grapeCount = grapeCount;
        this.watermelonCount = watermelonCount;
    }

    public int getAppleCount() {
        return appleCount;
    }

    public void setAppleCount(int appleCount) {
        this.appleCount = appleCount;
    }

    public int getOrangeCount() {
        return orangeCount;
    }

    public void setOrangeCount(int orangeCount) {
        this.orangeCount = orangeCount;
    }

    public int getGrapeCount() {
        return grapeCount;
    }

    public void setGrapeCount(int grapeCount) {
        this.grapeCount = grapeCount;
    }

    public int getWatermelonCount() {
        return watermelonCount;
    }

    public void setWatermelonCount(int watermelonCount) {
        this.watermelonCount = watermelonCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

