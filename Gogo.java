import java.io.*;

public class Gogo {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			  System.out.println("飲み物は何が好きですか？");
			  System.out.println("a オレンジジュース(1)");
	     	  System.out.println("b コーヒー(2)");
		      System.out.println("c どちらでもない(3)");
              System.out.println("a,b,cのどれかを選んでください。(1,2,3でも可)");

              String line = reader.readLine();
              char n = line.charAt(0);

              if (n=='a'|| n=='1') {
                 System.out.println("オレンジジュースです。");
              } else if (n=='b'||n=='2')  {
		         System.out.println("コーヒーです。");
              }  else {
              	 System.out.println("どちらでもありません。");
              }

              } catch (IOException e) {
				  System.out.println(e);
              }
		}
	}