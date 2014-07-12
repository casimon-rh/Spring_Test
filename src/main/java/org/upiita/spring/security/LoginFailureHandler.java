package org.upiita.spring.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {
	
	@Override
	public void setDefaultFailureUrl(String defaultFailureUrl) {
		// TODO Auto-generated method stub
		super.setDefaultFailureUrl(defaultFailureUrl);
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		Integer loginsFallidos = (Integer) request.getSession().getAttribute(
				"loginsFallidos");
		if (loginsFallidos == null)
			loginsFallidos = 1;
		else
			loginsFallidos++;
		request.getSession().setAttribute("loginsFallidos", loginsFallidos);
		// TODO Auto-generated method stub
		super.onAuthenticationFailure(request, response, exception);
	}

}
