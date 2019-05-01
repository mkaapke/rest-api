package database.entyties;

import javax.persistence.*;

@Entity
@Table(name = "AssetType_has_AssetType", schema = "swtpj", catalog = "")
@IdClass(AssetTypeHasAssetTypePK.class)
public class AssetTypeHasAssetType {
    private int assetTypeIdAssetType;
    private int assetTypeIdAssetType1;

    @Id
    @Column(name = "AssetType_idAssetType", nullable = false)
    public int getAssetTypeIdAssetType() {
        return assetTypeIdAssetType;
    }

    public void setAssetTypeIdAssetType(int assetTypeIdAssetType) {
        this.assetTypeIdAssetType = assetTypeIdAssetType;
    }

    @Id
    @Column(name = "AssetType_idAssetType1", nullable = false)
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

        AssetTypeHasAssetType that = (AssetTypeHasAssetType) o;

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
