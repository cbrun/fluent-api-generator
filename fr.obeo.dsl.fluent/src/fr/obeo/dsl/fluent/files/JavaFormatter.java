package fr.obeo.dsl.fluent.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.internal.core.util.Util;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

public class JavaFormatter {
	private CodeFormatter codeFormatter;

	public JavaFormatter(CodeFormatter formatter) {
		this.codeFormatter = formatter;
	}

	public void format(File file) throws MalformedTreeException, org.eclipse.jface.text.BadLocationException {
		if (file.isDirectory()) {
			formatDirTree(file, codeFormatter);
		} else if (Util.isJavaLikeFileName(file.getPath())) {
			formatFile(file, codeFormatter);
		}
	}

	/**
	 * Recursively format the Java source code that is contained in the
	 * directory rooted at dir.
	 * 
	 * @throws org.eclipse.jface.text.BadLocationException
	 * @throws MalformedTreeException
	 */
	private void formatDirTree(File dir, CodeFormatter codeFormatter)
			throws MalformedTreeException,
			org.eclipse.jface.text.BadLocationException {

		File[] files = dir.listFiles();
		if (files == null)
			return;

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (file.isDirectory()) {
				formatDirTree(file, codeFormatter);
			} else if (Util.isJavaLikeFileName(file.getPath())) {
				formatFile(file, codeFormatter);
			}
		}
	}

	/**
	 * Format the given Java source file.
	 * 
	 * @throws org.eclipse.jface.text.BadLocationException
	 * @throws MalformedTreeException
	 */
	private void formatFile(File file, CodeFormatter codeFormatter)
			throws MalformedTreeException,
			org.eclipse.jface.text.BadLocationException {
		IDocument doc = new Document();
		try {
			// read the file
			String contents = new String(
					org.eclipse.jdt.internal.compiler.util.Util
							.getFileCharContent(file, null));
			// format the file (the meat and potatoes)
			doc.set(contents);
			TextEdit edit = codeFormatter.format(
					CodeFormatter.K_COMPILATION_UNIT
							| CodeFormatter.F_INCLUDE_COMMENTS, contents, 0,
					contents.length(), 0, null);
			if (edit != null) {
				edit.apply(doc);
			} else {
				System.err.println("format pb " + file.getAbsolutePath());
				return;
			}

			// write the file
			final BufferedWriter out = new BufferedWriter(new FileWriter(file));
			try {
				out.write(doc.get());
				out.flush();
			} finally {
				try {
					out.close();
				} catch (IOException e) {
					/* ignore */
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
