package vn.edu.iuh.fit.week_07.enums;

public enum EmployeeStatus {
    ACTIVE(1), TERMINATED(0), IN_ACTIVE(-1);
    private int value;

    EmployeeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

