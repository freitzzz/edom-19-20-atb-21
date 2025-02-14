/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import mindmap.mmapdsl.ui.internal.MmapdslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MmapdslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MmapdslActivator activator = MmapdslActivator.getInstance();
		return activator != null ? activator.getInjector(MmapdslActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL) : null;
	}

}
