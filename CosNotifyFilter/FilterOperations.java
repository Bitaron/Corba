package CosNotifyFilter;


/**
* CosNotifyFilter/FilterOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from E:/projects/Corba/IDL/CosNotifyFilter.idl
* Thursday, February 1, 2018 2:55:12 PM BDT
*/


/**
    * Interface for a filter.
    */
public interface FilterOperations 
{

  /**
         * The constraint grammer used by this filter.
         */
  String constraint_grammar ();

  /**
         * Associates one or more constraints with this filter object.
         * @parm <code>constraint_list</code> - List of constraints to be
         * associated with filter.
         * @returns A list with ID for each of the added constraints.
         * @raises InvalidConstraint If any of the constraints are invalid.
         */
  CosNotifyFilter.ConstraintInfo[] add_constraints (CosNotifyFilter.ConstraintExp[] constraint_list) throws CosNotifyFilter.InvalidConstraint;

  /**
         * Delete or modify constraints on this filter object.
         * @parm <code>del_list</code> - List of constraints to delete.
         * @parm <code>modify_list</code> - List of constraints to modify.
         * @raises InvalidConstraint If any of the constraints in the
         * <code>modify_list</code> input sequences are invalid.
         * @raises ConstraintNotFound If a constraint in either
         * of the two input sequences was not found.
         */
  void modify_constraints (int[] del_list, CosNotifyFilter.ConstraintInfo[] modify_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.ConstraintNotFound;

  /**
         * Return a list of constraints for this filter object based on IDs.
         * @parm <code>id_list</code> - List of constraint IDs.
         * @returns A list of constraints for the IDs in the input sequence.
         * @raises ConstraintNotFound If a constraint was not found.
         */
  CosNotifyFilter.ConstraintInfo[] get_constraints (int[] id_list) throws CosNotifyFilter.ConstraintNotFound;

  /**
         * Return a list of all constraints for this filter object.
         * @returns A list of all constraints.
         */
  CosNotifyFilter.ConstraintInfo[] get_all_constraints ();

  /**
         * Removes all constraints defined on this filter object.
         */
  void remove_all_constraints ();

  /**
         * Destroys this filter object.
         */
  void destroy ();

  /**
         * Evaluates the input event against the filter constraints defined
         * on this filter object. If the event satisfies one of the filter
         * constraints TRUE is returned, otherwise FALSE is returned.
         * @parm <code>filterable_data</code> - The event to evaluate.
         * @returns TRUE if event matches any constraint, FALSE otherwise.
         * raises UnsupportedFilterableData If the event specified by
         * <code>filterable_data</code> contains data that this filter is
         * not designed to handle.
         */
  boolean match (org.omg.CORBA.Any filterable_data) throws CosNotifyFilter.UnsupportedFilterableData;

  /**
         * Evaluates the input event against the filter constraints defined
         * on this filter object. If the event satisfies one of the filter
         * constraints TRUE is returned, otherwise FALSE is returned.
         * @parm <code>filterable_data</code> - The structured event to evaluate.
         * @returns TRUE if event matches any constraint, FALSE otherwise.
         * raises UnsupportedFilterableData If the event specified by
         * <code>filterable_data</code> contains data that this filter is
         * not designed to handle.
         */
  boolean match_structured (CosNotification.StructuredEvent filterable_data) throws CosNotifyFilter.UnsupportedFilterableData;

  /**
         * Evaluates the input event against the filter constraints defined
         * on this filter object. If the event satisfies one of the filter
         * constraints TRUE is returned, otherwise FALSE is returned.
         * @parm <code>filterable_data</code> - The typed event to evaluate.
         * @returns TRUE if event matches any constraint, FALSE otherwise.
         * raises UnsupportedFilterableData If the event specified by
         * <code>filterable_data</code> contains data that this filter is
         * not designed to handle.
         */
  boolean match_typed (CosNotification.Property[] filterable_data) throws CosNotifyFilter.UnsupportedFilterableData;

  /**
         * Attach a callback object to this filter that will be notified
         * each time the constraints on this filter are modified.
         * @parm <code>callback</code> - A callback object reference of type
         * NotifySubscribe.
         * @returns A ID which is unique for the newly attached object.
         */
  int attach_callback (CosNotifyComm.NotifySubscribe callback);

  /**
         * Detach a callback object from this filter.
         * @parm <code>callback</code> - ID of the callback object to detach.
         * @raises CallbackNotFound If the ID does not correspond to any
         * attached callback object reference.
         */
  void detach_callback (int callback) throws CosNotifyFilter.CallbackNotFound;

  /**
         * Returns a list of callback objects attached to this filter.
         * @returns List of callback object IDs.
         */
  int[] get_callbacks ();
} // interface FilterOperations
