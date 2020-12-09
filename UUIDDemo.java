import java.util.UUID;

public class UUIDDemo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0;i <500; i++){

            System.out.println(UUID.randomUUID().toString().replace("-",""));
	System.out.println("修改");
        }
    }
}
