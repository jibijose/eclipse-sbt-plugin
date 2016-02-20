package org.jibi.eclipse.sbt.ui.internal.preference;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SbtPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	
	public SbtPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Scala - Sbt Preferences");
	}

	@Override
	protected void createFieldEditors() {
		addField(new DirectoryFieldEditor("SBTPATH", "&Directory preference:",
		        getFieldEditorParent()));
		
	}

	
	

}
