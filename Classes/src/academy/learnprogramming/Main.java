package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car mcLaren = new Car();

        porsche.setModel("911 GT");

        System.out.println(porsche.getModel());

        BankAccount myAccount = new BankAccount();
        myAccount.withdrawFunds(100.00);
        myAccount.depositFunds(50);
        myAccount.withdrawFunds(100);

        Wall wall = new Wall(1.125, -1.0);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());

        Point p = new Point(1, 1);
        Point p2 = new Point(2, 3);

        System.out.println(p.distance(-1, -1));
    }
}
