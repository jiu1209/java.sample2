public class Discount1 {
	public static void main(String[] args) {
		int p;
		int q;
		p = 10000;
		q = halve(p);
		System.out.println("元の値段が"+p+"円なら半額だと"+q+"になります");
    }
    public static int halve(int n) {
    	return n / 2;
    }
}