package vn.edu.iuh.fit.week_07.enums;

public enum EmployeeStatus {
    ACTIVE(0), TERMINATED(1), IN_ACTIVE(2);
    private int value;

    EmployeeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

