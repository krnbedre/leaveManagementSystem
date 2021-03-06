package com.dhdigital.lms.net;

/**
 * Created by DarkHorse on 6/11/15.
 */
public class APIUrls {

    private static final String DEV_BASE_URL = "http://219.65.70.150/lms/";
    private static final String LOCAL_HOST_URL = "http://192.168.10.37:8080/lms/";
    private static final String PROD_BASE_URL = "http://192.168.50.9:8080/lms/";
    private static final String BASE_URL = LOCAL_HOST_URL;            // change this from dev to prod at the time of release
    public static final String LOGIN_URL = BASE_URL + "user";
    public static final String LOGOUT_URL = BASE_URL + "logout";
    public static final String MASTER_DATA_URL = BASE_URL + "masters/list/";
    public static final String SUBMIT_LEAVE_REQ_URL = BASE_URL + "leave/save";
    public static final String LEAVE_BAL_URL = BASE_URL + "leave/available/balance";
    public static final String APPROVE_LEAVE = BASE_URL + "approve";
    public static final String MY_LEAVES = BASE_URL + "myLeaves";
    public static final String USER_DASHBOARD = BASE_URL + "leave/dashboard";
    public static final String CANCEL_LEAVE = BASE_URL + "cancel";
    public static final String CALCULATE_LEAVE_DAYS = BASE_URL + "leave/calculateLeaveDays";
    public static final String APPROVER_TASKS = BASE_URL + "myTasks";
    public static final String APPROVER_TASK_URL = BASE_URL + "approve";
    public static final String REJECT_TASK_URL = BASE_URL + "reject";
    public static final String FILE_DOWNLOAD = BASE_URL + "file/download";
    public static final String GET_EMPLOYEES = BASE_URL + "employee/getEmployees";
    public static final String GET_EMPLOYEES_FOR_TEAM = BASE_URL + "employee/getEmployeesForTeam";
    public static final String GET_HOLIDAY_LIST = BASE_URL + "holidaysList";
    public static final String CHANGE_PASSWORD = BASE_URL + "changepassword";
    public static final String GET_TEAMS = BASE_URL + "employee/getTeams";
    public static final String GET_LEAVE_DETAILS = BASE_URL + "getLeave";



}

