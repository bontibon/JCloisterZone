package com.jcloisterzone.ui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

import static com.jcloisterzone.ui.I18nUtils._;

public class SavegameFileFilter extends FileFilter {

	@Override
	public boolean accept(File f) {
		return f.getName().toLowerCase().endsWith(".jcz") || f.isDirectory();
	}

	@Override
	public String getDescription() {
		return _("JCloisterZone saved games");
	}


}
