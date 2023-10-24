package folder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Way implements Iterable<GroupStudent>{
    
    List<GroupStudent> list = new ArrayList<>();

    @Override
    public Iterator<GroupStudent> iterator(){
        return new Iterator<GroupStudent>() {
            int index = 0;
            @Override
            public boolean hasNext(){
                return index < list.size();
            }
            @Override
            public GroupStudent next(){
                return list.get(index++);
            }
        };
    }

    public List<GroupStudent> toList(){
        List<GroupStudent> result = new ArrayList<>();
        for(GroupStudent groupStudent : this){
            result.add(groupStudent);
        }
        return result;
    }

    public void addLearningGroups(GroupStudent student){
        list.add(student);
    }
}
