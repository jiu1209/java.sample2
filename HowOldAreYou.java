import java.io.*;

public class HowOldAreYou {
	public static void main(String[] args) {
				System.out.println("1人目の名前を入力してください。");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				try {
					String line = reader.readLine();
					System.out.println(line +"さんですね。");

					System.out.println("2人目の名前を入力してください。");
					String line2 = reader.readLine();
					System.out.println( "2人目は"+line2+"さんですね。");

					System.out.println(line+"さんの年齢を入力してください。");
					line = reader.readLine();

					System.out.println(line2+"さんの年齢を入力してください。");
					line2 = reader.readLine();

					int age = Integer.parseInt(line);
					int age2 = Integer.parseInt(line2);

					//2人の平均年齢を出す
					System.out.println("その2人の年齢の平均は"+(age+age2)/2+"です。");

				} catch (IOException e) {
					System.out.println(e);

				} catch (NumberFormatException e) {
					System.out.println("年齢が正しくありません。");
				}
			}
		}
