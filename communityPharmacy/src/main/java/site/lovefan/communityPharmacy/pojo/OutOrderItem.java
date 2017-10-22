package site.lovefan.communityPharmacy.pojo;

import javax.persistence.*;

@Table(name = "t_out_order_item")
public class OutOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "out_order_id")
    private Long outOrderId;

    @Column(name = "in_order_id")
    private Long inOrderId;

    @Column(name = "buy_count")
    private Long buyCount;

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
     * @return out_order_id
     */
    public Long getOutOrderId() {
        return outOrderId;
    }

    /**
     * @param outOrderId
     */
    public void setOutOrderId(Long outOrderId) {
        this.outOrderId = outOrderId;
    }

    /**
     * @return in_order_id
     */
    public Long getInOrderId() {
        return inOrderId;
    }

    /**
     * @param inOrderId
     */
    public void setInOrderId(Long inOrderId) {
        this.inOrderId = inOrderId;
    }

    /**
     * @return buy_count
     */
    public Long getBuyCount() {
        return buyCount;
    }

    /**
     * @param buyCount
     */
    public void setBuyCount(Long buyCount) {
        this.buyCount = buyCount;
    }
}