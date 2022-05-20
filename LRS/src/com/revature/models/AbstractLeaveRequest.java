package com.revature.models;

import java.util.Objects;

/**
 * This AbstractLeaveRequest class defines a minimum functionality for
 * interacting with LeaveRequest in the LRS application.
 *
 * All LeaveRequest in this application must at least have:
 * <ul>
 * <li>ID</li>
 * <li>Status</li>
 * <li>Requestor</li>
 * <li>Approver</li>
 * <li>NoOfDays</li>
 * </ul>
 *
 * Additional fields can be added to the concrete
 * {@link com.revature.models.LeaveRequest} class.
 *
 * @author Center of Excellence
 */
public class AbstractLeaveRequest {

	private int id;
	private Status status;
	private User requestor;
	private User approver;
	private int noOfDays;

	public AbstractLeaveRequest() {
		super();
	}

	public AbstractLeaveRequest(int id, Status status, User requestor, User approver, int noOfDays) {
		super();
		this.id = id;
		this.status = status;
		this.requestor = requestor;
		this.approver = approver;
		this.noOfDays = noOfDays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getRequestor() {
		return requestor;
	}

	public void setRequestor(User requestor) {
		this.requestor = requestor;
	}

	public User getApprover() {
		return approver;
	}

	public void setApprover(User approver) {
		this.approver = approver;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public int hashCode() {
		return Objects.hash(approver, id, noOfDays, requestor, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractLeaveRequest other = (AbstractLeaveRequest) obj;
		return Objects.equals(approver, other.approver) && id == other.id && noOfDays == other.noOfDays
				&& Objects.equals(requestor, other.requestor) && status == other.status;
	}

	@Override
	public String toString() {
		return "AbstractLeaveRequest [id=" + id + ", status=" + status + ", requestor=" + requestor + ", approver="
				+ approver + ", noOfDays=" + noOfDays + "]";
	}

}
