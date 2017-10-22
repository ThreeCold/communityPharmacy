package site.lovefan.communityPharmacy.pojo;

import javax.persistence.*;

@Table(name = "t_month_sale_stat")
public class MonthSaleStat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drug_id")
    private Long drugId;

    @Column(name = "total_count")
    private Long totalCount;

    @Column(name = "total_price")
    private Double totalPrice;

    private Integer year;

    private Integer month;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return drug_id
     */
    public Long getDrugId() {
        return drugId;
    }

    /**
     * @param drugId
     */
    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    /**
     * @return total_count
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @return total_price
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return month
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * @param month
     */
    public void setMonth(Integer month) {
        this.month = month;
    }
}