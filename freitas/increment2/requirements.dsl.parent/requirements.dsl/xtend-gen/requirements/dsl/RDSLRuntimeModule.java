/**
 * generated by Xtext 2.19.0
 */
package requirements.dsl;

import org.eclipse.xtext.conversion.IValueConverterService;
import requirements.dsl.AbstractRDSLRuntimeModule;
import requirements.dsl.converter.RDSLValueConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class RDSLRuntimeModule extends AbstractRDSLRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return RDSLValueConverter.class;
  }
}
