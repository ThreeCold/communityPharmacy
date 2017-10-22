package site.lovefan.communityPharmacy.pojo;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_out_orders")
public class OutOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "buyer_name")
    private String buyerName;

    @Column(name = "buyer_phone")
    private String buyerPhone;

    @Column(name = "sick_situation")
    private String sickSituation;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "create_time")
    private Timestamp createTime;

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
     * @return buyer_name
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * @param buyerName
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * @return buyer_phone
     */
    public String getBuyerPhone() {
        return buyerPhone;
    }

    /**
     * @param buyerPhone
     */
    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    /**
     * @return sick_situation
     */
    public String getSickSituation() {
        return sickSituation;
    }

    /**
     * @param sickSituation
     */
    public void setSickSituation(String sickSituation) {
        this.sickSituation = sickSituation;
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
     * @return create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}