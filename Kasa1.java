import java.io.*;

public class Kasa1 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("時刻を入力してください。");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
		if (n < 0 || n > 23) {
          System.out.println("時刻の範囲を超えています");
		} else if (n <= 11)  {
		  System.out.println("おはようございます");
		} else if (n == 12)  {
		  System.out.println("お昼です");
		} else if (n <= 18 ) {
		  System.out.println("こんにちは");
		} else {
		  System.out.println("こんばんは");
		}
		} catch (IOException e) {
					System.out.println(e);

		} catch (NumberFormatException e) {
					System.out.println("現在の時刻を入力してください。");
		}
	}
}