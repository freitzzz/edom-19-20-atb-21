/**
 * generated by Xtext 2.12.0
 */
package pt.isep.edom;

import org.eclipse.xtext.conversion.IValueConverterService;
import pt.isep.edom.AbstractRequirementsDslRuntimeModule;
import pt.isep.edom.requirementsdsl.converter.RequirementsDslValueConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class RequirementsDslRuntimeModule extends AbstractRequirementsDslRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return RequirementsDslValueConverter.class;
  }
}
