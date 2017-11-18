package MASK.Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "known_theft", schema = "mask", catalog = "")
public class KnownTheftEntity {
    private int ktId;
    private Date date;
    private Time time;
    private String productName;
    private String styleColor;
    private int quantity;
    private String size;
    private String ourPrice;
    private String athleteName;
    private String circumstance;
    private String gender;
    private String department;
    private String month;
    private String quarter;
    private String fiscalYear;

    @Id
    @Column(name = "kt_id")
    public int getKtId() {
        return ktId;
    }

    public void setKtId(int ktId) {
        this.ktId = ktId;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "style_color")
    public String getStyleColor() {
        return styleColor;
    }

    public void setStyleColor(String styleColor) {
        this.styleColor = styleColor;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "our_price")
    public String getOurPrice() {
        return ourPrice;
    }

    public void setOurPrice(String ourPrice) {
        this.ourPrice = ourPrice;
    }

    @Basic
    @Column(name = "athlete_name")
    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    @Basic
    @Column(name = "circumstance")
    public String getCircumstance() {
        return circumstance;
    }

    public void setCircumstance(String circumstance) {
        this.circumstance = circumstance;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "month")
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Basic
    @Column(name = "quarter")
    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    @Basic
    @Column(name = "fiscal_year")
    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KnownTheftEntity that = (KnownTheftEntity) o;

        if (ktId != that.ktId) return false;
        if (quantity != that.quantity) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (styleColor != null ? !styleColor.equals(that.styleColor) : that.styleColor != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (ourPrice != null ? !ourPrice.equals(that.ourPrice) : that.ourPrice != null) return false;
        if (athleteName != null ? !athleteName.equals(that.athleteName) : that.athleteName != null) return false;
        if (circumstance != null ? !circumstance.equals(that.circumstance) : that.circumstance != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (quarter != null ? !quarter.equals(that.quarter) : that.quarter != null) return false;
        if (fiscalYear != null ? !fiscalYear.equals(that.fiscalYear) : that.fiscalYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ktId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (styleColor != null ? styleColor.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (ourPrice != null ? ourPrice.hashCode() : 0);
        result = 31 * result + (athleteName != null ? athleteName.hashCode() : 0);
        result = 31 * result + (circumstance != null ? circumstance.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (quarter != null ? quarter.hashCode() : 0);
        result = 31 * result + (fiscalYear != null ? fiscalYear.hashCode() : 0);
        return result;
    }
}
