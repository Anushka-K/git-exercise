package hello;
import java.io.PrintWriter;
public class Hello {

  public static void main(String[] args) {
    PrintWriter pen=new PrintWriter(System.out, true);
    pen.println("Hello GitHub!");
    pen.flush();
}//main
}//class Hello
