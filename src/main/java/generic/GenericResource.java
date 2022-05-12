package generic;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenericResource {

    /**
     * 范型方法
     */
    public <T extends Resource> Map<Long, List<T>> getResource(List<T> list){
        return list.stream()
                .collect(Collectors.groupingBy(Resource::getId));
    }

}
