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
package dev.secondsun.tm4e.core.css;

import dev.secondsun.tm4e.core.theme.IStyle;
import dev.secondsun.tm4e.core.theme.css.CSSParser;

public class CSSParserTest {

	public static void main(String[] args) throws Exception {
		CSSParser parser = new CSSParser(".comment {color:rgb(0,1,2)} .comment.ts {color:rgb(0,1,2)}");
		String[] names = "comment".split("[.]");
		parser.getBestStyle(names);
		
		names = "comment.ts".split("[.]");
		IStyle style = parser.getBestStyle(names);
		
		System.err.println(style.getColor().red);
	}
}
