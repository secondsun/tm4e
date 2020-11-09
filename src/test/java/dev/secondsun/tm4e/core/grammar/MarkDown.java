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
package dev.secondsun.tm4e.core.grammar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import dev.secondsun.tm4e.core.Data;
import dev.secondsun.tm4e.core.registry.Registry;

public class MarkDown {

	public static void main(String[] args) throws Exception {
		Registry registry = new Registry();
		String path = "Markdown.tmLanguage";
		IGrammar grammar = registry.loadGrammarFromPathSync(path, Data.class.getResourceAsStream(path));
		
		List<String> lines = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(Data.class.getResourceAsStream("test.md.txt")));
			String line = null;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		
		long start = System.currentTimeMillis();
		
		StackElement ruleStack = null;
		int i = 0;
		for (String line : lines) {
			ITokenizeLineResult lineTokens = grammar.tokenizeLine(line, ruleStack);			
			ruleStack = lineTokens.getRuleStack();
			for (i = 0; i < lineTokens.getTokens().length; i++) {
				IToken token = lineTokens.getTokens()[i];
				String s = "Token from " + token.getStartIndex() + " to " + token.getEndIndex() + " with scopes "
						+ token.getScopes();
				//System.err.println(s);
				// Assert.assertEquals(EXPECTED_MULTI_LINE_TOKENS[i + j], s);
			}
		}	
		System.err.println(System.currentTimeMillis() - start);
	}
	
	static String convertStreamToString(java.io.InputStream is) {
	    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}
}
