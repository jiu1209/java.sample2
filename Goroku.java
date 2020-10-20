import java.io.*;

public class Goroku {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			  System.out.println("飲み物は何が好きですか？");
			  System.out.println("あ=オレンジジュース");
	     	  System.out.println("い=コーヒー");
		      System.out.println("う=どちらでもない");
              System.out.println("あ,い,うのどれかを選んでください。");

              String line = reader.readLine();
              
              char n;
              if (line.length() > 0) {
                 n = line.charAt(0);
              } else {
              	n = 'c';
              }

              switch (n) {
              	case 'あ':
                System.out.println("オレンジジュースです。");
                break;

                case 'い':
                System.out.println("コーヒーです。");
                break;

                default:
                System.out.println("どちらでもない。");
                break;
              }

              } catch (IOException e) {
				  System.out.println(e);
              }
		}
	}