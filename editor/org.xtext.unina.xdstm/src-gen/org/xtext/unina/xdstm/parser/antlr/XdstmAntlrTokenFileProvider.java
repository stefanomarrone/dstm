/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XdstmAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/unina/xdstm/parser/antlr/internal/InternalXdstm.tokens");
	}
}
