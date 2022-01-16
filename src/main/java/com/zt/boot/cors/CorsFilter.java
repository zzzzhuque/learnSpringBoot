package com.zt.boot.cors;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 跨域Filter
 *
 * @author lijunf
 * @date 2020-04-09
 */
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        String[] allowDomain = {
                "https://pre-services.z-real.com.cn",
                "https://pre-assets.z-real.com.cn",
                "https://pre-index.z-real.com.cn",
                "https://services.z-real.com.cn",
                "https://assets.z-real.com.cn",
                "https://index.z-real.com.cn",
                "pre-services.z-real.com.cn",
                "pre-assets.z-real.com.cn",
                "pre-index.z-real.com.cn",
                "services.z-real.com.cn",
                "assets.z-real.com.cn",
                "index.z-real.com.cn",

        };
        Set<String> allowedOrigins = new HashSet<String>(Arrays.asList(allowDomain));

        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpServletRequest request = (HttpServletRequest)servletRequest;

        String originHeader = request.getHeader("origin");
        if (allowedOrigins.contains(originHeader)) {

            response.setHeader("Access-Control-Allow-Origin", originHeader);
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Allow-Headers",
                    "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
        }
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {

    }
}

