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
package dev.secondsun.tm4e.core.model;

public class Range {

	public final int fromLineNumber;
	public int toLineNumber;

	/**
	 * Constructs a range made of a single line
	 * @param lineNumber
	 */
	public Range(int lineNumber) {
		this.fromLineNumber = lineNumber;
		this.toLineNumber = lineNumber;
	}
}
