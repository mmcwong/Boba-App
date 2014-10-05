package data;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Business {
    public final String name;
    public final String phone;
    public final String address;
    public final Bitmap image;
    public final Bitmap rating;
    public final String businessId;

    public Business(String businessId,
                    String name,
                    String phone,
                    String address,
                    String strImage,
                    String strRating) {
        this.businessId = businessId;
        this.name = name;
        this.address = address;
        this.phone = formatPhone(phone);

        image = loadImage(strImage);
        rating = loadImage(strRating);
    }

    private Bitmap loadImage(String url) {
        Bitmap loadedImage = null;
        try {
            loadedImage = BitmapFactory.decodeStream(new URL(url).openStream());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return loadedImage;
        }
    }

    private String formatPhone(String phone) {
        if (phone.length() != 10)
            return phone;

        return "(" + phone.substring(0, 3) + ") "
                + phone.substring(3, 6)
                + " - " + phone.substring(6);
    }
}
