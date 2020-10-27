public class Graph {
	public static void main(String[] args) {
		 System.out.println(getpower(8,3));
		}
		public static int getpower(int x , int n) {
			int y = 1;
			for (int i = 0; i < n; i++) {
				y = y * x;
			}
			return y;
		}
	}