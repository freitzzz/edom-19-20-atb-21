/**
 * generated by Xtext 2.19.0
 */
package requirements.dsl;

import requirements.dsl.RDSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RDSLStandaloneSetup extends RDSLStandaloneSetupGenerated {
  public static void doSetup() {
    new RDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
