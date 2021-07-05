package noums.study.pizzahouse.filter;

import noums.study.pizzahouse.bean.RereadableRequestWrapper;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("############     doFilterInternal ");
        RereadableRequestWrapper rereadableRequestWrapper = new RereadableRequestWrapper((HttpServletRequest)request);
        //HttpServletRequest requestWrapper = new ContentCachingRequestWrapper(request);
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
        filterChain.doFilter(rereadableRequestWrapper, responseWrapper);
        responseWrapper.copyBodyToResponse();
    }

}
