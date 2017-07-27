package model;

/**
 * Created by Fresher on 27/07/2017.
 */
public abstract class AbstractModel {

    private long lastModified;

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    abstract void update();

    abstract boolean save();

}
