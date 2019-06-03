/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.xDstmdata.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage;
import org.xtext.unina.xdstmdata.xDstmdata.cExtchannel;
import org.xtext.unina.xdstmdata.xDstmdata.channel_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cExtchannel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.cExtchannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.cExtchannelImpl#getTString <em>TString</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.cExtchannelImpl#getTChn <em>TChn</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.impl.cExtchannelImpl#getTID <em>TID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cExtchannelImpl extends MinimalEObjectImpl.Container implements cExtchannel
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
   * The default value of the '{@link #getTString() <em>TString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTString()
   * @generated
   * @ordered
   */
  protected static final String TSTRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTString() <em>TString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTString()
   * @generated
   * @ordered
   */
  protected String tString = TSTRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getTChn() <em>TChn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTChn()
   * @generated
   * @ordered
   */
  protected channel_specifier tChn;

  /**
   * The default value of the '{@link #getTID() <em>TID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTID()
   * @generated
   * @ordered
   */
  protected static final String TID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTID() <em>TID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTID()
   * @generated
   * @ordered
   */
  protected String tID = TID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected cExtchannelImpl()
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
    return XDstmdataPackage.Literals.CEXTCHANNEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XDstmdataPackage.CEXTCHANNEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTString()
  {
    return tString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTString(String newTString)
  {
    String oldTString = tString;
    tString = newTString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDstmdataPackage.CEXTCHANNEL__TSTRING, oldTString, tString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public channel_specifier getTChn()
  {
    return tChn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTChn(channel_specifier newTChn, NotificationChain msgs)
  {
    channel_specifier oldTChn = tChn;
    tChn = newTChn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XDstmdataPackage.CEXTCHANNEL__TCHN, oldTChn, newTChn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTChn(channel_specifier newTChn)
  {
    if (newTChn != tChn)
    {
      NotificationChain msgs = null;
      if (tChn != null)
        msgs = ((InternalEObject)tChn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XDstmdataPackage.CEXTCHANNEL__TCHN, null, msgs);
      if (newTChn != null)
        msgs = ((InternalEObject)newTChn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XDstmdataPackage.CEXTCHANNEL__TCHN, null, msgs);
      msgs = basicSetTChn(newTChn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDstmdataPackage.CEXTCHANNEL__TCHN, newTChn, newTChn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTID()
  {
    return tID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTID(String newTID)
  {
    String oldTID = tID;
    tID = newTID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDstmdataPackage.CEXTCHANNEL__TID, oldTID, tID));
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
      case XDstmdataPackage.CEXTCHANNEL__TCHN:
        return basicSetTChn(null, msgs);
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
      case XDstmdataPackage.CEXTCHANNEL__NAME:
        return getName();
      case XDstmdataPackage.CEXTCHANNEL__TSTRING:
        return getTString();
      case XDstmdataPackage.CEXTCHANNEL__TCHN:
        return getTChn();
      case XDstmdataPackage.CEXTCHANNEL__TID:
        return getTID();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XDstmdataPackage.CEXTCHANNEL__NAME:
        setName((String)newValue);
        return;
      case XDstmdataPackage.CEXTCHANNEL__TSTRING:
        setTString((String)newValue);
        return;
      case XDstmdataPackage.CEXTCHANNEL__TCHN:
        setTChn((channel_specifier)newValue);
        return;
      case XDstmdataPackage.CEXTCHANNEL__TID:
        setTID((String)newValue);
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
      case XDstmdataPackage.CEXTCHANNEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XDstmdataPackage.CEXTCHANNEL__TSTRING:
        setTString(TSTRING_EDEFAULT);
        return;
      case XDstmdataPackage.CEXTCHANNEL__TCHN:
        setTChn((channel_specifier)null);
        return;
      case XDstmdataPackage.CEXTCHANNEL__TID:
        setTID(TID_EDEFAULT);
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
      case XDstmdataPackage.CEXTCHANNEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XDstmdataPackage.CEXTCHANNEL__TSTRING:
        return TSTRING_EDEFAULT == null ? tString != null : !TSTRING_EDEFAULT.equals(tString);
      case XDstmdataPackage.CEXTCHANNEL__TCHN:
        return tChn != null;
      case XDstmdataPackage.CEXTCHANNEL__TID:
        return TID_EDEFAULT == null ? tID != null : !TID_EDEFAULT.equals(tID);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", tString: ");
    result.append(tString);
    result.append(", tID: ");
    result.append(tID);
    result.append(')');
    return result.toString();
  }

} //cExtchannelImpl
