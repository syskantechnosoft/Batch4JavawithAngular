package com.revature.repositories;

import com.revature.models.LeaveRequest;
import com.revature.models.Status;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class LeaveRequestDAO {

    /**
     * Should retrieve a LeaveReauest from the DB with the corresponding id or an empty optional if there is no match.
     */
    public Optional<LeaveRequest> getById(int id) {
        return Optional.empty();
    }

    /**
     * Should retrieve a List of LeaveRequests from the DB with the corresponding Status or an empty List if there are no matches.
     */
    public List<LeaveRequest> getByStatus(Status status) {
        return Collections.emptyList();
    }

    /**
     * <ul>
     *     <li>Should Update an existing LeaveRequest record in the DB with the provided information.</li>
     *     <li>Should throw an exception if the update is unsuccessful.</li>
     *     <li>Should return a LeaveRequest object with updated information.</li>
     * </ul>
     */
    public LeaveRequest update(LeaveRequest unprocessedLeaveRequest) {
    	return null;
    }
}
