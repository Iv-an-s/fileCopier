import aboutCopy.factory.Factory;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Factory.getFileCopier().copy("c:\\Users\\Ivan\\Desktop\\song.mp3", "c:\\Users\\Ivan\\Desktop\\songIOBuffCopy.mp3");
        long endTime = System.currentTimeMillis();
        System.out.println("Spent time: " + (endTime-startTime) + "ms");
    }

    // cmth for master-commit 1
}
