package com.revature.services;

import com.revature.models.LeaveRequest;
import com.revature.models.Status;
import com.revature.models.User;

import java.util.Collections;
import java.util.List;

/**
 * The LeaveRequestService should handle the submission, processing,
 * and retrieval of LeaveRequests for the ERS application.
 *
 * {@code process} and {@code getLeaveRequestsByStatus} are the minimum methods required;
 * however, additional methods can be added.
 *
 * Examples:
 * <ul>
 *     <li>Create LeaveRequest</li>
 *     <li>Update LeaveRequest</li>
 *     <li>Get LeaveRequests by ID</li>
 *     <li>Get LeaveRequests by Requestor</li>
 *     <li>Get LeaveRequests by Approver</li>
 *     <li>Get All LeaveRequests</li>
 * </ul>
 */
public class LeaveRequestService {

    /**
     * <ul>
     *     <li>Should ensure that the user is logged in as a Finance Manager</li>
     *     <li>Must throw exception if user is not logged in as a Finance Manager</li>
     *     <li>Should ensure that the reimbursement request exists</li>
     *     <li>Must throw exception if the reimbursement request is not found</li>
     *     <li>Should persist the updated reimbursement status with resolver information</li>
     *     <li>Must throw exception if persistence is unsuccessful</li>
     * </ul>
     *
     * Note: unprocessedLeaveRequest will have a status of PENDING, a non-zero ID and amount, and a non-null Author.
     * The Resolver should be null. Additional fields may be null.
     * After processing, the reimbursement will have its status changed to either APPROVED or DENIED.
     */
    public LeaveRequest process(LeaveRequest unprocessedLeaveRequest, Status finalStatus, User resolver) {
        return null;
    }

    /**
     * Should retrieve all reimbursements with the correct status.
     */
    public List<LeaveRequest> getLeaveRequestsByStatus(Status status) {
        return Collections.emptyList();
    }
}
