package org.caferrerb.drawer.compilador;

import java.io.StringReader;

import org.caferrerb.drawer.parser.*;

public class Compilador {

	private Html htmlGrammar;

	private String console;

	public Compilador() {
		htmlGrammar = new Html(new StringReader(""));
	}

	private void compilar(String codigo) throws Exception {
		htmlGrammar.ReInit(new StringReader(codigo));
		htmlGrammar.html();
	}

	public String run(String codigo) throws Exception {
		compilar(codigo);

		return "";

	}
}
