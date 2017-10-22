package site.lovefan.communityPharmacy.pojo;

import javax.persistence.*;

@Table(name = "t_drug_manufacturer")
public class DrugManufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drug_id")
    private Long drugId;

    @Column(name = "manufacturer_id")
    private Long manufacturerId;

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
     * @return manufacturer_id
     */
    public Long getManufacturerId() {
        return manufacturerId;
    }

    /**
     * @param manufacturerId
     */
    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
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