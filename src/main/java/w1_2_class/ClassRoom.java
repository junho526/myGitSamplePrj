package w1_2_class;



public class ClassRoom {

    static boolean hasDoor = true;

    int roomNum;
    String roomName;
    public ClassRoom(int roomNum, String roomName) {
        this.roomNum = roomNum;
        System.out.println(this.roomNum+"번 강의장 객체가 생성됨");
        this.roomName = roomName;

    }
    //일반메서드
    public void printRoomName(){
        System.out.println(this.roomName);
    }
    public void printRoomNameNTimes(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(this.roomName);
        }
       ;
    }

    public static void main(String[] args) {
        ClassRoom classRoom410 = new ClassRoom(410, "강의실");
        ClassRoom classRoom411 = new ClassRoom(411,"컴퓨터실");
        ClassRoom classRoom412 = new ClassRoom(412,"휴식실");

        classRoom410.printRoomName();
        classRoom411.printRoomName();
        classRoom412.printRoomName();

        System.out.println(hasDoor);

        classRoom410.printRoomNameNTimes(10);
    }
}
