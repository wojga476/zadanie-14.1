import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/kalkulator")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");
        String kilogramy = request.getParameter("kilogramy");
        String gramy = request.getParameter("gramy");
        String miligramy = request.getParameter("miligramy");
        Obliczenia o = new Obliczenia();
        PrintWriter printWriter = response.getWriter();

        if (o.sprawdzenieDlugosci(metry, milimetry, centymetry)) {
            printWriter.print(o.obliczeniaMiar(metry, centymetry, milimetry));
        } else if (o.sprawdzenieMasy(kilogramy, gramy, miligramy)) {
            printWriter.print(o.obliczeniaWag(kilogramy, gramy, miligramy));
        } else
            response.getWriter().print("Podano zla liczbe lub nie podano zadnej liczby.");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
    }
}
