public class GroupStudent implements Comparable<GroupStudent>{
    
    private int groupNumber;
    private String firstName;
    private String lastName;

    public GroupStudent(int groupNumber, String firstName, String lastName) {
        this.groupNumber = groupNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(GroupStudent o){
        // сортировка по имени
        // int fname = this.firstName.compareTo(o.firstName);
        // if(fname != 0){
        //     return fname;
        // }
        return this.groupNumber - o.groupNumber;
    }

    @Override
    public String toString(){
        return "\nНомер группы: " + groupNumber + ", имя: " + firstName + "\t" + ", фамилия: " + lastName;
    }
}
