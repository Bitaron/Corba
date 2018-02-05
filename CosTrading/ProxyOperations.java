package CosTrading;


/**
* CosTrading/ProxyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosTrading.idl
* Thursday, February 1, 2018 2:55:15 PM BDT
*/


/** This interface supports proxy offers.
 * It is not yet supported.
 */
public interface ProxyOperations  extends CosTrading.TraderComponentsOperations, CosTrading.SupportAttributesOperations
{

  /* doc: 51 */
  String export_proxy (CosTrading.Lookup target, String type, CosTrading.Property[] properties, boolean if_match_all, String recipe, CosTrading.Policy[] policies_to_pass_on) throws CosTrading.IllegalServiceType, CosTrading.UnknownServiceType, CosTrading.InvalidLookupRef, CosTrading.IllegalPropertyName, CosTrading.PropertyTypeMismatch, CosTrading.ReadonlyDynamicProperty, CosTrading.MissingMandatoryProperty, CosTrading.ProxyPackage.IllegalRecipe, CosTrading.DuplicatePropertyName, CosTrading.DuplicatePolicyName;

  /* enddoc */
  void withdraw_proxy (String id) throws CosTrading.IllegalOfferId, CosTrading.UnknownOfferId, CosTrading.ProxyPackage.NotProxyOfferId;
  CosTrading.ProxyPackage.ProxyInfo describe_proxy (String id) throws CosTrading.IllegalOfferId, CosTrading.UnknownOfferId, CosTrading.ProxyPackage.NotProxyOfferId;
} // interface ProxyOperations
