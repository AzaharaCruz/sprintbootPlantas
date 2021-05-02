package com.main.modelo.entrada;

public class LoginUsuarioSalida {
	String resultadoLogin;
	boolean loginOk;
	public String getResultadoLogin() {
		return resultadoLogin;
	}
	public void setResultadoLogin(String resultadoLogin) {
		this.resultadoLogin = resultadoLogin;
	}
	public boolean isLoginOk() {
		return loginOk;
	}
	public void setLoginOk(boolean loginOk) {
		this.loginOk = loginOk;
	}
	public LoginUsuarioSalida(String resultadoLogin, boolean loginOk) {
		super();
		this.resultadoLogin = resultadoLogin;
		this.loginOk = loginOk;
	}

}
