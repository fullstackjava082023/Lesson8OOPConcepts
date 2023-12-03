import something.Rectangle;

public class Main {
//    public static final double pi = 3.14;
    public static void main(String[] args) {

//        Class something.something.Rectangle
//        Fields width, height
//        Constructor which get two parameters width and height
//        Constructor which get only one parameters and use at as width and as height.
//        Methods to calculate area and perimeter
//        Method isSquare which will return true if the rectangle is square.

/*


        Rectangle rectangle1 = new Rectangle(6);
        Rectangle rectangle2 = new Rectangle(10,3);
        System.out.println("1 perimer is : " + rectangle1.calculatePerimeter());
        System.out.println("2 perimer is : " + rectangle2.calculatePerimeter());
        System.out.println("1 is square? : " + rectangle1.isSquare());
        System.out.println("2 is square? : " + rectangle2.isSquare());
        double width = rectangle2.width;
        double height = rectangle2.height;

//        System.out.println(rectangle1.pi);

        System.out.println(Rectangle.pi);
        Rectangle.pi = 34;
        System.out.println(Rectangle.pi);
*/

//        System.out.println(rectangle1.calculateArea());




        Employee carlCracker = new Employee(75000,"Carl Cracker", 1987, 12 , 15);
        Employee harryHacker = new Employee(50000,"Harry Hacker", 1989, 10 , 1);
        Employee tonyTester = new Employee(40000,"Tony Tester", 1990, 3 , 15);
        System.out.println(tonyTester.getSalary());
        tonyTester.setSalary(50000);
//        tonyTester.setSalary(-100);

      /*  Class Car It should contain the following fields:
        Model, price , forSale (boolean flag). owner(name of the owner)
        All fields should be private
        Constructor which get all fields and set them using this keyword
        We want that everyone could access the fields (getters for all fields)
        We want allow only setModel to be public setter
        We want to let set price and set forSale only to owner
        Create method setForSale(String owner, boolean forSale) and setPrice(String owner, double price) which will change the price only if the owner is the same as in method argument
        Create method setOwner(String newOwner) which should be private
        Create method sale(String owner, String newOwner)
        The method checks if forSale flag is true
        The method checks if owner is the same as owner parameter
        If all conditions held the method should change the owner to be a newOwner.
        Add prints to all methods so we will know what happened : “the price was changed”, “the car was sold” etc…*/

//        Car kiaPicanto = new Car("KiaPicanto", 50000, false, "Arja");
//        kiaPicanto.setForSale("Arja", true);
//        kiaPicanto.setPrice("Arja", 40000);
//        kiaPicanto.sale("Cercey", "Jaymi");
//        kiaPicanto.sale("Arja", "John");
//        System.out.println(kiaPicanto.getOwner());

        Animal animal1 = new Animal();
        animal1.setAge(15);
        animal1.setName("stamAnimal");
        System.out.println(animal1.getName());//stamAnimal

        Dog animal2 = new Dog();
        animal2.setName("Puppy");
        animal2.setAge(10);
        animal2.color = "white";

//
//        Extend the class Employee from the previous lessons
//                Create class Manager which extends Employee.
//        It has field bonus (double)
//                It has method setBonus(double bonus)
//        Create in main 1 regular Employee and 1 manager
//        Set bonus to manager
        Employee employee = new Employee(20000, "Arja", 1986, 4, 8);
        Manager manager = new Manager(25000, "John", 1998, 5, 6);
        manager.getSalary();
        manager.setBonus(10000);













    }
}