package Hw22;

public class Main22Hw {

    public static void main(String[] args) {

        SingleWayList<Integer> singleWayList = new SingleWayList<>();
        singleWayList.add(32);
        singleWayList.add(56);
        singleWayList.add(67);
        singleWayList.add(567);

        for (Integer elem : singleWayList) {
            System.out.println(elem);
        }

        System.out.println("=========");

        singleWayList.removeLast();

        for (Integer elem : singleWayList) {
            System.out.println(elem);
        }
    }
}
