/**
 * Created by mvieck on 12/30/16.
 */
public class Showcase {
    public static void main(String[] args) {
        Desktop gamingComputer = new Desktop(
                "GamesForDesktops",123456,660,true, true);
        Desktop regularComputer = new Desktop(
                "StandardDesktops",111111,550,true, false);
        Desktop lowEndDesktop = new Desktop(
                "LowEndDesktops",1000001,320,false, false);
        Laptop updatedLaptop = new Laptop(
                "NewLaptops",100000, 340, true, true, true);
        Laptop oldLaptop = new Laptop("OutdatedCompany",2000002, 230, true, false, false);

        gamingComputer.printSpecs();
        regularComputer.printSpecs();
        lowEndDesktop.printSpecs();
        updatedLaptop.printSpecs();
        oldLaptop.printSpecs();
    }
}
