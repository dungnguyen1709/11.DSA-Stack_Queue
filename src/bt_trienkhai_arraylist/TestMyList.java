package bt_trienkhai_arraylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList myList = new MyList(5);
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);
        myList.add(4,5);
        System.out.println("myList = " + myList);
    }
}
