/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c0.dsl.usecase


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class UseCaseStandaloneSetup extends UseCaseStandaloneSetupGenerated {

	def static void doSetup() {
		new UseCaseStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
