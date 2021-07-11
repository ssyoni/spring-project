package noums.study.pizzahouse.filter;

import noums.study.pizzahouse.bean.RereadableRequestWrapper;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/orders")
public class TestFilter extends OncePerRequestFilter {

    @Override
    public void destroy() {
        System.out.println("destroy 샤따 내려요~~~~~~~~");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println(">>>>>>> doFilterInternal");
        RereadableRequestWrapper rereadableRequestWrapper = new RereadableRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

        filterChain.doFilter(rereadableRequestWrapper, responseWrapper);

    }
}
