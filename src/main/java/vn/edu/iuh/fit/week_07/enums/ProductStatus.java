package vn.edu.iuh.fit.week_07.enums;

public enum ProductStatus {
    ACTIVE(0), TERMINATED(1), IN_ACTIVE(2);
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
