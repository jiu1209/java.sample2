public class Heikin2 {
	public static void main(String[] args) {
		int[] ten= {63,90,75,45,81};
		int sum = 0;
		double heikin;
		
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