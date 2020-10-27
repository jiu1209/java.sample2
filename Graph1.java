public class Graph1 {
	public static void main(String[] args) {
	for (int i =-8; i <= 8; i++) {
    		printGraph1(i*i);

       }
    }
      public static void printGraph1(int x) {
      	int c;
    	for (c = 0; c < x; c++) {
    		System.out.print("*");
    	}
    		System.out.println("");
    }
}
//-8×-8が実行されて64になる。
//なので、printGraph1(int x)のxの値が64になる
//cが0で、xが64なので、64回*が出力させる
//その後は-7から8までの繰り返し