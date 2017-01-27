/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtre;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author merguez
 */
public class EncodingFilter implements Filter {

    public static final String ENCODING = "encoding";
    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding = filterConfig.getInitParameter(ENCODING);
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain filterChain) throws IOException, ServletException {
        req.setCharacterEncoding(encoding);
        resp.setContentType("text/html;charset=" + encoding);
        filterChain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
    }

}
