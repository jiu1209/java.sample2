import java.io.*;

public class Hello {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				try {
					String line;
					while ((line = reader.readLine()) != null) {
						String s = line.toString();
						s = s.toString();
						System.out.println(s);
					}
                 
				} catch (IOException e) {
					System.out.println(e);
			}
		}
	}
 