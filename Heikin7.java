public class Heikin7 {
	public static void main(String[] args) {
		Kamoku[] Kamoku= {
			new Kamoku("国語",63),
			new Kamoku("数学",90),
			new Kamoku("英語",75),
			new Kamoku("理科",45),
			new Kamoku("社会",81),
		};
		int sum = 0;
		
		for (int i=0; i < Kamoku.length; i++) {
		  System.out.println(Kamoku[i]);
          sum = sum + Kamoku[i].tensuu;
		}
		double heikin = (double)sum / Kamoku.length;
        System.out.println("平均の点数は"+heikin+"点です。");
	}
}