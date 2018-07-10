package com.nfine.domain.sqlserver.nfinebase.dbo;

import java.util.Date;

public class SysArea {
    private String f_Id;

    private String f_ParentId;

    private Integer f_Layers;

    private String f_EnCode;

    private String f_FullName;

    private String f_SimpleSpelling;

    private Integer f_SortCode;

    private Boolean f_DeleteMark;

    private Boolean f_EnabledMark;

    private String f_Description;

    private Date f_CreatorTime;

    private String f_CreatorUserId;

    private Date f_LastModifyTime;

    private String f_LastModifyUserId;

    private Date f_DeleteTime;

    private String f_DeleteUserId;

    public String getF_Id() {
        return f_Id;
    }

    public void setF_Id(String f_Id) {
        this.f_Id = f_Id == null ? null : f_Id.trim();
    }

    public String getF_ParentId() {
        return f_ParentId;
    }

    public void setF_ParentId(String f_ParentId) {
        this.f_ParentId = f_ParentId == null ? null : f_ParentId.trim();
    }

    public Integer getF_Layers() {
        return f_Layers;
    }

    public void setF_Layers(Integer f_Layers) {
        this.f_Layers = f_Layers;
    }

    public String getF_EnCode() {
        return f_EnCode;
    }

    public void setF_EnCode(String f_EnCode) {
        this.f_EnCode = f_EnCode == null ? null : f_EnCode.trim();
    }

    public String getF_FullName() {
        return f_FullName;
    }

    public void setF_FullName(String f_FullName) {
        this.f_FullName = f_FullName == null ? null : f_FullName.trim();
    }

    public String getF_SimpleSpelling() {
        return f_SimpleSpelling;
    }

    public void setF_SimpleSpelling(String f_SimpleSpelling) {
        this.f_SimpleSpelling = f_SimpleSpelling == null ? null : f_SimpleSpelling.trim();
    }

    public Integer getF_SortCode() {
        return f_SortCode;
    }

    public void setF_SortCode(Integer f_SortCode) {
        this.f_SortCode = f_SortCode;
    }

    public Boolean getF_DeleteMark() {
        return f_DeleteMark;
    }

    public void setF_DeleteMark(Boolean f_DeleteMark) {
        this.f_DeleteMark = f_DeleteMark;
    }

    public Boolean getF_EnabledMark() {
        return f_EnabledMark;
    }

    public void setF_EnabledMark(Boolean f_EnabledMark) {
        this.f_EnabledMark = f_EnabledMark;
    }

    public String getF_Description() {
        return f_Description;
    }

    public void setF_Description(String f_Description) {
        this.f_Description = f_Description == null ? null : f_Description.trim();
    }

    public Date getF_CreatorTime() {
        return f_CreatorTime;
    }

    public void setF_CreatorTime(Date f_CreatorTime) {
        this.f_CreatorTime = f_CreatorTime;
    }

    public String getF_CreatorUserId() {
        return f_CreatorUserId;
    }

    public void setF_CreatorUserId(String f_CreatorUserId) {
        this.f_CreatorUserId = f_CreatorUserId == null ? null : f_CreatorUserId.trim();
    }

    public Date getF_LastModifyTime() {
        return f_LastModifyTime;
    }

    public void setF_LastModifyTime(Date f_LastModifyTime) {
        this.f_LastModifyTime = f_LastModifyTime;
    }

    public String getF_LastModifyUserId() {
        return f_LastModifyUserId;
    }

    public void setF_LastModifyUserId(String f_LastModifyUserId) {
        this.f_LastModifyUserId = f_LastModifyUserId == null ? null : f_LastModifyUserId.trim();
    }

    public Date getF_DeleteTime() {
        return f_DeleteTime;
    }

    public void setF_DeleteTime(Date f_DeleteTime) {
        this.f_DeleteTime = f_DeleteTime;
    }

    public String getF_DeleteUserId() {
        return f_DeleteUserId;
    }

    public void setF_DeleteUserId(String f_DeleteUserId) {
        this.f_DeleteUserId = f_DeleteUserId == null ? null : f_DeleteUserId.trim();
    }
}