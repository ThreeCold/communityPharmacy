package site.lovefan.communityPharmacy.pojo;

import javax.persistence.*;

@Table(name = "t_repository")
public class Repository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "in_order_id")
    private Long inOrderId;

    @Column(name = "left_count")
    private Long leftCount;

    private Boolean enabled;

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
     * @return left_count
     */
    public Long getLeftCount() {
        return leftCount;
    }

    /**
     * @param leftCount
     */
    public void setLeftCount(Long leftCount) {
        this.leftCount = leftCount;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}