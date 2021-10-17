package com.yojic.loginhandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.transaction.annotation.Transactional;

//테스트 완료
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    
    private String loginidname;
    private String defaultUrl;
 
    private RedirectStrategy redirectStratgy = new DefaultRedirectStrategy();

    @Transactional(rollbackFor= {Exception.class})
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
    	HttpSession session = request.getSession(true);
    	String email = authentication.getName();
    	session.setAttribute("email", email);
    	
    	System.out.println("로그인 성공");
        redirectStratgy.sendRedirect(request, response, defaultUrl);
    	
    }
 
    public String getLoginidname() {
        return loginidname;
    }
 
    public void setLoginidname(String loginidname) {
        this.loginidname = loginidname;
    }
 
    public String getDefaultUrl() {
        return defaultUrl;
    }
 
    public void setDefaultUrl(String defaultUrl) {
        this.defaultUrl = defaultUrl;
    }

}


