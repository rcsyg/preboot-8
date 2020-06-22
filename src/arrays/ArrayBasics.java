package arrays;

public class ArrayBasics {

    public static void main(String[] args) {
        int simple = 5;

        int[] arr = new int[10];
        int[] arr2 = new int[] {4, 8, -3, 5, 2, 12};

        int el1 = arr[3];
        int el2 = arr2[3];

        System.out.println("el1 = " + el1);
        System.out.println("el2 = " + el2);

        // ArrayIndexOutOfBoundsException
        //int el3 = arr[15];
        //System.out.println("el3 = " + el3);

        // 1 change ALL array
        simple = 7;
        System.out.println("arr[3] = " + arr[3]);
        arr = new int[] {1, 2, 3, 5, 6, 7};
        System.out.println("arr[3] = " + arr[3]);
        arr[3] = 12;
        System.out.println("arr[3] = " + arr[3]);

        int arrLength = arr.length;
        System.out.println("arrLength = " + arrLength);

        byte[] bytes = new byte[10];

        // Just empty zero-sized array
        short[] shorts = new short[]{};

        String[] strs = new String[] {"Hello", "World", "!"};
        char[] java = new char[] {'J', 'a', 'v', 'a'};

        //  Hello Java!
        System.out.print(strs[0] + " ");

        System.out.print(java[0]);
        System.out.print(java[1]);
        System.out.print(java[2]);
        System.out.print(java[3]);

        System.out.print(strs[2]);

        System.out.print("\n\n");
        System.out.println(">>>: " + java);
        System.out.println(arr);

    }

}
