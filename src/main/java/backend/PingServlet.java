package backend;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PingServlet
 */
@WebServlet("/ping")
public class PingServlet extends HttpServlet {

  /**
   * Randomatic generated SerialVersionUID
   * 
   * @see Serializable
   */
  private static final long serialVersionUID = 7903622708854784L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public PingServlet() {
    super();
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    InputStream input = PingServlet.class.getClassLoader().getResourceAsStream("/res.txt");
    try (Scanner s = new Scanner(input) ) {
      s.useDelimiter("\\A");

      String res = s.next();

      response.getWriter().append(res);
      response.setHeader("Content-Type", "text/plain");
    }
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }

}
