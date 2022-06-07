package com.revature.models;

/**
 * Users within the ERS application are categorized within the following roles:
 * <ul>
 *     <li>Employee</li>
 *     <li>Finance Manager</li>
 * </ul>
 *
 * Employees are the standard role for Users within the application.
 *
 * Finance Managers have additional permissions to process reimbursement requests.
 * <ul>
 *     <li>Finance Managers can submit reimbursement requests</li>
 *     <li>Finance Managers cannot process their own requests</li>
 * </ul>
 *
 * @author Center of Excellence
 */
public enum Role {

    EMPLOYEE {
        @Override
        public String toString() {
            return "Employee";
        }
    },
    FINANCE_MANAGER {
        @Override
        public String toString() {
            return "Finance Manager";
        }
    }

}
