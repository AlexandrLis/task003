package folder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Way way = new Way();
        way.addLearningGroups(new GroupStudent(3, "Виктор", "Кузубов"));
        way.addLearningGroups(new GroupStudent(2, "Петр", "Светлов"));
        way.addLearningGroups(new GroupStudent(3, "Николай", "Веселов"));
        way.addLearningGroups(new GroupStudent(1, "Михаил", "Станиславский"));
        way.addLearningGroups(new GroupStudent(2, "Сергей", "Решето"));
        way.addLearningGroups(new GroupStudent(1, "Алексей", "Голованов"));
        way.addLearningGroups(new GroupStudent(3, "Михаил", "Петров"));
        way.addLearningGroups(new GroupStudent(1, "Кристина", "Михайлова"));
        for (GroupStudent groupStudent : way) {
            System.out.println(groupStudent);
        }

        System.out.println("//----------------------------");
        List<GroupStudent> group = way.toList();
        Collections.sort(group);
        System.out.println(group);
    }
}
