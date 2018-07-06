import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/kalkulator")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String milimetry =request.getParameter("milimetry");
        String centymetry =request.getParameter("centymetry");
        String metry =request.getParameter("metry");
        String kilogramy =request.getParameter("kilogramy");
        String gramy =request.getParameter("gramy");
        String miligramy =request.getParameter("miligramy");

        Obliczenia obliczenia =new Obliczenia();

        PrintWriter printWriter =response.getWriter();
        if(kilogramy==null||gramy==null||miligramy==null){
            printWriter.print(obliczenia.obliczeniaMiar(metry,centymetry,milimetry));
        }
        else if (metry==null||centymetry==null||milimetry==null){
            printWriter.print(obliczenia.obliczeniaMiar(kilogramy,gramy,miligramy));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
