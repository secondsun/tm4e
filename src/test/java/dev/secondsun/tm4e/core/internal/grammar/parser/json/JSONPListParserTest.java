/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package dev.secondsun.tm4e.core.internal.grammar.parser.json;

import dev.secondsun.tm4e.core.internal.grammar.reader.GrammarReader;
import dev.secondsun.tm4e.core.internal.grammar.reader.IGrammarParser;
import dev.secondsun.tm4e.core.internal.types.IRawGrammar;
import org.junit.Test;

public class JSONPListParserTest {

	@Test
	public void testCsharp() throws Exception {
		IGrammarParser parser = GrammarReader.JSON_PARSER;
		IRawGrammar grammar = parser.parse(JSONPListParserTest.class.getResourceAsStream("csharp.json"));
		System.err.println(grammar);
	}
}
