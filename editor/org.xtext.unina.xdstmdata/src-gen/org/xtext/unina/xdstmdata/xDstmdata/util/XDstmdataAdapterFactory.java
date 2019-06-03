/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.xDstmdata.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.unina.xdstmdata.xDstmdata.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage
 * @generated
 */
public class XDstmdataAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XDstmdataPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDstmdataAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XDstmdataPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XDstmdataSwitch<Adapter> modelSwitch =
    new XDstmdataSwitch<Adapter>()
    {
      @Override
      public Adapter casetTypes(tTypes object)
      {
        return createtTypesAdapter();
      }
      @Override
      public Adapter casetEnum(tEnum object)
      {
        return createtEnumAdapter();
      }
      @Override
      public Adapter casetCompound(tCompound object)
      {
        return createtCompoundAdapter();
      }
      @Override
      public Adapter casesubtype(subtype object)
      {
        return createsubtypeAdapter();
      }
      @Override
      public Adapter casechannel_specifier(channel_specifier object)
      {
        return createchannel_specifierAdapter();
      }
      @Override
      public Adapter casetMultitype(tMultitype object)
      {
        return createtMultitypeAdapter();
      }
      @Override
      public Adapter casecomposingtype(composingtype object)
      {
        return createcomposingtypeAdapter();
      }
      @Override
      public Adapter casecIntchannel(cIntchannel object)
      {
        return createcIntchannelAdapter();
      }
      @Override
      public Adapter casecExtchannel(cExtchannel object)
      {
        return createcExtchannelAdapter();
      }
      @Override
      public Adapter casevVariable(vVariable object)
      {
        return createvVariableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.tTypes <em>tTypes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.tTypes
   * @generated
   */
  public Adapter createtTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.tEnum <em>tEnum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.tEnum
   * @generated
   */
  public Adapter createtEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.tCompound <em>tCompound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.tCompound
   * @generated
   */
  public Adapter createtCompoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.subtype <em>subtype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.subtype
   * @generated
   */
  public Adapter createsubtypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.channel_specifier <em>channel specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.channel_specifier
   * @generated
   */
  public Adapter createchannel_specifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.tMultitype <em>tMultitype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.tMultitype
   * @generated
   */
  public Adapter createtMultitypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.composingtype <em>composingtype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.composingtype
   * @generated
   */
  public Adapter createcomposingtypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.cIntchannel <em>cIntchannel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.cIntchannel
   * @generated
   */
  public Adapter createcIntchannelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.cExtchannel <em>cExtchannel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.cExtchannel
   * @generated
   */
  public Adapter createcExtchannelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.unina.xdstmdata.xDstmdata.vVariable <em>vVariable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.unina.xdstmdata.xDstmdata.vVariable
   * @generated
   */
  public Adapter createvVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XDstmdataAdapterFactory