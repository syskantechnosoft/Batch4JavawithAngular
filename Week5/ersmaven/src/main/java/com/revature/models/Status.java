package com.revature.models;

/**
 * Reimbursements within the ERS application transition through the following statuses:
 * <ul>
 *     <li>Pending</li>
 *     <li>Approved</li>
 *     <li>Denied</li>
 * </ul>
 *
 * Once reimbursements are processed, their final status cannot be changed.
 * A new reimbursement must be submitted.
 *
 * @author Center of Excellence
 */
public enum Status {

    PENDING {
        @Override
        public String toString() {
            return "Pending";
        }
    },
    APPROVED {
        @Override
        public String toString() {
            return "Approved";
        }
    },
    DENIED {
        @Override
        public String toString() {
            return "Denied";
        }
    }
}
