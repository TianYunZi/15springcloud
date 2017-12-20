package test.practise.org.enums;


/**
 * Created by Max on 2017/12/7.
 */
public enum OrganizationType {
    CARRIER(1, "CARRIER"), //保险公司

    BROKER(2, "BROKER"), //经纪公司

    STUDIO(3, "STUDIO"), //工作室

    FINACIAL_SERVICE(4, "FINACIAL_SERVICE"); //保理公司

    private int value;

    private String description;

    OrganizationType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
