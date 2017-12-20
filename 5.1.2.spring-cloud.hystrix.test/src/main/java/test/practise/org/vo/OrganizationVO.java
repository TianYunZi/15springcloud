package test.practise.org.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import test.practise.org.enums.OrganizationType;
import test.practise.org.utils.JsonDateDeserializer;

import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganizationVO {

    private Long id;

    private String createUser;

    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date createDate;

    private String updateUser;

    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date updateDate;

    /**
     * 机构类型（枚举）
     */
    private OrganizationType organizationType;

    /**
     * 机构名称
     */
    private String organizationName;

    /**
     * 机构简介
     */
    private String introduction;

    /**
     * 图片相对路径
     */
    private String logoPath;

    /**
     * 地址
     */
    private String addressLine;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 经纪公司：佣金结算日
     */
    private String commissionSettlementDate;

    /**
     * 工作室：佣金结算方式(枚举)
     */
    private Integer commissionSettlementMethod;

    /**
     * 上级机构id
     */
    private Long parentOrganization;

    /**
     * 是否为代理商
     */
    private Boolean isSiebreAgent;

    /**
     * 上级代理商id
     */
    private Long parentSiebreAgent;

    /**
     * 关联金融服务公司id
     */
    private Long associatedFinacialServiceOrg;

    /**
     * 经纪公司：授信额度
     */
    private BigDecimal creditLimit;

    /**
     * 工作室：保证金
     */
    private BigDecimal margin;

    /**
     * 银行帐户ref_id
     */
    private Long bankAccountId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCommissionSettlementDate() {
        return commissionSettlementDate;
    }

    public void setCommissionSettlementDate(String commissionSettlementDate) {
        this.commissionSettlementDate = commissionSettlementDate;
    }

    public Integer getCommissionSettlementMethod() {
        return commissionSettlementMethod;
    }

    public void setCommissionSettlementMethod(Integer commissionSettlementMethod) {
        this.commissionSettlementMethod = commissionSettlementMethod;
    }

    public Long getParentOrganization() {
        return parentOrganization;
    }

    public void setParentOrganization(Long parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public Boolean getSiebreAgent() {
        return isSiebreAgent;
    }

    public void setSiebreAgent(Boolean siebreAgent) {
        isSiebreAgent = siebreAgent;
    }

    public Long getParentSiebreAgent() {
        return parentSiebreAgent;
    }

    public void setParentSiebreAgent(Long parentSiebreAgent) {
        this.parentSiebreAgent = parentSiebreAgent;
    }

    public Long getAssociatedFinacialServiceOrg() {
        return associatedFinacialServiceOrg;
    }

    public void setAssociatedFinacialServiceOrg(Long associatedFinacialServiceOrg) {
        this.associatedFinacialServiceOrg = associatedFinacialServiceOrg;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public Long getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @Override
    public String toString() {
        return "OrganizationVO{" +
                "id=" + id +
                ", createUser='" + createUser + '\'' +
                ", createDate=" + createDate +
                ", updateUser='" + updateUser + '\'' +
                ", updateDate=" + updateDate +
                ", organizationType=" + organizationType +
                ", organizationName='" + organizationName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", logoPath='" + logoPath + '\'' +
                ", addressLine='" + addressLine + '\'' +
                ", postCode='" + postCode + '\'' +
                ", commissionSettlementDate='" + commissionSettlementDate + '\'' +
                ", commissionSettlementMethod=" + commissionSettlementMethod +
                ", parentOrganization=" + parentOrganization +
                ", isSiebreAgent=" + isSiebreAgent +
                ", parentSiebreAgent=" + parentSiebreAgent +
                ", associatedFinacialServiceOrg=" + associatedFinacialServiceOrg +
                ", creditLimit=" + creditLimit +
                ", margin=" + margin +
                ", bankAccountId=" + bankAccountId +
                '}';
    }
}
