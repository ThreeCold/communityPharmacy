package site.lovefan.communityPharmacy.pojo;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_in_orders")
public class InOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drug_id")
    private Long drugId;

    @Column(name = "in_price")
    private Double inPrice;

    @Column(name = "out_price")
    private Double outPrice;

    @Column(name = "out_factory_time")
    private Timestamp outFactoryTime;

    private Long count;

    @Column(name = "expire_time")
    private Timestamp expireTime;

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
     * @return in_price
     */
    public Double getInPrice() {
        return inPrice;
    }

    /**
     * @param inPrice
     */
    public void setInPrice(Double inPrice) {
        this.inPrice = inPrice;
    }

    /**
     * @return out_price
     */
    public Double getOutPrice() {
        return outPrice;
    }

    /**
     * @param outPrice
     */
    public void setOutPrice(Double outPrice) {
        this.outPrice = outPrice;
    }

    /**
     * @return out_factory_time
     */
    public Timestamp getOutFactoryTime() {
        return outFactoryTime;
    }

    /**
     * @param outFactoryTime
     */
    public void setOutFactoryTime(Timestamp outFactoryTime) {
        this.outFactoryTime = outFactoryTime;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * @return expire_time
     */
    public Timestamp getExpireTime() {
        return expireTime;
    }

    /**
     * @param expireTime
     */
    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }
}