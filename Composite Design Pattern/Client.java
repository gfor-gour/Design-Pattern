public class Client {
    public static void main(String[] args) {
        File file_0 = new File(18);
        File file_1 = new File(76);
        File file_2 = new File(78);

        Directory dir_1 = new Directory();
        Directory root = new Directory();

        root.add(dir_1);
        root.add(file_0);
        root.add(file_1);
        dir_1.add(file_2);

        System.out.println(root.file_size());
    }
}
