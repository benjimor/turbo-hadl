/**
 */
package hADLM1;

import hADL.Liens.LienAttachementPRRT;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Attachement Y3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hADLM1.LienAttachementY3#getSecurityauth_portrequis <em>Securityauth portrequis</em>}</li>
 *   <li>{@link hADLM1.LienAttachementY3#getClearencerequest_roleto <em>Clearencerequest roleto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienAttachementY3 extends LienAttachementPRRT {
	/**
	 * The cached value of the '{@link #getSecurityauth_portrequis() <em>Securityauth portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityauth_portrequis()
	 * @generated
	 * @ordered
	 */
	protected SecurityAuth_PortRequis securityauth_portrequis;

	/**
	 * The cached value of the '{@link #getClearencerequest_roleto() <em>Clearencerequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearencerequest_roleto()
	 * @generated
	 * @ordered
	 */
	protected ClearenceRequest_RoleTo clearencerequest_roleto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienAttachementY3() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HADLM1Package.Literals.LIEN_ATTACHEMENT_Y3;
	}

	/**
	 * Returns the value of the '<em><b>Securityauth portrequis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityauth portrequis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityauth portrequis</em>' containment reference.
	 * @see #setSecurityauth_portrequis(SecurityAuth_PortRequis)
	 * @generated
	 */
	public SecurityAuth_PortRequis getSecurityauth_portrequis() {
		return securityauth_portrequis;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementY3#getSecurityauth_portrequis <em>Securityauth portrequis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securityauth portrequis</em>' containment reference.
	 * @see #getSecurityauth_portrequis()
	 * @generated
	 */
	public void setSecurityauth_portrequis(SecurityAuth_PortRequis newSecurityauth_portrequis) {
		securityauth_portrequis = newSecurityauth_portrequis;
	}

	/**
	 * Returns the value of the '<em><b>Clearencerequest roleto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearencerequest roleto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearencerequest roleto</em>' containment reference.
	 * @see #setClearencerequest_roleto(ClearenceRequest_RoleTo)
	 * @generated
	 */
	public ClearenceRequest_RoleTo getClearencerequest_roleto() {
		return clearencerequest_roleto;
	}

	/**
	 * Sets the value of the '{@link hADLM1.LienAttachementY3#getClearencerequest_roleto <em>Clearencerequest roleto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearencerequest roleto</em>' containment reference.
	 * @see #getClearencerequest_roleto()
	 * @generated
	 */
	public void setClearencerequest_roleto(ClearenceRequest_RoleTo newClearencerequest_roleto) {
		clearencerequest_roleto = newClearencerequest_roleto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__SECURITYAUTH_PORTREQUIS:
				return getSecurityauth_portrequis();
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__CLEARENCEREQUEST_ROLETO:
				return getClearencerequest_roleto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__SECURITYAUTH_PORTREQUIS:
				setSecurityauth_portrequis((SecurityAuth_PortRequis)newValue);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__CLEARENCEREQUEST_ROLETO:
				setClearencerequest_roleto((ClearenceRequest_RoleTo)newValue);
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__SECURITYAUTH_PORTREQUIS:
				setSecurityauth_portrequis((SecurityAuth_PortRequis)null);
				return;
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__CLEARENCEREQUEST_ROLETO:
				setClearencerequest_roleto((ClearenceRequest_RoleTo)null);
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
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__SECURITYAUTH_PORTREQUIS:
				return securityauth_portrequis != null;
			case HADLM1Package.LIEN_ATTACHEMENT_Y3__CLEARENCEREQUEST_ROLETO:
				return clearencerequest_roleto != null;
		}
		return super.eIsSet(featureID);
	}

} // LienAttachementY3
