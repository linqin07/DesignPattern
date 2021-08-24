/**
 * @Description:
 * @author: LinQin
 * @date: 2019/09/18
 */
public class Test {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder()
                .setCpu("i7")
                .setMemory("8G")
                .setHardDisk("1T")
                .setMainBoard("华硕")
                .build();
        System.out.println(myComputer.toString());
    }
}
