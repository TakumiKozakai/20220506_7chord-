package com.sevenchord.entity.base;

/**
 * Entityの共通情報を管理します.
 */
public class BaseEntity {

    /**
     * 登録日時.
     */
    private String createdAt;
    /**
     * 更新日時.
     */
    private String updatedAt;
    /**
     * 削除フラグ.
     */
    private String isDeleted;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "BaseEntity [createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", isDeleted="
                + isDeleted + "]";
    }
}
