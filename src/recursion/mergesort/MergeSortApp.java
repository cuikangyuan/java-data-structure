package recursion.mergesort;

public class MergeSortApp {

    public static void main(String[] args) {


        int maxSize = 100;
        DArray arr;

        arr = new DArray(maxSize);

        arr.insert(64);
        arr.insert(21);
        arr.insert(70);
        arr.insert(33);
        //arr.insert(12);
        //arr.insert(85);
        //arr.insert(44);
        //arr.insert(3);
//        arr.insert(89);
//        arr.insert(0);
//        arr.insert(108);
//        arr.insert(36);

        arr.display();

        arr.mergeSort();

        arr.display();
        //master branch commit 1

        //dev commit 1
        //dev commit 2

        //master branch commit 2

        //dev2 branch commit 1
        //dev2 branch commit 2


        //master branch commit 3

        //dev3 branch commit 1
        //dev3 branch commit 2

    }
}
