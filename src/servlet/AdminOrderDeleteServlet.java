package servlet;

import service.OrderService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "admin_order_delete",urlPatterns = "/admin/order_delete")
public class AdminOrderDeleteServlet extends HttpServlet {
    private final OrderService oService = new OrderService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        oService.delete(id);
        request.getRequestDispatcher("/admin/order_list").forward(request, response);
    }
}
