/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.xDstmdata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tMultitype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.tMultitype#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unina.xdstmdata.xDstmdata.tMultitype#getComposingtypes <em>Composingtypes</em>}</li>
 * </ul>
 *
 * @see org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage#gettMultitype()
 * @model
 * @generated
 */
public interface tMultitype extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage#gettMultitype_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.unina.xdstmdata.xDstmdata.tMultitype#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Composingtypes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unina.xdstmdata.xDstmdata.composingtype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composingtypes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composingtypes</em>' containment reference list.
   * @see org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage#gettMultitype_Composingtypes()
   * @model containment="true"
   * @generated
   */
  EList<composingtype> getComposingtypes();

} // tMultitype
