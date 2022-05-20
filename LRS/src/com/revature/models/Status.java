package com.revature.models;

/**
 * LeaveRequest within the LRS application transition through the following statuses:
 * <ul>
 *     <li>Pending</li>
 *     <li>Approved</li>
 *     <li>Denied</li>
 * </ul>
 *
 * Once Leave Request are processed, their final status cannot be changed.
 * A new LeaveRequest must be submitted.
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
