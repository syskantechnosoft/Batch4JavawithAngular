package com.revature.models;

/**
 * This concrete LeaveRequest class can include additional fields that can be
 * used for extended functionality of the LRS application.
 *
 * Example fields:
 * <ul>
 * <li>Description</li>
 * <li>Creation Date</li>
 * <li>Approval Date</li>
 * <li>Reason</li>
 * </ul>
 *
 */
public class LeaveRequest extends AbstractLeaveRequest {

	public LeaveRequest() {
		super();
	}

	/**
	 * This includes the minimum parameters needed for the
	 * {@link com.revature.models.AbstractLeaveRequest} class. If other fields are
	 * needed, please create additional constructors.
	 */
	public LeaveRequest(int id, Status status, User requstor, User approver, int noOfDays) {
		super(id, status, requstor, approver, noOfDays);
	}
}
