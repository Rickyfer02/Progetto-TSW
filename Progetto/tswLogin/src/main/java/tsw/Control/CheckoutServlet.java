package tsw.Control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Ordine;
import Model.OrdineModel;
import Model.ProdottoInCarrello;
import Model.UserBean;
import Util.Carrello;
import Util.DriverManagerConnectionPool;

/**
 * Servlet implementation class CheckoutServlet
 */
@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * Crea il bean dell'ordine che verr� salvato nel database con databaseInsert()
	 * il codice dell'ordine � qui passato come vuoto, verr� poi generato nel model
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserBean utente = (UserBean) request.getSession().getAttribute("utente");
		double totale = (double) request.getSession().getAttribute("totale");
		LocalDateTime dataTemp = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Date dataFinal = Date.valueOf(dataTemp.format(formatter)); 
		OrdineModel model = new OrdineModel();
		//System.out.println(dataFinal);
		
		Carrello prodOrdine = (Carrello) request.getSession().getAttribute("carrello");
		System.out.println(prodOrdine.toString());
		Ordine ordine = new Ordine("", utente.getUsername(), totale, dataFinal, prodOrdine.getProdotti());
		
		/**Il pulsante Procedi all'acquisto non deve inserire l'ordine nel database, altrimenti se l'utente annulla l'operazione l'ordine sar� comunque inserito.
		 * Qui deve reindirizzare alla checkout.jsp, mostrando il riepilogo e le opzioni di pagamento e spedizione.
		 * Dopodich� un pulsante finalizzer� l'acquisto e inserir� l'ordine nel database  
		 */
		request.getSession().setAttribute("checkoutOrdine", ordine);
		response.sendRedirect("checkout.jsp");
		
		/*try {
			model.databaseInsert(ordine);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ 
	}
}
