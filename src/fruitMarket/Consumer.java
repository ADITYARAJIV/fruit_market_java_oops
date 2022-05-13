package fruitMarket;

public class Consumer {

    public String name;
    public int applesToBuy;
    public int orangesToBuy;
    public int grapesToBuy;
    public int watermelonsToBuy;

    public Consumer(String name, int applesBought, int orangesBought, int grapesBought, int watermelonsBought) {
        this.name = name;
        this.applesToBuy = applesBought;
        this.orangesToBuy = orangesBought;
        this.grapesToBuy = grapesBought;
        this.watermelonsToBuy = watermelonsBought;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApplesToBuy() {
        return applesToBuy;
    }

    public void setApplesToBuy(int applesToBuy) {
        this.applesToBuy = applesToBuy;
    }

    public int getOrangesToBuy() {
        return orangesToBuy;
    }

    public void setOrangesToBuy(int orangesToBuy) {
        this.orangesToBuy = orangesToBuy;
    }

    public int getGrapesToBuy() {
        return grapesToBuy;
    }

    public void setGrapesToBuy(int grapesToBuy) {
        this.grapesToBuy = grapesToBuy;
    }

    public int getWatermelonsToBuy() {
        return watermelonsToBuy;
    }

    public void setWatermelonsToBuy(int watermelonsToBuy) {
        this.watermelonsToBuy = watermelonsToBuy;
    }
}
