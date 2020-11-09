/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Initial code from https://github.com/Microsoft/vscode-textmate/
 * Initial copyright Copyright (C) Microsoft Corporation. All rights reserved.
 * Initial license: MIT
 *
 * Contributors:
 *  - Microsoft Corporation: Initial code, written in TypeScript, licensed under MIT license
 *  - Angelo Zerr <angelo.zerr@gmail.com> - translation and adaptation to Java
 */
package dev.secondsun.tm4e.core.grammar;

import java.util.Map;

import dev.secondsun.tm4e.core.internal.grammar.Grammar;
import dev.secondsun.tm4e.core.internal.oniguruma.OnigString;
import dev.secondsun.tm4e.core.internal.types.IRawGrammar;
import dev.secondsun.tm4e.core.theme.IThemeProvider;

public class GrammarHelper {

	private GrammarHelper() {
		// methods should be accessed statically
	}

	public static IGrammar createGrammar(IRawGrammar grammar, int initialLanguage,
			Map<String, Integer> embeddedLanguages, IGrammarRepository repository, IThemeProvider themeProvider) {
		return new Grammar(grammar, initialLanguage, embeddedLanguages, repository, themeProvider);
	}

	public static OnigString createOnigString(String str) {
		return new OnigString(str);
	}

}
