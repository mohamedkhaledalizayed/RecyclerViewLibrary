package smile.khaled.mohamed.recyclerviewlibrary;

public class Recent {

    public Recent() {
    }

    public Recent(String id, String photo, String views) {
        this.id = id;
        this.photo = photo;
        this.views = views;
    }

    String id;
    String photo;
    String views;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }
}
