package site.lovefan.communityPharmacy.pojo;

import javax.persistence.*;

@Table(name = "t_drugs")
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String number;

    private String component;

    private String brand;

    private String desc;

    @Column(name = "taboo_crowd")
    private String tabooCrowd;

    private Boolean enabled;

    private String instructions;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return component
     */
    public String getComponent() {
        return component;
    }

    /**
     * @param component
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return taboo_crowd
     */
    public String getTabooCrowd() {
        return tabooCrowd;
    }

    /**
     * @param tabooCrowd
     */
    public void setTabooCrowd(String tabooCrowd) {
        this.tabooCrowd = tabooCrowd;
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

    /**
     * @return instructions
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * @param instructions
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}