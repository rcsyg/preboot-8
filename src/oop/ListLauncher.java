package oop;

public class ListLauncher {

    public static void main(String[] args) {
        AwesomeList awesomeList = new AwesomeList();
        awesomeList.add(5);
        awesomeList.add(3);
        awesomeList.add(2);
        awesomeList.add(7);
        awesomeList.add(-3);

        awesomeList.printSelf();

        if(false /* in case get by inadequate index */ ) {
            throw new IllegalArgumentException("Illegal index!");
        }
    }

}
