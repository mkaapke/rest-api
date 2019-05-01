package database.entyties;

import javax.persistence.*;

@Entity
@Table(name = "MultimediaFile_has_AssetType", schema = "swtpj", catalog = "")
@IdClass(MultimediaFileHasAssetTypePK.class)
public class MultimediaFileHasAssetType {
    private int multimediaFileIdMultimediaFile;
    private int assetTypeIdAssetType;

    @Id
    @Column(name = "MultimediaFile_idMultimediaFile", nullable = false)
    public int getMultimediaFileIdMultimediaFile() {
        return multimediaFileIdMultimediaFile;
    }

    public void setMultimediaFileIdMultimediaFile(int multimediaFileIdMultimediaFile) {
        this.multimediaFileIdMultimediaFile = multimediaFileIdMultimediaFile;
    }

    @Id
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

        MultimediaFileHasAssetType that = (MultimediaFileHasAssetType) o;

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
