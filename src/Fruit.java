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

    public String pcolor;

    public String pshape;
    public int pnumSeeds;
    public boolean pisRipe;
    public int pnumBush;



    public void printInfo(){

        System.out.println("Strawberries are " + color);
        System.out.println("The shape of a strawberry is " + shape);
        System.out.println("The number of seeds in a strawberry is " + numSeeds);
        if (isRipe==true) {
            System.out.println("The fruit is ripe :)");
        }
        else {
            System.out.println("The fruit is not ripe :(");
        }
        System.out.println("The number of strawberries in a bush is: " + numBush);

        System.out.println("Pears are " + pcolor);
        System.out.println(" The shape of a pear is a: " + pshape);
        System.out.println("The number of seeds in a pear is " + pnumSeeds);
        if (pisRipe==true) {
            System.out.println("The pear is ripe :)");
        }
        else {
            System.out.println("The pear is not ripe :(");
        }
        System.out.println("The number of pears in a tree is: " + pnumBush);





    }
    public Fruit(){









    }
}