package MASK.Model;

import javax.persistence.*;

@Entity
@Table(name = "fw_markdowns", schema = "mask", catalog = "")
public class FwMarkdownsEntity {
    private int fwmarkdownId;
    private String productName;
    private String styleColor;
    private String ourPrice;
    private String markdownPrice;
    private String quantityMarked;
    private String gender;
    private String monthMarked;
    private String fiscalYear;
    private String athleteName;

    @Id
    @Column(name = "fwmarkdown_id")
    public int getFwmarkdownId() {
        return fwmarkdownId;
    }

    public void setFwmarkdownId(int fwmarkdownId) {
        this.fwmarkdownId = fwmarkdownId;
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
    @Column(name = "our_price")
    public String getOurPrice() {
        return ourPrice;
    }

    public void setOurPrice(String ourPrice) {
        this.ourPrice = ourPrice;
    }

    @Basic
    @Column(name = "markdown_price")
    public String getMarkdownPrice() {
        return markdownPrice;
    }

    public void setMarkdownPrice(String markdownPrice) {
        this.markdownPrice = markdownPrice;
    }

    @Basic
    @Column(name = "quantity_marked")
    public String getQuantityMarked() {
        return quantityMarked;
    }

    public void setQuantityMarked(String quantityMarked) {
        this.quantityMarked = quantityMarked;
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
    @Column(name = "month_marked")
    public String getMonthMarked() {
        return monthMarked;
    }

    public void setMonthMarked(String monthMarked) {
        this.monthMarked = monthMarked;
    }

    @Basic
    @Column(name = "fiscal_year")
    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Basic
    @Column(name = "athlete_name")
    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FwMarkdownsEntity that = (FwMarkdownsEntity) o;

        if (fwmarkdownId != that.fwmarkdownId) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (styleColor != null ? !styleColor.equals(that.styleColor) : that.styleColor != null) return false;
        if (ourPrice != null ? !ourPrice.equals(that.ourPrice) : that.ourPrice != null) return false;
        if (markdownPrice != null ? !markdownPrice.equals(that.markdownPrice) : that.markdownPrice != null)
            return false;
        if (quantityMarked != null ? !quantityMarked.equals(that.quantityMarked) : that.quantityMarked != null)
            return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (monthMarked != null ? !monthMarked.equals(that.monthMarked) : that.monthMarked != null) return false;
        if (fiscalYear != null ? !fiscalYear.equals(that.fiscalYear) : that.fiscalYear != null) return false;
        if (athleteName != null ? !athleteName.equals(that.athleteName) : that.athleteName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fwmarkdownId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (styleColor != null ? styleColor.hashCode() : 0);
        result = 31 * result + (ourPrice != null ? ourPrice.hashCode() : 0);
        result = 31 * result + (markdownPrice != null ? markdownPrice.hashCode() : 0);
        result = 31 * result + (quantityMarked != null ? quantityMarked.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (monthMarked != null ? monthMarked.hashCode() : 0);
        result = 31 * result + (fiscalYear != null ? fiscalYear.hashCode() : 0);
        result = 31 * result + (athleteName != null ? athleteName.hashCode() : 0);
        return result;
    }
}
