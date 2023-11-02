
public class FruitHQ {


    public static void main(String[] args) {
        FruitHQ myfactory = new FruitHQ();

    }

    //constructor method
    //a constructor is a method with no return type that has the same name as the class its in

    public FruitHQ(){
        // strawberry: red, triangle, 200, yes, 20
        Fruit strawberry;   //declare
        strawberry = new Fruit(); //construct
        strawberry.color="red";
        strawberry.shape="triangle";
        strawberry.numSeeds=200;
        strawberry.isRipe=true;
        strawberry.numBush=20;
        strawberry.printInfo();

        Fruit pear;
        pear = new Fruit();
        pear.pcolor="green";
        pear.pshape="oval";
        pear.pnumSeeds=10;
        pear.pisRipe=false;
        pear.pnumBush=10;
        pear.printInfo();



        // pear: green, oval, 10, yes, 10




    }
}
