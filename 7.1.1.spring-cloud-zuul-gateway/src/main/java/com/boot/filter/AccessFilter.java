package com.boot.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Admin on 2017/6/23.
 * 检查请求是否含有特定参数
 */
public class AccessFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse response = ctx.getResponse();

        logger.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());
//
//        String accessToken = request.getParameter("accessToken");
//        if (accessToken == null) {
//            logger.warn("access token is empty");
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
//        logger.info("access token ok");
//        return null;

        String sessionId = request.getSession().getId();
        Cookie[] cookies = request.getCookies();
        String session = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("JSESSIONID")) {
                    session = cookie.getValue();
                    if (StringUtils.isEmpty(sessionId) || !sessionId.equals(session)) {
                        request.getSession().setAttribute("testKey", "testValue");
                        request.getSession().getId();
                        Cookie newCookie = new Cookie("JSESSIONID", sessionId);
                        newCookie.setMaxAge(60 * 60 * 24);
                        response.addCookie(newCookie);
                    }
                }
            }
        } else {
            HttpSession httpSession = request.getSession(true);
            httpSession.setAttribute("testKey", "testValue");
            sessionId = httpSession.getId();
            Cookie newCookie = new Cookie("JSESSIONID", sessionId);
            newCookie.setMaxAge(60 * 60 * 24);
            response.addCookie(newCookie);
        }
        return null;
    }
}
