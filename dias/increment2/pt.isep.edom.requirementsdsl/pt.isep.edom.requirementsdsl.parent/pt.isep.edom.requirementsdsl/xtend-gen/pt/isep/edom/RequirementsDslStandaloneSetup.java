/**
 * generated by Xtext 2.12.0
 */
package pt.isep.edom;

import pt.isep.edom.RequirementsDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RequirementsDslStandaloneSetup extends RequirementsDslStandaloneSetupGenerated {
  public static void doSetup() {
    new RequirementsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
