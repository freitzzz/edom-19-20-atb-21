/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RequirementsDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("pt/isep/edom/parser/antlr/internal/InternalRequirementsDsl.tokens");
	}
}
