package database.entyties;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AssetTypeHasAssetTypePK implements Serializable {
    private int assetTypeIdAssetType;
    private int assetTypeIdAssetType1;

    @Column(name = "AssetType_idAssetType", nullable = false)
    @Id
    public int getAssetTypeIdAssetType() {
        return assetTypeIdAssetType;
    }

    public void setAssetTypeIdAssetType(int assetTypeIdAssetType) {
        this.assetTypeIdAssetType = assetTypeIdAssetType;
    }

    @Column(name = "AssetType_idAssetType1", nullable = false)
    @Id
    public int getAssetTypeIdAssetType1() {
        return assetTypeIdAssetType1;
    }

    public void setAssetTypeIdAssetType1(int assetTypeIdAssetType1) {
        this.assetTypeIdAssetType1 = assetTypeIdAssetType1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetTypeHasAssetTypePK that = (AssetTypeHasAssetTypePK) o;

        if (assetTypeIdAssetType != that.assetTypeIdAssetType) return false;
        if (assetTypeIdAssetType1 != that.assetTypeIdAssetType1) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = assetTypeIdAssetType;
        result = 31 * result + assetTypeIdAssetType1;
        return result;
    }
}
