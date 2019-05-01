package database.entyties;

import javax.persistence.*;

@Entity
@Table(name = "MultimediaFile_has_Asset", schema = "swtpj", catalog = "")
@IdClass(MultimediaFileHasAssetPK.class)
public class MultimediaFileHasAsset {
    private int multimediaFileIdMultimediaFile;
    private int assetIdAsset;

    @Id
    @Column(name = "MultimediaFile_idMultimediaFile", nullable = false)
    public int getMultimediaFileIdMultimediaFile() {
        return multimediaFileIdMultimediaFile;
    }

    public void setMultimediaFileIdMultimediaFile(int multimediaFileIdMultimediaFile) {
        this.multimediaFileIdMultimediaFile = multimediaFileIdMultimediaFile;
    }

    @Id
    @Column(name = "Asset_idAsset", nullable = false)
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

        MultimediaFileHasAsset that = (MultimediaFileHasAsset) o;

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
