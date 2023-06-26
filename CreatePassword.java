package generator;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CreatePassword
 */
@WebServlet("/generate")
public class CreatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Create Password");
		String numpass1=request.getParameter("numpass");
		String lenpass1=request.getParameter("lenpass");
		int numpass=Integer.parseInt(numpass1);
		int lenpass=Integer.parseInt(lenpass1);
		String[] randomPasswords = new String[numpass];
		GeneratePassword genpass=new GeneratePassword();
		/* The code below obtains the randomly generated passwords*/
		genpass.create(numpass,lenpass,randomPasswords);//the function has number of passwords,length of passwords and password StringArray
		System.out.println("After Generate Password");
		RequestDispatcher dispatcher = null;
		request.setAttribute("passwords",randomPasswords);
		/* The code below is used to transfer the generated passwords to the action.jsp for viewing*/
		dispatcher = request.getRequestDispatcher("action.jsp");
		dispatcher.forward(request, response);
	}

}
