/**
 */
package gorgeousFood_Increment1.impl;

import gorgeousFood_Increment1.Comment;
import gorgeousFood_Increment1.GorgeousFood_Increment1Package;
import gorgeousFood_Increment1.Priority;
import gorgeousFood_Increment1.Requirement;
import gorgeousFood_Increment1.Resolution;
import gorgeousFood_Increment1.State;
import gorgeousFood_Increment1.Type;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getState <em>State</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link gorgeousFood_Increment1.impl.RequirementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.FUNCTIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.HIGH;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.NEW;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Resolution RESOLUTION_EDEFAULT = Resolution.INVALID;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Resolution resolution = RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> dependencies;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorgeousFood_Increment1Package.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__TITLE,
					oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GorgeousFood_Increment1Package.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<Comment>(Comment.class, this,
					GorgeousFood_Increment1Package.REQUIREMENT__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Priority newPriority) {
		Priority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__PRIORITY,
					oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__AUTHOR,
					oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__CREATED,
					oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__STATE,
					oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resolution getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(Resolution newResolution) {
		Resolution oldResolution = resolution;
		resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GorgeousFood_Increment1Package.REQUIREMENT__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Requirement>(Requirement.class, this,
					GorgeousFood_Increment1Package.REQUIREMENT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<Requirement>(Requirement.class, this,
					GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN,
					GorgeousFood_Increment1Package.REQUIREMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement getParent() {
		if (eContainerFeatureID() != GorgeousFood_Increment1Package.REQUIREMENT__PARENT)
			return null;
		return (Requirement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Requirement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, GorgeousFood_Increment1Package.REQUIREMENT__PARENT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Requirement newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != GorgeousFood_Increment1Package.REQUIREMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this,
						GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN, Requirement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousFood_Increment1Package.REQUIREMENT__PARENT,
					newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
		case GorgeousFood_Increment1Package.REQUIREMENT__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((Requirement) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorgeousFood_Increment1Package.REQUIREMENT__COMMENT:
			return ((InternalEList<?>) getComment()).basicRemove(otherEnd, msgs);
		case GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case GorgeousFood_Increment1Package.REQUIREMENT__PARENT:
			return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case GorgeousFood_Increment1Package.REQUIREMENT__PARENT:
			return eInternalContainer().eInverseRemove(this, GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN,
					Requirement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorgeousFood_Increment1Package.REQUIREMENT__TITLE:
			return getTitle();
		case GorgeousFood_Increment1Package.REQUIREMENT__DESCRIPTION:
			return getDescription();
		case GorgeousFood_Increment1Package.REQUIREMENT__TYPE:
			return getType();
		case GorgeousFood_Increment1Package.REQUIREMENT__COMMENT:
			return getComment();
		case GorgeousFood_Increment1Package.REQUIREMENT__PRIORITY:
			return getPriority();
		case GorgeousFood_Increment1Package.REQUIREMENT__AUTHOR:
			return getAuthor();
		case GorgeousFood_Increment1Package.REQUIREMENT__CREATED:
			return getCreated();
		case GorgeousFood_Increment1Package.REQUIREMENT__ID:
			return getId();
		case GorgeousFood_Increment1Package.REQUIREMENT__STATE:
			return getState();
		case GorgeousFood_Increment1Package.REQUIREMENT__RESOLUTION:
			return getResolution();
		case GorgeousFood_Increment1Package.REQUIREMENT__DEPENDENCIES:
			return getDependencies();
		case GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN:
			return getChildren();
		case GorgeousFood_Increment1Package.REQUIREMENT__PARENT:
			return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GorgeousFood_Increment1Package.REQUIREMENT__TITLE:
			setTitle((String) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__TYPE:
			setType((Type) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__COMMENT:
			getComment().clear();
			getComment().addAll((Collection<? extends Comment>) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__PRIORITY:
			setPriority((Priority) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__AUTHOR:
			setAuthor((String) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__CREATED:
			setCreated((Date) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__ID:
			setId((String) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__STATE:
			setState((State) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__RESOLUTION:
			setResolution((Resolution) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__DEPENDENCIES:
			getDependencies().clear();
			getDependencies().addAll((Collection<? extends Requirement>) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends Requirement>) newValue);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__PARENT:
			setParent((Requirement) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GorgeousFood_Increment1Package.REQUIREMENT__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__COMMENT:
			getComment().clear();
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__CREATED:
			setCreated(CREATED_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__STATE:
			setState(STATE_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__DEPENDENCIES:
			getDependencies().clear();
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN:
			getChildren().clear();
			return;
		case GorgeousFood_Increment1Package.REQUIREMENT__PARENT:
			setParent((Requirement) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GorgeousFood_Increment1Package.REQUIREMENT__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case GorgeousFood_Increment1Package.REQUIREMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GorgeousFood_Increment1Package.REQUIREMENT__TYPE:
			return type != TYPE_EDEFAULT;
		case GorgeousFood_Increment1Package.REQUIREMENT__COMMENT:
			return comment != null && !comment.isEmpty();
		case GorgeousFood_Increment1Package.REQUIREMENT__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case GorgeousFood_Increment1Package.REQUIREMENT__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case GorgeousFood_Increment1Package.REQUIREMENT__CREATED:
			return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
		case GorgeousFood_Increment1Package.REQUIREMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GorgeousFood_Increment1Package.REQUIREMENT__STATE:
			return state != STATE_EDEFAULT;
		case GorgeousFood_Increment1Package.REQUIREMENT__RESOLUTION:
			return resolution != RESOLUTION_EDEFAULT;
		case GorgeousFood_Increment1Package.REQUIREMENT__DEPENDENCIES:
			return dependencies != null && !dependencies.isEmpty();
		case GorgeousFood_Increment1Package.REQUIREMENT__CHILDREN:
			return children != null && !children.isEmpty();
		case GorgeousFood_Increment1Package.REQUIREMENT__PARENT:
			return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", priority: ");
		result.append(priority);
		result.append(", author: ");
		result.append(author);
		result.append(", created: ");
		result.append(created);
		result.append(", id: ");
		result.append(id);
		result.append(", state: ");
		result.append(state);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
