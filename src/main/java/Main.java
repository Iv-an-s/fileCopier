import aboutCopy.factory.Factory;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Factory.getFileCopier().copy("c:\\Users\\Ivan\\Desktop\\song.mp3", "c:\\Users\\Ivan\\Desktop\\songIOBuffCopy.mp3");
        long endTime = System.currentTimeMillis();
        System.out.println("Spent time: " + (endTime-startTime) + "ms");
    }
// something for commit 1
    // something for commit 2
    // something for commit 3


    // cmth for master-commit 1
    // something for commit 4
    // something for commit 5
    // something for commit 6
    // something for commit 7
    // something for commit 8
    // something for commit 9
}
