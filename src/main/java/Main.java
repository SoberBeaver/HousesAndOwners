import entity.*;

public class Main {
    public static void main(String[] args){

        Owner testOwner = new Owner("Murad", "Vdovichenkov", 33);

        House testHouse = new House("Moscow, Gagarinskiy Pereulok, dom 3 ",
                "grey",
                5,
                testOwner
        );

        System.out.println(testOwner.getOwnerInfo());
        System.out.println(testHouse.getOwnerInfo());
        System.out.println(testHouse.getColor());
        testHouse.changeColor("yellow");
        System.out.println(testHouse.getFullHouseInfo());
    }
}
