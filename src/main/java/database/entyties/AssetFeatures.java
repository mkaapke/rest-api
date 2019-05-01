package database.entyties;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssetFeatures {
    private int idAssetFeatures;
    private String featureName;
    private int assetTypeIdAssetType;

    @Id
    @Column(name = "idAssetFeatures", nullable = false)
    public int getIdAssetFeatures() {
        return idAssetFeatures;
    }

    public void setIdAssetFeatures(int idAssetFeatures) {
        this.idAssetFeatures = idAssetFeatures;
    }

    @Basic
    @Column(name = "featureName", nullable = true, length = 45)
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
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

        AssetFeatures that = (AssetFeatures) o;

        if (idAssetFeatures != that.idAssetFeatures) return false;
        if (assetTypeIdAssetType != that.assetTypeIdAssetType) return false;
        if (featureName != null ? !featureName.equals(that.featureName) : that.featureName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAssetFeatures;
        result = 31 * result + (featureName != null ? featureName.hashCode() : 0);
        result = 31 * result + assetTypeIdAssetType;
        return result;
    }
}
