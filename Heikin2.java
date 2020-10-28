public class Heikin2 {
	public static void main(String[] args) {
		int[] ten;
		int sum;
		double heikin;

		ten = new int[5];
		ten[0] = 63;
		ten[1] = 90;
		ten[2] = 75;
		ten[3] = 45;
		ten[4]=  81;
		sum = 0;
		for (int i=0; i < ten.length; i++) {
          sum = sum + ten[i];
		}
		heikin = (double)sum / ten.length;

        System.out.println("国語の点数は"+ten[0]+"点です。");
        System.out.println("数学の点数は"+ten[1]+"点です。");
        System.out.println("英語の点数は"+ten[2]+"点です。");
        System.out.println("理化の点数は"+ten[3]+"点です。");
        System.out.println("社会の点数は"+ten[4]+"点です。");
        System.out.println("平均の点数は"+heikin+"点です。");
	}
}