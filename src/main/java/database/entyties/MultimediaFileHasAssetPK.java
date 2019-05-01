package database.entyties;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MultimediaFileHasAssetPK implements Serializable {
    private int multimediaFileIdMultimediaFile;
    private int assetIdAsset;

    @Column(name = "MultimediaFile_idMultimediaFile", nullable = false)
    @Id
    public int getMultimediaFileIdMultimediaFile() {
        return multimediaFileIdMultimediaFile;
    }

    public void setMultimediaFileIdMultimediaFile(int multimediaFileIdMultimediaFile) {
        this.multimediaFileIdMultimediaFile = multimediaFileIdMultimediaFile;
    }

    @Column(name = "Asset_idAsset", nullable = false)
    @Id
    public int getAssetIdAsset() {
        return assetIdAsset;
    }

    public void setAssetIdAsset(int assetIdAsset) {
        this.assetIdAsset = assetIdAsset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MultimediaFileHasAssetPK that = (MultimediaFileHasAssetPK) o;

        if (multimediaFileIdMultimediaFile != that.multimediaFileIdMultimediaFile) return false;
        if (assetIdAsset != that.assetIdAsset) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = multimediaFileIdMultimediaFile;
        result = 31 * result + assetIdAsset;
        return result;
    }
}
