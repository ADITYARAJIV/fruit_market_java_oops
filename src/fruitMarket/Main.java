package fruitMarket;

public class Main {

    public static void main(String[] args) {

        Farmer f1 = new Farmer("Bob", 10, 20, 5, 30);
        Consumer c1 = new Consumer("Tom", 12, 14 ,3, 26);

        System.out.println("Farmer's name is " + f1.getName());
        System.out.println("Consumer's name is " + c1.getName());

        if(c1.getApplesToBuy() <= f1.getAppleCount()){
            System.out.println("Consumer " + c1.getName() + " can buy " + c1.getApplesToBuy() + " apples");
            System.out.println(("Farmer " + f1.getName() + " has " + (f1.getAppleCount() - c1.getApplesToBuy()) + " apples left."));
            f1.setAppleCount(f1.getAppleCount() - c1.getApplesToBuy());
        }

        else{
            System.out.println("Consumer " + c1.getName() + " cannot buy all " + c1.getApplesToBuy()  + " apples");
        }


        if(c1.getOrangesToBuy() <= f1.getOrangeCount()){
            System.out.println("Consumer " + c1.getName() + " can buy " + c1.getOrangesToBuy() + " oranges");
            System.out.println(("Farmer " + f1.getName() + " has " + (f1.getOrangeCount()- c1.getOrangesToBuy()) + " oranges left."));
            f1.setAppleCount(f1.getOrangeCount() - c1.getOrangesToBuy());
        }

        else{
            System.out.println("Consumer " + c1.getName() + " cannot buy all " + c1.getOrangesToBuy()  + " oranges");
        }

        if(c1.getGrapesToBuy() <= f1.getGrapeCount()){
            System.out.println("Consumer " + c1.getName() + " can buy " + c1.getGrapesToBuy() + " grapes");
            System.out.println(("Farmer " + f1.getName() + " has " + (f1.getGrapeCount() - c1.getGrapesToBuy()) + " grapes left."));
            f1.setAppleCount(f1.getGrapeCount() - c1.getOrangesToBuy());
        }

        else{
            System.out.println("Consumer " + c1.getName() + " cannot buy all " + c1.getGrapesToBuy()  + " grapes");
        }

        if(c1.getWatermelonsToBuy() <= f1.getWatermelonCount()){
            System.out.println("Consumer " + c1.getName() + " can buy " + c1.getWatermelonsToBuy() + " watermelons");
            System.out.println(("Farmer " + f1.getName() + " has " + (f1.getWatermelonCount() - c1.getWatermelonsToBuy()) + " watermelons left."));
            f1.setAppleCount(f1.getWatermelonCount() - c1.getWatermelonsToBuy());
        }

        else{
            System.out.println("Consumer " + c1.getName() + " cannot buy all " + c1.getWatermelonsToBuy() + " watermelons");
        }

    }
}
