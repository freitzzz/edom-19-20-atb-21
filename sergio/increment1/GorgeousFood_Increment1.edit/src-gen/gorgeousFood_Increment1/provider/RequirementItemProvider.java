/**
 */
package gorgeousFood_Increment1.provider;

import gorgeousFood_Increment1.GorgeousFood_Increment1Factory;
import gorgeousFood_Increment1.GorgeousFood_Increment1Package;
import gorgeousFood_Increment1.Requirement;
import gorgeousFood_Increment1.Version;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gorgeousFood_Increment1.Requirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addCreatedPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
			addDependenciesPropertyDescriptor(object);
			addParentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_title_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_title_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__TITLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_description_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_description_feature",
						"_UI_Requirement_type"),
				GorgeousFood_Increment1Package.Literals.REQUIREMENT__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_type_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_priority_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_priority_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__PRIORITY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_author_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_author_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__AUTHOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Created feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_created_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_created_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__CREATED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_id_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_state_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_state_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__STATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_resolution_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_resolution_feature",
						"_UI_Requirement_type"),
				GorgeousFood_Increment1Package.Literals.REQUIREMENT__RESOLUTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Requirement_dependencies_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Requirement_dependencies_feature",
						"_UI_Requirement_type"),
				GorgeousFood_Increment1Package.Literals.REQUIREMENT__DEPENDENCIES, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_parent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_parent_feature",
								"_UI_Requirement_type"),
						GorgeousFood_Increment1Package.Literals.REQUIREMENT__PARENT, true, false, true, null, null,
						null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GorgeousFood_Increment1Package.Literals.REQUIREMENT__COMMENT);
			childrenFeatures.add(GorgeousFood_Increment1Package.Literals.REQUIREMENT__CHILDREN);
			childrenFeatures.add(GorgeousFood_Increment1Package.Literals.REQUIREMENT__VERSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Requirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Requirement"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		StringBuilder sb = new StringBuilder();
		sb.append(((Requirement) object).getId());
		sb.append(" (");
		Version version = ((Requirement) object).getVersion();
		if (version != null) {
			sb.append(((Requirement) object).getVersion().getMajor());
			sb.append(".");
			sb.append(((Requirement) object).getVersion().getMinor());
			sb.append(".");
			sb.append(((Requirement) object).getVersion().getService());
		} else {
			sb.append("0.0.0");
		}
		sb.append(") : ");
		sb.append(((Requirement) object).getTitle());
		String label = sb.toString();
		return label == null || label.length() == 0 ? getString("_UI_Requirement_type") : label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Requirement.class)) {
		case GorgeousFood_Increment1Package.REQUIREMENT__TITLE:
		case GorgeousFood_Increment1Package.REQUIREMENT__DESCRIPTION:
		case GorgeousFood_Increment1Package.REQUIREMENT__TYPE:
		case GorgeousFood_Increment1Package.REQUIREMENT__PRIORITY:
		case GorgeousFood_Increment1Package.REQUIREMENT__AUTHOR:
		case GorgeousFood_Increment1Package.REQUIREMENT__CREATED:
		case GorgeousFood_Increment1Package.REQUIREMENT__ID:
		case GorgeousFood_Increment1Package.REQUIREMENT__STATE:
		case GorgeousFood_Increment1Package.REQUIREMENT__RESOLUTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__COMMENT:
		case GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN:
		case GorgeousFood_Increment1Package.REQUIREMENT__VERSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(GorgeousFood_Increment1Package.Literals.REQUIREMENT__COMMENT,
				GorgeousFood_Increment1Factory.eINSTANCE.createComment()));

		newChildDescriptors.add(createChildParameter(GorgeousFood_Increment1Package.Literals.REQUIREMENT__CHILDREN,
				GorgeousFood_Increment1Factory.eINSTANCE.createRequirement()));

		newChildDescriptors.add(createChildParameter(GorgeousFood_Increment1Package.Literals.REQUIREMENT__VERSION,
				GorgeousFood_Increment1Factory.eINSTANCE.createVersion()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GorgeousFood_Increment1EditPlugin.INSTANCE;
	}

}
