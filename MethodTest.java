public class MethodTest {
	public static String[] getYourName() {
        String[] namae = new String[2];
        namae[0] = "有機";
        namae[1] = "剛";
        return namae;
     }
    public static void main(String[] args) {
        String[] v = getYourName();
        System.out.println("名字は" + v[0]);
        System.out.println("名前は" + v[1]);
	}
}