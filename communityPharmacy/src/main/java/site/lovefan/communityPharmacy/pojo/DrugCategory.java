package site.lovefan.communityPharmacy.pojo;

import javax.persistence.*;

@Table(name = "t_drug_category")
public class DrugCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drug_id")
    private Long drugId;

    @Column(name = "category_id")
    private Long categoryId;

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
     * @return category_id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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