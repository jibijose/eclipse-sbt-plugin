package org.jibi.eclipse.sbt;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;


public class Initializer implements IStartup {

	@Override
	public void earlyStartup() {
		 IWorkspace workspace = ResourcesPlugin.getWorkspace();
	   workspace.addResourceChangeListener(new ResourceChangeListener());
	}

}
