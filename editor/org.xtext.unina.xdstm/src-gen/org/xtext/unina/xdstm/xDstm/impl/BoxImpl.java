/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstm.xDstm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.unina.xdstm.xDstm.Box;
import org.xtext.unina.xdstm.xDstm.Machine;
import org.xtext.unina.xdstm.xDstm.XDstmPackage;
import org.xtext.unina.xdstm.xDstm.requirements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.impl.BoxImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.impl.BoxImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.impl.BoxImpl#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoxImpl extends VertexImpl implements Box
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected requirements requirements;

  /**
   * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstantiation()
   * @generated
   * @ordered
   */
  protected EList<Machine> instantiation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoxImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XDstmPackage.Literals.BOX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDstmPackage.BOX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public requirements getRequirements()
  {
    return requirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequirements(requirements newRequirements, NotificationChain msgs)
  {
    requirements oldRequirements = requirements;
    requirements = newRequirements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDstmPackage.BOX__REQUIREMENTS, oldRequirements, newRequirements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequirements(requirements newRequirements)
  {
    if (newRequirements != requirements)
    {
      NotificationChain msgs = null;
      if (requirements != null)
        msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDstmPackage.BOX__REQUIREMENTS, null, msgs);
      if (newRequirements != null)
        msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDstmPackage.BOX__REQUIREMENTS, null, msgs);
      msgs = basicSetRequirements(newRequirements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDstmPackage.BOX__REQUIREMENTS, newRequirements, newRequirements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Machine> getInstantiation()
  {
    if (instantiation == null)
    {
      instantiation = new EObjectResolvingEList<Machine>(Machine.class, this, XDstmPackage.BOX__INSTANTIATION);
    }
    return instantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XDstmPackage.BOX__REQUIREMENTS:
        return basicSetRequirements(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XDstmPackage.BOX__NAME:
        return getName();
      case XDstmPackage.BOX__REQUIREMENTS:
        return getRequirements();
      case XDstmPackage.BOX__INSTANTIATION:
        return getInstantiation();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XDstmPackage.BOX__NAME:
        setName((String)newValue);
        return;
      case XDstmPackage.BOX__REQUIREMENTS:
        setRequirements((requirements)newValue);
        return;
      case XDstmPackage.BOX__INSTANTIATION:
        getInstantiation().clear();
        getInstantiation().addAll((Collection<? extends Machine>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XDstmPackage.BOX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XDstmPackage.BOX__REQUIREMENTS:
        setRequirements((requirements)null);
        return;
      case XDstmPackage.BOX__INSTANTIATION:
        getInstantiation().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XDstmPackage.BOX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XDstmPackage.BOX__REQUIREMENTS:
        return requirements != null;
      case XDstmPackage.BOX__INSTANTIATION:
        return instantiation != null && !instantiation.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BoxImpl