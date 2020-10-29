public class ShowMaxDate {
	public static void main(String[] args) {
		int[] date = {31,41,59,26,53,58,97,93,23,84};
		int max_date = date[0];
		for (int i = 0; i < date.length; i++) {
		    if (max_date < date[i]){
		    	max_date = date[i];
		    	//上書きされていく
		    }         
		}
		System.out.println("最大値は"+max_date+"です。");
	}
}
//最大値を出すプログラム