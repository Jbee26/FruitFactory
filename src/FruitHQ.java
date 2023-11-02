
public class FruitHQ {


    public static void main(String[] args) {
        FruitHQ myfactory = new FruitHQ();

    }

    //constructor method
    //a constructor is a method with no return type that has the same name as the class its in

    public FruitHQ(){
        // strawberry: red, triangle, 200, yes, 20
        Fruit strawberry;   //declare
        strawberry = new Fruit("red", 200, 20, "triangle", true ); //construct
        strawberry.color="red";
        strawberry.shape="triangle";
        strawberry.numSeeds=200;
        strawberry.isRipe=true;
        strawberry.numBush=20;
        strawberry.printInfo();

        Fruit pear;
        pear = new Fruit("green", 10, 10, "oval", false );
        pear.color="green";
        pear.shape="oval";
        pear.numSeeds=10;
        pear.isRipe=false;
        pear.numBush=10;
        pear.printInfo();


        Fruit guava;
        guava = new Fruit("green", 100, 20, "sphere", true);
        guava.color="green";
        guava.shape="oval";
        guava.numSeeds=10;
        guava.isRipe=false;
        guava.numBush=10;
        guava.printInfo();





        // pear: green, oval, 10, yes, 10




    }
}
