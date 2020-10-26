import java.io.*;

public class Make {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;

		try{	
			System.out.println("<!DOCTYPE html>");
			System.out.println("<html>");
			System.out.println("<head>");
			System.out.println("<title>My page<title>");
			System.out.println("</head>");
			System.out.println("<body>");
			while ((line = reader.readLine()) != null) {
				if ( line.startsWith("⬛️")) {
					System.out.println("<h1>"+line.substring(1)+"</h1>");
				} else if (line.startsWith("⚫️")) {
					System.out.println("<h2>"+line.substring(1)+"</h2>");
				} else {
					System.out.println("<p>"+line+"</p>");
				  }
				}
				System.out.println("</body>");
			    System.out.println("</html>");           
			} catch (IOException e) {
			    System.out.println(e);
			}
        }
    }
 