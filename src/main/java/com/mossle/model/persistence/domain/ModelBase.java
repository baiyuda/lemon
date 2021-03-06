package com.mossle.model.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ModelBase .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "MODEL_BASE")
public class ModelBase implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private ModelBase modelBase;

    /** null. */
    private ModelCategory modelCategory;

    /** null. */
    private String code;

    /** null. */
    private String name;

    /** null. */
    private String instanceId;

    /** null. */
    private String category;

    /** null. */
    private String processId;

    /** null. */
    private String processName;

    /** null. */
    private String processKey;

    /** null. */
    private Integer processVersion;

    /** null. */
    private String initiator;

    /** null. */
    private String initiatorDept;

    /** null. */
    private String applicant;

    /** null. */
    private String applicantDept;

    /** null. */
    private Date createTime;

    /** null. */
    private Date startTime;

    /** null. */
    private Date endTime;

    /** null. */
    private String type;

    /** null. */
    private String status;

    /** null. */
    private String deleteReason;

    /** null. */
    private String description;

    /** null. */
    private String tenantId;

    /** . */
    private Set<ModelRow> modelRows = new HashSet<ModelRow>(0);

    /** . */
    private Set<ModelBase> modelBases = new HashSet<ModelBase>(0);

    /** . */
    private Set<ModelItem> modelItems = new HashSet<ModelItem>(0);

    public ModelBase() {
    }

    public ModelBase(Long id) {
        this.id = id;
    }

    public ModelBase(Long id, ModelBase modelBase, ModelCategory modelCategory,
            String code, String name, String instanceId, String category,
            String processId, String processName, String processKey,
            Integer processVersion, String initiator, String initiatorDept,
            String applicant, String applicantDept, Date createTime,
            Date startTime, Date endTime, String type, String status,
            String deleteReason, String description, String tenantId,
            Set<ModelRow> modelRows, Set<ModelBase> modelBases,
            Set<ModelItem> modelItems) {
        this.id = id;
        this.modelBase = modelBase;
        this.modelCategory = modelCategory;
        this.code = code;
        this.name = name;
        this.instanceId = instanceId;
        this.category = category;
        this.processId = processId;
        this.processName = processName;
        this.processKey = processKey;
        this.processVersion = processVersion;
        this.initiator = initiator;
        this.initiatorDept = initiatorDept;
        this.applicant = applicant;
        this.applicantDept = applicantDept;
        this.createTime = createTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
        this.status = status;
        this.deleteReason = deleteReason;
        this.description = description;
        this.tenantId = tenantId;
        this.modelRows = modelRows;
        this.modelBases = modelBases;
        this.modelItems = modelItems;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    public ModelBase getModelBase() {
        return this.modelBase;
    }

    /**
     * @param modelBase
     *            null.
     */
    public void setModelBase(ModelBase modelBase) {
        this.modelBase = modelBase;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    public ModelCategory getModelCategory() {
        return this.modelCategory;
    }

    /**
     * @param modelCategory
     *            null.
     */
    public void setModelCategory(ModelCategory modelCategory) {
        this.modelCategory = modelCategory;
    }

    /** @return null. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "INSTANCE_ID", length = 64)
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @param instanceId
     *            null.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /** @return null. */
    @Column(name = "CATEGORY", length = 50)
    public String getCategory() {
        return this.category;
    }

    /**
     * @param category
     *            null.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /** @return null. */
    @Column(name = "PROCESS_ID", length = 64)
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @param processId
     *            null.
     */
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    /** @return null. */
    @Column(name = "PROCESS_NAME", length = 50)
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @param processName
     *            null.
     */
    public void setProcessName(String processName) {
        this.processName = processName;
    }

    /** @return null. */
    @Column(name = "PROCESS_KEY", length = 50)
    public String getProcessKey() {
        return this.processKey;
    }

    /**
     * @param processKey
     *            null.
     */
    public void setProcessKey(String processKey) {
        this.processKey = processKey;
    }

    /** @return null. */
    @Column(name = "PROCESS_VERSION")
    public Integer getProcessVersion() {
        return this.processVersion;
    }

    /**
     * @param processVersion
     *            null.
     */
    public void setProcessVersion(Integer processVersion) {
        this.processVersion = processVersion;
    }

    /** @return null. */
    @Column(name = "INITIATOR", length = 64)
    public String getInitiator() {
        return this.initiator;
    }

    /**
     * @param initiator
     *            null.
     */
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    /** @return null. */
    @Column(name = "INITIATOR_DEPT", length = 50)
    public String getInitiatorDept() {
        return this.initiatorDept;
    }

    /**
     * @param initiatorDept
     *            null.
     */
    public void setInitiatorDept(String initiatorDept) {
        this.initiatorDept = initiatorDept;
    }

    /** @return null. */
    @Column(name = "APPLICANT", length = 64)
    public String getApplicant() {
        return this.applicant;
    }

    /**
     * @param applicant
     *            null.
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    /** @return null. */
    @Column(name = "APPLICANT_DEPT", length = 50)
    public String getApplicantDept() {
        return this.applicantDept;
    }

    /**
     * @param applicantDept
     *            null.
     */
    public void setApplicantDept(String applicantDept) {
        this.applicantDept = applicantDept;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", length = 26)
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            null.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME", length = 26)
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     *            null.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "DELETE_REASON", length = 200)
    public String getDeleteReason() {
        return this.deleteReason;
    }

    /**
     * @param deleteReason
     *            null.
     */
    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

    /** @return null. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "modelBase")
    public Set<ModelRow> getModelRows() {
        return this.modelRows;
    }

    /**
     * @param modelRows
     *            .
     */
    public void setModelRows(Set<ModelRow> modelRows) {
        this.modelRows = modelRows;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "modelBase")
    public Set<ModelBase> getModelBases() {
        return this.modelBases;
    }

    /**
     * @param modelBases
     *            .
     */
    public void setModelBases(Set<ModelBase> modelBases) {
        this.modelBases = modelBases;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "modelBase")
    public Set<ModelItem> getModelItems() {
        return this.modelItems;
    }

    /**
     * @param modelItems
     *            .
     */
    public void setModelItems(Set<ModelItem> modelItems) {
        this.modelItems = modelItems;
    }
}
