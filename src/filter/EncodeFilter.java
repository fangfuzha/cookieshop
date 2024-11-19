package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter(filterName = "EncodeFilter",urlPatterns = "/*")
public class EncodeFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        
        System.out.println("=== EncodeFilter req == " + LocalDateTime.now());
        System.out.println("  ");
        
        System.out.println(" req对象==  " + req.getLocalAddr());
        System.out.println("  ");
        
        chain.doFilter(req, resp);
        System.out.println("=== EncodeFilter resp == " + LocalDateTime.now());
        System.out.println("  ");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
