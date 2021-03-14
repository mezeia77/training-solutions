package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {

    private List<Photo> photos = new ArrayList<>();

    public PhotoCollection() {
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void addPhoto(String...photos){
        for (String s : photos) {
            this.photos.add(new Photo(s));
        }
    }

    @Override
    public String toString() {
        return "PhotoCollection{" +
                "photos=" + photos +
                '}';
    }

    public int numberOfStars() {
        int result = 0;
        for (Photo photo : photos) {
        result += photo.getQuality().getNumber();
        }
        return result;
    }

    public void starPhoto(String s, Quality oneStar) {
        boolean found = false;
        for (Photo photo : photos) {
            if(photo.getName().equals(s)){
                photo.setQuality(oneStar);
                found = true;
            }
        }
        if(!found){
            throw new PhotoNotFoundException("Photo not found");
        }
    }
}
