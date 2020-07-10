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

        System.out.println("");

        int valueByIndex = awesomeList.get(3);
        System.out.println("valueByIndex = " + valueByIndex);

        int currentSize = awesomeList.size();
        System.out.println("currentSize = " + currentSize);

        awesomeList.remove(1);
        awesomeList.printSelf();

        System.out.println("");

        int[] arrayToAdd = new int[]{-6, 3, -5, 1, 8, -12};
        awesomeList.addAll(arrayToAdd);

        awesomeList.printSelf();
    }

}
