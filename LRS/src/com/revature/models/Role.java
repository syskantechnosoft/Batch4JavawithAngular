package com.revature.models;

/**
 * Users within the LRS application are categorized within the following roles:
 * <ul>
 *     <li>Employee</li>
 *     <li>Manager</li>
 * </ul>
 *
 * Employees are the standard role for Users within the application.
 *
 * Managers have additional permissions to process Leave requests.
 * <ul>
 *     <li>Managers can submit Leave requests</li>
 *     <li>Managers cannot process their own leave requests</li>
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
    MANAGER {
        @Override
        public String toString() {
            return "Manager";
        }
    }

}
