package mx.com.gm.administracion;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;

@WebFilter("/Filtro")
public class Filtro implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpSession sesion = ((HttpServletRequest) request).getSession();

        if (sesion.getAttribute("administrador") != null) {

            chain.doFilter(request, response);
            
        } else {

            request.getRequestDispatcher("/WEB-INF/Acceso/paginaError.jsp").forward(request, response);
        }
    }
}
