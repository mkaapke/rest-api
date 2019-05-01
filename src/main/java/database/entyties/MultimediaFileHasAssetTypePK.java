package database.entyties;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MultimediaFileHasAssetTypePK implements Serializable {
    private int multimediaFileIdMultimediaFile;
    private int assetTypeIdAssetType;

    @Column(name = "MultimediaFile_idMultimediaFile", nullable = false)
    @Id
    public int getMultimediaFileIdMultimediaFile() {
        return multimediaFileIdMultimediaFile;
    }

    public void setMultimediaFileIdMultimediaFile(int multimediaFileIdMultimediaFile) {
        this.multimediaFileIdMultimediaFile = multimediaFileIdMultimediaFile;
    }

    @Column(name = "AssetType_idAssetType", nullable = false)
    @Id
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

        MultimediaFileHasAssetTypePK that = (MultimediaFileHasAssetTypePK) o;

        if (multimediaFileIdMultimediaFile != that.multimediaFileIdMultimediaFile) return false;
        if (assetTypeIdAssetType != that.assetTypeIdAssetType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = multimediaFileIdMultimediaFile;
        result = 31 * result + assetTypeIdAssetType;
        return result;
    }
}
