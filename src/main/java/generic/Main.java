package generic;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Picture> pictureList = ImmutableList.of(new Picture(1), new Picture(2));
        Map<Long, List<Picture>> resource = new GenericResource().getResource(pictureList);
    }
}
