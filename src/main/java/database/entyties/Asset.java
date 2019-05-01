package database.entyties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asset {
    private int idAsset;
    private String name;
    private byte inspected;
    private byte operative;
    private int positionIdPosition;
    private int assetTypeIdAssetType;

    @Id
    @Column(name = "idAsset", nullable = false)
    public int getIdAsset() {
        return idAsset;
    }

    public void setIdAsset(int idAsset) {
        this.idAsset = idAsset;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "inspected", nullable = false)
    public byte getInspected() {
        return inspected;
    }

    public void setInspected(byte inspected) {
        this.inspected = inspected;
    }

    @Basic
    @Column(name = "operative", nullable = false)
    public byte getOperative() {
        return operative;
    }

    public void setOperative(byte operative) {
        this.operative = operative;
    }

    @Basic
    @Column(name = "Position_idPosition", nullable = false)
    public int getPositionIdPosition() {
        return positionIdPosition;
    }

    public void setPositionIdPosition(int positionIdPosition) {
        this.positionIdPosition = positionIdPosition;
    }

    @Basic
    @Column(name = "AssetType_idAssetType", nullable = false)
    public int getAssetTypeIdAssetType() {
        return assetTypeIdAssetType;
    }

    public void setAssetTypeIdAssetType(int assetTypeIdAssetType) {
        this.assetTypeIdAssetType = assetTypeIdAssetType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asset asset = (Asset) o;

        if (idAsset != asset.idAsset) return false;
        if (inspected != asset.inspected) return false;
        if (operative != asset.operative) return false;
        if (positionIdPosition != asset.positionIdPosition) return false;
        if (assetTypeIdAssetType != asset.assetTypeIdAssetType) return false;
        if (name != null ? !name.equals(asset.name) : asset.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAsset;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) inspected;
        result = 31 * result + (int) operative;
        result = 31 * result + positionIdPosition;
        result = 31 * result + assetTypeIdAssetType;
        return result;
    }
}
