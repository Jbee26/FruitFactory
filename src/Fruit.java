public class Fruit {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //variable declarations
    public String color;

    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;





    public void printInfo(){

        System.out.println("The fruit is " + color);
        System.out.println("The fruit is " + shape);
        System.out.println("The fruit has " + numSeeds + "seeds");
        if (isRipe==true) {
            System.out.println("The fruit is ripe :)");
        }
        else {
            System.out.println("The fruit is not ripe :(");
        }
        System.out.println("Number of fruit in a plant is " + numBush);





    }
    public Fruit(String paramColor, int paramNumSeeds, int paramNumBush, String paramShape, boolean paramIsRipe){
        color = paramColor;
        numSeeds = paramNumSeeds;
        numBush = (int)(Math.random()*100);
        shape = paramShape;
        isRipe = paramIsRipe;










    }
}